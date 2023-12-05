pipeline {
	agent any

	environment {
		mavenHome = tool 'MAVEN_HOME'
	}

	tools {
		jdk 'JAVA_HOME'
	}

	stages {

		stage('Build'){
			steps {
				bat "mvn clean install -DskipTests"
			}
		}

		stage('Test'){
			steps{
				bat "mvn test"
			}
		}

		stage('Deploy') {
			steps {
			    bat "mvn jar:jar deploy:deploy"
			}
		}
	}
}