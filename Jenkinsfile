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

stage('upload'){
    steps{
rtServer (
    id: 'artifactory',
    url: 'http://locakhost:8082/artifactory',
    // If you're using username and password:
    username: 'admin',
    password: 'Mirzen.6571',
   
)

rtUpload (
    serverId: 'artifactory',
    spec: '''{
          "files": [
            {
              "pattern": "**/*-release.apk",
              "target": "artifactory/repo/"
            }
         ]
    }''',
 
)
}
}
        
          

 
    
   
    
    }
}