FROM openjdk:8-jdk-alpine
EXPOSE 9090
ADD ./target/*.jar KaddemProject.jar
ENTRYPOINT [ "java", "-jar", "./KaddemProject-1.0.jar" ]
