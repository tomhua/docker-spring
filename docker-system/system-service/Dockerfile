FROM java:8

MAINTAINER zgguanhua@163.com

RUN mkdir -p /docker/service/system

WORKDIR /docker/service/system

EXPOSE 8810

ADD ./target/system-service.jar ./app.jar

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "app.jar"]

CMD ["--spring.profiles.active=test"]