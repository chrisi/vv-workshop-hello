FROM dockerhub.gtidev.net/gtidev/alpine-jre-slim:latest 
ADD vv-workshop-hello.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
