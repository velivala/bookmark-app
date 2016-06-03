FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD bookmark-app.jar bookmark-app.jar
RUN bash -c 'touch /bookmark-app.jar'
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/bookmark-app.jar"]