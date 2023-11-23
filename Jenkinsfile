pipeline {
    agent any
    stages {
      
        stage('Build') {
            steps {
                sh'mvn clean package'
            }
        }
  
   stage('test') {
            steps {
                echo "test"
            }
        }
    }
}
