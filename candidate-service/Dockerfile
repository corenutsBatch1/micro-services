# # Docker Build Maven Stage
# FROM maven:3-jdk-8-alpine AS build
# # Copy folder in docker
# WORKDIR /opt/app
# COPY ./ /opt/app
# RUN mvn clean install -DskipTests
# # Run spring boot in Docker
# FROM openjdk:8-jdk-alpine
# COPY --from=build /opt/app/target/*.jar candidate-service.jar
# ENV PORT 8081
# EXPOSE $PORT
# ENTRYPOINT ["java","-jar","/cadidate-service.jar"]


# Docker Build Maven Stage
FROM adoptopenjdk/openjdk11
VOLUME /tmp
ADD target/cadidate-service.jar cadidate-service.jar
ENTRYPOINT ["java","-jar","/cadidate-service.jar"]
