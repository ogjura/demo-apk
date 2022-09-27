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

        
          

 def uploadSpec = """{
            "files": [
                {
                     "pattern" : "android/app/build/outputs/apk/release/app-release.apk",
                     "target" : "react-generic-local/"
                }
            ]
        }"""
    stage ("Upload file") {
       
        steps{
        
        rtServer.upload spec: uploadSpec
    }
}
   
    
    }
}