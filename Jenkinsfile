pipeline {
    agent any

    stages {
        stage('Clean') {
            steps {
                sh '/var/lib/jenkins/workspace/android-jenk_master/android/gradlew clean'
            }
        }
        stage('Build') {
            steps {
                sh '/var/lib/jenkins/workspace/android-jenk_master/android/gradlew buildDebug'
            }
        }
        stage('Unit Test') {
            steps {
                sh '/var/lib/jenkins/workspace/android-jenk_master/android/gradlew test'
            }
        }
        stage('UI Test') {
            steps {
                sh '/var/lib/jenkins/workspace/android-jenk_master/android/gradlew connectedAndroidTest'
            }
        }
        stage('Assemble Apk') {
            steps {
                sh '/var/lib/jenkins/workspace/android-jenk_master/android/gradlew assembleDebug'
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