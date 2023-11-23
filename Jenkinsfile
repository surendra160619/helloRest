pipeline {
    agent any
    stages {
      
        stage('Build') {
            steps {
                 sh 'make' 
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true 
            }
        }
  
   stage('test') {
            steps {
                echo "test"
            }
        }
    }
}
