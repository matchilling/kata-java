pipeline {
    agent {
        docker {
            image 'maven:3.6.2-jdk-11-slim'
            args '-v $HOME/.m2:/root/.m2'
        }
    }
    stages {
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}