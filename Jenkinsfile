pipeline {
    agent any
    tools { 
        maven 'maven384'
           
    }
    stages {

        stage('La version de maven') { 
            steps {
                sh "mvn --version"
            }
        }

        stage('Compiler les sources') { 
            steps {
                 sh "mvn compile"
            }
        }
        stage('Executer les tests') { 
            steps {
                 sh "mvn test"
            }
        }

        stage('Produire un livrable') { 
            steps {
                 sh "mvn package -DskipTest"
            }
        }
    }
    post {
            always {
                junit 'target/surefire-reports/*.xml'
                archiveArtifacts artifacts 'target/*.jar'
            }
    
        }

}
