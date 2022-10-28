package io.abhishek;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DockerPersistanceDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerPersistanceDemoApplication.class, args);
	}
	
//	@Bean
//	@ConfigurationProperties(prefix = "spring.data")
//	public DataSource getDataSource() { 
//	    DataSourceBuilder<DataSource> dataSourceBuilder = (DataSourceBuilder<DataSource>) DataSourceBuilder.create(); 
//	    dataSourceBuilder.username("sql6526212"); 
//	    dataSourceBuilder.password("NxWCIz56MA"); 
//	    return DataSourceBuilder.create().build(); 
//	}
	

}
