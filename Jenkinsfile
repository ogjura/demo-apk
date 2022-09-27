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

        
          

 
    stage ("Upload file") {
        steps(
    rtUpload (
    serverId: 'artifactory',
    project: 'repo',
    spec: '''{
          "files": [
            {
              "pattern": "**/*-release.apk",
              "target": "repo/"
            }
         ]
    }'''
    )
    )
}
   
    
    }
}