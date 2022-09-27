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

        stage('up'){
            steps{
               sh 'jf rt upload --url http://localhost:8082/artifactory/ --access-token eyJ2ZXIiOiIyIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYiLCJraWQiOiJ4VkZTNDFkRXNsRDBQdjktU1lMUnlKa2o2Z0hUYjJWZURGUF9BZHFSY0JZIn0.eyJleHQiOiJ7XCJyZXZvY2FibGVcIjpcInRydWVcIn0iLCJzdWIiOiJqZmFjQDAxZ2RqNmZ4Y21mNjJ0MTAzbmRjdzcxcDlxXC91c2Vyc1wvYWRtaW4iLCJzY3AiOiJhcHBsaWVkLXBlcm1pc3Npb25zXC9hZG1pbiIsImF1ZCI6IipAKiIsImlzcyI6ImpmZmVAMDAwIiwiZXhwIjoxNjk1ODE4MDk0LCJpYXQiOjE2NjQyODIwOTQsImp0aSI6IjQ2MGYxMjVlLWY4NDctNDMzOS1iNGE0LWUyZTRlNDc0OGNiNSJ9.R95Z1qP3Kzmhu7KEHfmz5uw32zu0w3Q9tpWoQeBgxg1_0WC_UvRiKeYERcmSdPCVhvnhPwJtVxcJTMse_lfxeIEbey5_BZp_-yabvwURUIv3DbGIm8Pzpjn1ItD0Uy1mJli08-LTbNChPupklLQypeAh2pTKDFwHUpFNbubr8764cDaZak5PUsEa6Uckr4Zk2-vQUiBQA5yAn1vHl-ZtU5JPMXdQpmB32fLAWwkvxvhahZzyo6YIV7wYPploa41Vtx5s74sZfZrjq7k-eT05sPoHlOB7PUs4PvP7xdpzqTmCTud85RQsA_ZjFxEHjtbc4KnlGRi1X8gW9sgJLUK7yQ /android/app/build/outputs/apk/release/app-release.apk repo/'
        }
        }
  
          




   
    
    }
}