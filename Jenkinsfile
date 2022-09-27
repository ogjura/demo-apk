pipeline {
    agent any

    stages {
        stage('Clean') {
            steps {
                sh './jenkins_android/android/gradlew clean'
            }
        }
        stage('Build') {
            steps {
                sh './jenkins_android/android/gradlew buildDebug'
            }
        }
        stage('Unit Test') {
            steps {
                sh './jenkins_android/android/gradlew test'
            }
        }
        stage('UI Test') {
            steps {
                sh './jenkins_android/android/gradlew connectedAndroidTest'
            }
        }
        stage('Assemble Apk') {
            steps {
                sh './jenkins_android/android/gradlew assembleDebug'
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