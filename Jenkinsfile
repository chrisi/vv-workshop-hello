pipeline {
  agent any
  stages {
    stage('Initialize') {
      steps {
        sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
      }
    }
    stage('Build') {
      steps {
        sh 'mvn clean package -Dmaven.test.failure.ignore=true -DskipTests=true'
      }
      post {
        success {
          junit 'target/surefire-reports/**/*.xml'
          
        }
        
      }
    }
  }
  tools {
    maven 'Maven 3.3'
    jdk 'JDK 1.8'
  }
}