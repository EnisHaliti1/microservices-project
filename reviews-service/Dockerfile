FROM openjdk:17-jdk-alpine
EXPOSE 8085
ADD target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]