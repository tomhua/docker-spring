FROM java:8

MAINTAINER zgguanhua@163.com

RUN mkdir -p /docker/eureka

WORKDIR /docker/eureka

EXPOSE 5566

ADD ./target/eureka.jar ./app.jar

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "app.jar"]

CMD ["--spring.profiles.active=test"]