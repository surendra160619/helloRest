ppipeline {
    agent any

    stages {
      
        stage('Build') {
            steps {
                sh' mvn -DskipTests clean packages '
            }
        }
  
   stage('test') {
            steps {
                echo "test"
            }
        }
    }
}
