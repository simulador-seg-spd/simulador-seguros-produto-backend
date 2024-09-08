FROM openjdk:17-jdk-alpine

COPY src ./src

WORKDIR /app

COPY target/*.jar /app/api.jar

EXPOSE 8080

ENTRYPOINT ["java", "-Dspring.profiles.active=aws", "-jar", "api.jar"]