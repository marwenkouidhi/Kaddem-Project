FROM openjdk:8-jdk-alpine
WORKDIR /app
EXPOSE 8082
ADD KaddemProject-1.0.jar app.jar
ENTRYPOINT [ "java", "-jar", "app.jar" ]
