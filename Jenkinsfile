pipeline {
    agent any
    stages {
      
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
