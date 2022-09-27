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

        stage('up'){
            steps{
                rtUpload(
                        serverId: 'artifactory',
                        spec: '''{
                                "files" : [
                                    {
                                    "pattern" : "**/*-release.apk",
                                    "target" : "react-generic-local/theapk.apk"
                                    }
                                ]
                                
                        }'''
                       
                    )
        }
        }
  
          




   
    
    }
}