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
                 sh '''#!/bin/bash
                 pwd
                 curl -H "Authorization: Bearer eyJ2ZXIiOiIyIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYiLCJraWQiOiJ4VkZTNDFkRXNsRDBQdjktU1lMUnlKa2o2Z0hUYjJWZURGUF9BZHFSY0JZIn0.eyJleHQiOiJ7XCJyZXZvY2FibGVcIjpcInRydWVcIn0iLCJzdWIiOiJqZmFjQDAxZ2RqNmZ4Y21mNjJ0MTAzbmRjdzcxcDlxXC91c2Vyc1wvYWRtaW4iLCJzY3AiOiJhcHBsaWVkLXBlcm1pc3Npb25zXC9hZG1pbiIsImF1ZCI6IipAKiIsImlzcyI6ImpmZmVAMDAwIiwiZXhwIjoxNjk1ODIwNjk1LCJpYXQiOjE2NjQyODQ2OTUsImp0aSI6ImY4YWViYWZhLThkMzQtNGZlNy04MjllLTE5MzMxYzg1MjA1NyJ9.P8pNypLmQo0gGnHuMyupxZd2uQtEP5j2oui_1QohOZjcMO3BQqdc0hyH0x3vXOhekyIiSSJG_Ey1wRDhq6n-ZHMudQgbclCrUf3OpX-VSGvBn5F9euNfemWdRZ9lQcxyzqlqchFOFMgBVo8B2EistPUAw3CVIfjK_fusWmPKHuTtsuEWf3VCmaOcxrT42XzzMPfXGJ4ncGko4N7jb-Be_00OSPL-SJYTdgPJ39bVXkPpaIE4k-HRAVAIuwjy3nZf31YgtEpLTGF15fEqvzaNreSdgwIN1s8nyEbWhoNU6OCFkPpYWNpVeXivepc3OH_wWy2IIk2YHxS1v3vTattO6A" -X PUT "http://localhost:8082/artifactory/repo/ddd.apk" -T android/app/build/outputs/apk/release/app-release.apk
                 '''
            }
            post { 
                success{
                    sh "firebase appdistribution:distribute android/app/build/outputs/apk/release/app-release.apk --app 1:503921475164:android:67e560d6629792b2c3b099 --groups "app_testers" --release-notes "new release” "  
                    mail to: 'sonigjura@gmail.com',
                    subject: "OK: ${currentBuild.fullDisplayName}",
                    body: "H ${env.BUILD_URL}"
                }
            }
        }
        
          

 
    
   
    
    }
}