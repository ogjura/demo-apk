pipeline {
    agent any

    stages {
        stage('Clean') {
            steps {
                sh './android/gradlew clean'
            }
        }
        stage('Build') {
            steps {
                sh './android/gradlew buildDebug'
            }
        }
        stage('Unit Test') {
            steps {
                sh './android/gradlew test'
            }
        }
        stage('UI Test') {
            steps {
                sh './android/gradlew connectedAndroidTest'
            }
        }
        stage('Assemble Apk') {
            steps {
                sh './android/gradlew assembleDebug'
            }
        }
    }
    
    post {
         always{
              archiveArtifacts artifacts: '**/*-debug.apk',
              onlyIfSuccessful: true
         }
    }
}