pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'mvn clean package -Dmaven.test.failure.ignore=true -DskipTests=true'
      }
    }
  }
  tools {
    maven 'Maven 3.3'
    jdk 'JDK 1.8'
  }
}
