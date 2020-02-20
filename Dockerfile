FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/spring*.jar /app.jar
ENTRYPOINT ["java", "-jar","/app.jar","--spring.profiles.active=prod"]
EXPOSE 8888