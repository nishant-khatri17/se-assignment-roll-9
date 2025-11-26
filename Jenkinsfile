pipeline {
    agent any

    environment {
        // Naming repo as per roll number instruction
        DOCKER_IMAGE = 'nishantkhatri17/roll-number-9'
        REGISTRY_CREDENTIALS_ID = 'dockerhub-creds'
        // ADD THIS LINE BELOW to tell Jenkins where Docker is on your Mac:
        PATH = "/opt/homebrew/bin:/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin:$PATH"
    }

    stages {
        stage('Checkout') {
            steps {
                // Jenkins automatically pulls code from SCM based on configuration
                checkout scm
            }
        }

        stage('Build Code') {
            steps {
                echo 'Compiling Java Code...'
                // Compiles the main app
                sh 'javac TodoApp.java'
            }
        }

        stage('Test Code') {
            steps {
                echo 'Running Tests...'
                // Compiles the test class (linking to the main class)
                sh 'javac -cp . TestTodoApp.java'
                // Runs the test class. If it throws an exception, the pipeline fails.
                sh 'java -cp . TestTodoApp'
            }
        }

        stage('Build Docker Image') {
            steps {
                echo 'Building Docker Image...'
                script {
                    dockerImage = docker.build("${DOCKER_IMAGE}:${env.BUILD_NUMBER}")
                }
            }
        }

        stage('Push to DockerHub') {
            steps {
                echo 'Pushing to DockerHub...'
                script {
                    docker.withRegistry('', REGISTRY_CREDENTIALS_ID) {
                        dockerImage.push()
                        dockerImage.push('latest')
                    }
                }
            }
        }
    }
}
