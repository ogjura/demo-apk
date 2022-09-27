pipeline {

    def server = Artifactory.server 'artifactory'
    def uploadSpec
server.upload(uploadSpec)
    
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

        
          

 
    stage ("Upload file") {
        steps(
            uploadSpec = """{
    "files": [
    {
    "pattern": "**/target/*.war",
    "target": "releases/${APP_REPO}/${version.trim()}/"
    }
    ]}"""
    server.upload(uploadSpec)
    )
}
   
    
    }
}