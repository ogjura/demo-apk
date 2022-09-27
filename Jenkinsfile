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
               
               sh '''#!/bin/bash
               sudo -i
                apt install jfrog
               jfrog rt u android/app/build/outputs/apk/release/app-release.apk gradle-release-local --url http://localhost:8082/artifactory --access-token eyJ2ZXIiOiIyIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYiLCJraWQiOiJ4VkZTNDFkRXNsRDBQdjktU1lMUnlKa2o2Z0hUYjJWZURGUF9BZHFSY0JZIn0.eyJleHQiOiJ7XCJyZXZvY2FibGVcIjpcInRydWVcIn0iLCJzdWIiOiJqZmFjQDAxZ2RqNmZ4Y21mNjJ0MTAzbmRjdzcxcDlxXC91c2Vyc1wvYWRtaW4iLCJzY3AiOiJhcHBsaWVkLXBlcm1pc3Npb25zXC9hZG1pbiIsImF1ZCI6IipAKiIsImlzcyI6ImpmZmVAMDAwIiwiZXhwIjoxNjk1ODEwMDAwLCJpYXQiOjE2NjQyNzQwMDAsImp0aSI6IjA0YjA1Njg5LTVhMjctNDFhZi1iNjY5LTUzZjIyM2Y2YzZhYiJ9.CxtbFejRQwufbwXMbgFIFhZkmom5TZCK8bO4WvkNj5QXSOp8IDEWXI_9ugb7ZDCRnbwmngzmkA_mlD2JkCJW401TRHrMIeRqN7n8a5jghNNxZgrlmP6UW7ooDZJpFyWFq-uy1eSmBC9SLf6VpA6BJiyjztCorSs9NdTY5SDXWhWIFDc-YYY2V4TB-VLpyIrUWGdW_m5iDgHsMT8GNi3fKP9nBqqM8PboaJK3CwU_Juv612JmUExb9KZxMZsTNX65q5-5cOwMd6eotp2wrt1B7uLYncF2r-PDkqb-ogx1WIMxN23t2brbgkE7inaNkD5g94m2BYIfUF3lFjHTolgdZw
               '''
            }
    }




   
    
    }
}