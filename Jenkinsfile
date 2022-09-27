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


        

        stage('Upload'){
            steps{
                rtUpload(
                        serverId: "artifactory",
                        spec: '''{
                                "files" : [
                                    {
                                    "pattern" : "/android/app/build/outputs/apk/release/app-release.apk",
                                    "target" : "repo/",
                                    
                                    }
                                ]
                                
                        }'''
                    )
            }
    }


    
    }

   
    
   
}