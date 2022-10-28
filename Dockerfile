FROM maven:3.6.0-jdk-8-alpine AS maven_builder
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

FROM eclipse-temurin:8-jre-alpine AS builder 
WORKDIR /home/app/extracted
COPY --from=maven_builder /home/app/target/*.jar ./app.jar
RUN java -Djarmode=layertools -jar app.jar extract

FROM eclipse-temurin:8-jre-alpine 
WORKDIR /home/app/application
COPY --from=builder home/app/extracted/snapshot-dependencies ./
COPY --from=builder home/app/extracted/spring-boot-loader ./
COPY --from=builder home/app/extracted/dependencies ./
COPY --from=builder home/app/extracted/application ./
EXPOSE 8080
ENTRYPOINT [ "java", "org.springframework.boot.loader.JarLauncher"] 