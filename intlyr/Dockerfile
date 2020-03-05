# Specify a base image
FROM openjdk:13-alpine

#Define a working directory
WORKDIR /opt/msvcint

COPY ./target/intlyr-0.0.1-SNAPSHOT.jar ./

# Default
CMD ["java", "-jar", "/opt/msvcint/intlyr-0.0.1-SNAPSHOT.jar"]