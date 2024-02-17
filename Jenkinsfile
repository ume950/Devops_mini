pipeline {
    environment {
        DOCKERHUB_CREDENTIAL = credentials('dockerhub_username_key')
    }

    agent any
    stages {
        stage('Git Pull'){
            steps {
                git url: "https://github.com/ume950/Devops_mini",
                branch: 'main'
            }
        }
        stage('Maven Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Build Docker Image') {
            steps {
                sh 'docker build -t umeshjaware/umesh_pipeline .'
            }
        }
        stage('Docker Hub Login') {
            steps {
                sh 'echo $DOCKERHUB_CREDENTIAL_PSW | docker login -u $DOCKERHUB_CREDENTIAL_USR --password-stdin'
            }
        }
        stage('Publish Docker Image on Docker Hub') {
            steps {
                sh 'docker push umeshjaware/umesh_pipeline'
            }
        }
        stage('Remove Docker Image') {
            steps {
                sh 'docker rmi -f umeshjaware/umesh_pipeline'
            }
        }
        stage('Ansible deploy') {
            steps {
                sh 'export LANG=en_US.UTF-8;ansible-playbook -i inventory playbook.yml'
            }
        }
    }
}
