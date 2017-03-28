FROM frolvlad/alpine-oraclejdk8:slim
RUN apt-get install bash -y
ADD vv-workshop-hello.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
