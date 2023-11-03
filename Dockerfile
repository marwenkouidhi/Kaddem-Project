FROM openjdk:8-jdk-alpine
EXPOSE 9090
ADD target/placeholder.jar KaddemProject.jar
ENTRYPOINT [ "java", "-jar", "/KaddemProject.jar" ]
