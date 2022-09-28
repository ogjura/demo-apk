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
            post {
                success{
                    archiveArtifacts '**/app-release.apk'
                }
            }
        }


        
          

 
    
   
    
    }
}