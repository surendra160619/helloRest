pipeline {
    agent any
    
    tools {
        maven 'Maven 3.1.5'
    }
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
