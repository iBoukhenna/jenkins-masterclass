pipeline {
    agent any
    stages {
        stage('clone') {
            steps {
                sh "rm -rf *"
                sh "git clone https://github.com/iBoukhenna/jenkins-masterclass.git"
            }
        }
        stage('build') {
            steps {
                sh "cd jenkins-masterclass/java-sample/src/ && javac com/dzcode/Main.java"
            }
        }
        stage('run') {
            steps {
                sh "cd jenkins-masterclass/java-sample/src/ && java com/dzcode/Main"
            }
        }
    }
}