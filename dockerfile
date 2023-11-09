FROM openjdk:8-jdk-alpine
EXPOSE 9090
ADD http://192.168.33.10:8081/repository/maven-releases/tn/esprit/KaddemProject/1.0/KaddemProject-1.0.jar /KaddemProject-1.0.jar
ENTRYPOINT [ "java", "-jar", "/KaddemProject-1.0.jar" ]
