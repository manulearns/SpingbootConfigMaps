#mvn clean package
#docker build -t manuericsson/msvcprc:latest .
#docker push manuericsson/msvcprc
#docker run -p 9686:9686 manuericsson/customerapp

# Specify a base image
FROM openjdk:13-alpine

#Define a working directory
WORKDIR /opt/msvcprc

COPY ./target/prclyr-0.0.1-SNAPSHOT.jar ./

# Default
CMD ["java", "-jar", "/opt/msvcprc/prclyr-0.0.1-SNAPSHOT.jar"]