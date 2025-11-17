pipeline {
    agent any

    environment {
        GIT_REPO = 'https://github.com/pavani-07-red/taskorganizationmag.git'
        BRANCH = 'main'
    }

    stages {
        stage('Checkout') {
            steps {
                echo "Cloning repository..."
                git branch: "${BRANCH}", url: "${GIT_REPO}"
            }
        }

        stage('Build') {
            steps {
                echo "Building Maven project..."
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                echo "Running Maven tests..."
                sh 'mvn test'
            }
        }
    }

    post {
        success {
            echo "Build and tests completed successfully!"
        }
        failure {
            echo "Build failed. Check the logs!"
        }
    }
}
