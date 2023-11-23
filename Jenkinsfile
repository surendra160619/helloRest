pipeline {
    agent any


    stages {
        stage("Clone the project") {
		    git branch: 'main', url: 'https://github.com/surendra160619/helloRest.git'
		  }
      
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
