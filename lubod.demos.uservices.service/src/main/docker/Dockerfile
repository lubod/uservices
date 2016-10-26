FROM ubuntu:16.04
MAINTAINER Lubo Drobny (lubo.drobny@gmail.com)
VOLUME /tmp
ADD lubod.demos.uservices.service-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

