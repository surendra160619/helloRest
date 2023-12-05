pipeline {
    agent any 
    environment {
		mavenHome = tool 'jankins-maven'
	}
	
	tools {
		jdk 'JAVA_HOME'
	}
    stages {
        stage('Build') { 
            steps {
                sh 'mvn clean compile'
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