pipeline {
    agent any

    stages {
      
        stage('Build') {
            steps {
                sh' mvn clean install'
            }
        }
  
   stage('test') {
            steps {
                echo "test"
            }
        }
    }
}
