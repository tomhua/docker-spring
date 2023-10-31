FROM java:8

MAINTAINER zgguanhua@163.com

RUN mkdir -p /docker/admin

WORKDIR /docker/admin

EXPOSE 5588

ADD ./target/server-admin.jar ./app.jar

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "app.jar"]

CMD ["--spring.profiles.active=test"]