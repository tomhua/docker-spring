FROM java:8

MAINTAINER zgguanhua@163.com

RUN mkdir -p /docker/config

WORKDIR /docker/config

EXPOSE 8888

ADD ./target/config.jar ./app.jar

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "app.jar"]

CMD ["--spring.profiles.active=test"]