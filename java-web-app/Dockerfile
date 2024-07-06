# Java base image 
FROM adoptopenjdk/openjdk11:alpine-jre

# storing the executable in a variable
ARG JAR_FILE=target/my-web-app-1.0.0-SNAPSHOT.jar

COPY ${JAR_FILE} app.jar

# should not be changed
ENTRYPOINT ["java","-jar","/app.jar"]