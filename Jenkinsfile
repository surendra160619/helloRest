ppipeline {
    agent any

    stages {
      
        stage('Build') {
            steps {
                sh "./mvnw clean install -DskipTests"
            }
        }
  
   stage('test') {
            steps {
                echo "test"
            }
        }
    }
}
