FROM openjdk:8
COPY ./target/mvndemo-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "mvndemo-1.0-SNAPSHOT.jar"]
