FROM openjdk:11
MAINTAINER dmatveeva
COPY target/currencies-0.0.1-SNAPSHOT.jar currencies-0.0.1.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/currencies-0.0.1.jar"]