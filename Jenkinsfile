pipeline {
    agent any

    stages {
        stage('Clean') {
            steps {
                sh '/home/gjurao/Desktop/android-jenkk/jenkins_android/android/gradlew clean'
            }
        }
        stage('Build') {
            steps {
                sh '/home/gjurao/Desktop/android-jenkk/jenkins_android/android/gradlew buildDebug'
            }
        }
        stage('Unit Test') {
            steps {
                sh '/home/gjurao/Desktop/android-jenkk/jenkins_android//androidgradlew test'
            }
        }
        stage('UI Test') {
            steps {
                sh '/home/gjurao/Desktop/android-jenkk/jenkins_android/android/gradlew connectedAndroidTest'
            }
        }
        stage('Assemble Apk') {
            steps {
                sh '/home/gjurao/Desktop/android-jenkk/jenkins_android/android/gradlew assembleDebug'
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