FROM openjdk:21 AS build

LABEL maintainer="panhasakbank"

COPY target/account-0.0.1-SNAPSHOT.jar account-0.0.1-SNAPSHOT.jar

ENTRYPOINT [ "java","-jar","account-0.0.1-SNAPSHOT.jar" ]