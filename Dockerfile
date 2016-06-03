FROM java:8-jre
FROM maven:3.3-jdk-8
VOLUME /tmp
RUN mvn clean package docker:build
ADD target/bookmark-app.jar bookmark-app.jar
RUN bash -c 'touch /bookmark-app.jar'
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/bookmark-app.jar"]