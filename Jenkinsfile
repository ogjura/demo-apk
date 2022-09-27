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
                rtUpload (
                    buildName: JOB_NAME,
                    buildNumber: BUILD_NUMBER,
                    serverId: 'artifactory', // Obtain an Artifactory server instance, defined in Jenkins --> Manage:

                    spec: """{
                              "files": [
                                 {
                                  "pattern": "/app/build/outputs/apk/release/app-release.apk",
                                  "target": "repo/therelease.apk",
                                  "recursive": "false"
                                } 
                             ]
                        }"""   
                    )
            }
        }
        
          

 
    
   
    
    }
}