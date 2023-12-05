pipeline {
    agent any 
    environment {
		mavenHome = tool 'jankins-maven'
	}
	
	tools {
		jdk 'java-17'
	}
    stages {
        stage('Build') { 
            steps {
                echo "Building" 
            }
        }
        stage('Test') { 
            steps {
                echo "Testing" 
            }
        }
        stage('Deploy') { 
            steps {
                echo "Deploying" 
            }
        }
    }
}