pipeline {


    
    agent any

    stages {
        stage('Clean') {
            steps {
                sh 'pwd'
                sh 'cd android'
                sh 'pwd'
                sh './gradlew clean'
            }
        }
        stage('Build') {
            steps {
                sh 'pwd'
                sh 'cd android'
                sh 'pwd'
                sh './gradlew build'
            }
        }

stage ('Upload') {
            steps {
                 sh '''#!/bin/bash
                 mv /android/app/build/outputs/apk/release/app-release.apk /var/lib/jenkins/workspace/android-jenk_master/android/app
                 '''
            }
        }
        
          

 
    
   
    
    }
}