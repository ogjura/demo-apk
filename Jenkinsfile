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

def artiServer = Artifactory.server('artifactory')
    

    def uploadSpec = """{
      "files": [
        {
          "pattern": "**/*-release.apk",
          "target": "/repo",
          
        }

     ]
    }"""
    def uploadBuildInfo = artiServer.upload spec: uploadSpec
        



    
    }

   
    
   
}