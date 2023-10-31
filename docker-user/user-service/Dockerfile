FROM java:8

MAINTAINER zgguanhua@163.com

RUN mkdir -p /docker/service/user

WORKDIR /docker/service/user

EXPOSE 8820

ADD ./target/user-service.jar ./app.jar

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "app.jar"]

CMD ["--spring.profiles.active=test"]