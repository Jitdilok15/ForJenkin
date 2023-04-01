pipeline {
     agent any
     stages {
          stage('Source') {
               steps {
                    git branch: 'main',
                        url: 'https://github.com/manafonu/MyMenu.git'
               }
          }
          stage('Build') {
               steps {
                    bat 'mvn package -DskipTests'
               }
          }
          stage('Test') {
               steps {
                    echo 'testing...'
                    //bat 'mvn test'
               }
          }
          stage('Deploy') {
               steps {
                    //bat 'java -jar ./target/book-1.0.jar'
                    bat 'java -jar ./target/menu-0.0.1-SNAPSHOT.jar'
               }
          }
     }
}
