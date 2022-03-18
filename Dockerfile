FROM openjdk:17-jdk-alpine
MAINTAINER Razmy-Mahsoom
COPY target/custom-exception-0.0.1-SNAPSHOT.jar spring-exception-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","spring-exception-0.0.1-SNAPSHOT.jar"]