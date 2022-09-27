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
                        buildName: JOB_NAME,
                        buildNumber: BUILD_NUMBER,
                        serverId: SERVER_ID,
                        spec: '''{
                                "files" : [
                                    "pattern" : "/home/gjurao/Desktop/android-jenkk/jenkins_android/android/app/build/outputs/apk/release/app-release.apk",
                                    "target" : "repo/",
                                    "recursive" : "false"
                                ]
                        }'''
                    )
            }
    }


    
    }

   
    
   
}