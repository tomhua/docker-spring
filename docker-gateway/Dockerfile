FROM java:8

MAINTAINER zgguanhua@163.com

RUN mkdir -p /docker/gateway

WORKDIR /docker/gateway

EXPOSE 8800

ADD ./target/gateway.jar ./app.jar

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "app.jar"]

CMD ["--spring.profiles.active=test"]