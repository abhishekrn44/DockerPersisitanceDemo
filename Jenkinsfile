pipeline {
    agent any
    tools{
        maven 'maven-3.8.6'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], 
                userRemoteConfigs: [[url: 'https://github.com/abhishekrn44/DockerPersistanceDemo']]])
                sh 'mvn clean package'
            }
        }
        stage('Build Docker Image'){
            steps{
                script{
                    sh 'docker build -t prodimg .'
                }
            }
        }
        stage('Deploy'){
            steps {
                sh "docker run --rm -p8080:8080 -d prodimg"
            }
    }
  }
}