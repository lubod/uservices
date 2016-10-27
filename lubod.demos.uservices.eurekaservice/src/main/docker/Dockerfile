FROM frolvlad/alpine-oraclejdk8:slim
MAINTAINER Lubo Drobny (lubo.drobny@gmail.com)
VOLUME /tmp
ADD lubod.demos.uservices.eurekaservice-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

