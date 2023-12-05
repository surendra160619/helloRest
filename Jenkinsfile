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
               sh 'mvn clean install -DskipTests'
            }
        }
        stage('Test') { 
            steps {
               sh 'mvn test --fail-never'
            }
        }
        stage('Deploy') { 
            steps {
                echo "Deploying" 
            }
        }
    }
}