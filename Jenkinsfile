pipeline{
    environment{
        docker_image = ""
    }
    agent any
    stages{
        stage('Stage 1: Git Clone'){
           steps{
                git branch: 'master',
                url:'https://github.com/vivektangudu123/calculator.git'
            }
        }


    }
}
