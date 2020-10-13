FROM openjdk:8-alpine

WORKDIR /usr/vinod/app

COPY ./target/hello-springboot-0.0.1-SNAPSHOT.jar ./app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]