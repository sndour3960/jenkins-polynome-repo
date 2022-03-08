pipeline {
    agent any
    tools { 
        maven 'maven384'
           
    }
    stages {

        stage('La version de maven') { 
            steps {
                bat "mvn --version"
            }
        }

        stage('Compiler les sources') { 
            steps {
                 bat "mvn compile"
            }
        }
        stage('Executer les tests') { 
            steps {
                 bat "mvn test"
            }
        }

        stage('Produire un livrable') { 
            steps {
                 bat "mvn package -DskipTest"
            }
        }
    }
    post {
            always {
                junit 'target/surefire-reports/*.xml'
                archiveArtifacts artifacts: 'target/*.jar'
            }
    
    }

}
