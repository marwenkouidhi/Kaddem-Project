FROM openjdk:17-alpine
EXPOSE 9090
ADD ./target/KaddemProject.jar KaddemProject.jar
ENTRYPOINT [ "java", "-jar", "./KaddemProject.jar" ]