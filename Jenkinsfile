pipeline {
    agent any

    stages {
        stage('Checkout GITHUB') {
            steps {
                git 'https://github.com/milinx/java-ci-cd-app.git'
            }
        }

        stage('Test using JUNIT testing') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Build using Maven') {
            steps {
                // Combines compile and package as per standard Maven builds
                sh 'mvn clean package'
            }
        }

        stage('Create Docker image') {
            steps {
                sh 'docker build -t milinxgenix/java-app:latest .'
            }
        }

        stage('Push to Docker Hub') {
            steps {
                // Ensure you have 'docker-hub-credentials' set up in Jenkins
                withCredentials([usernamePassword(credentialsId: 'docker-hub-credentials', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
                    sh "echo \$PASS | docker login -u \$USER --password-stdin"
                    sh "docker push milinxgenix/java-app:latest"
                }
            }
        }
    }
}



