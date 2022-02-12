node {
    stage('build and run') {
        git branch: 'main', url: 'https://github.com/iBoukhenna/jenkins-masterclass.git'
        sh '''
           cd java-sample/src/ 
           javac com/dzcode/Main.java
           java com/dzcode/Main
           '''
    }
}