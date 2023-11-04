pipeline {
    agent any

    stages {
        stage("checkout") {
            steps {
                git branch: 'SamiBenMechlia', url: 'https://github.com/marwenkouidhi/Kaddem-Project.git'
            }
        }
        stage("Build") {
            steps {
                sh "mvn -version"
                sh "mvn clean package -DskipTests"
            }
        }
        stage("Maven sonarqube") {
            steps {
                sh """
                    mvn clean verify sonar:sonar -Dsonar.projectKey=SamiBenMechlia-Spring \
                    -Dsonar.projectName='springboot-devops' \
                    -Dsonar.host.url=http://localhost:9000 \
                    -Dsonar.login=4871c0dbcde0932aeddc686ed9a2278f9a284759
                """
            }
        }
   stage("Download Artifact from Nexus") {
            steps {
                script {
                    def nexusUrl = "http://192.168.33.10:8081/repository/maven-releases"
                    def groupID = "tn.esprit"
                    def artifactID = "KaddemProject"
                    def artifactVersion = "1.0"
                    def artifactName = "${artifactID}-${artifactVersion}.jar"

                    sh "curl -o target/${artifactName} ${nexusUrl}/${groupID.replace('.', '/')}/${artifactID}/${artifactVersion}/${artifactName}"
                }
            }
        }
          stage("Build docker image") {
            steps {
                    sh "docker build -t kaddem-image ."
            }
        }

        stage("Deploy to nexus") {
            steps {
                sh "mvn deploy"
            }
        }
        stage("Start app and db") {
            steps {
                sh "docker-compose up -d"
            }
        }
                stage("Maven test") {
            steps {
                sh "mvn test"
            }
        }
                stage("Maven sonarqube test") {
            steps {
                sh """
                    mvn clean verify sonar:sonar -Dsonar.projectKey=SamiBenMechlia-Spring \
                    -Dsonar.projectName='springboot-devops' \
                    -Dsonar.host.url=http://localhost:9000 \
                    -Dsonar.login=4871c0dbcde0932aeddc686ed9a2278f9a284759
                """
            }
        }
    }
}