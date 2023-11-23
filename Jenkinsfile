pipeline {
    agent any
        tools {
        maven 'maven3'
    }
    stages {
        stage('Clone sources') {
            steps {
                git 'https://github.com/surendra160619/helloRest.git'
            }
        }

        stage('Build') {
            steps {
                 sh "mvn package"
            }
        }
  
   stage('test') {
            steps {
                echo "test"
            }
        }
    }
}
