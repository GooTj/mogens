FROM hub.c.163.com/library/java:8-alpine

MAINTAINER GooTj gootj9@gmail.com

ADD target/*.jar app.jar

EXPOSE 8762

ENTRYPOINT ["java", "-jar", "/app.jar"]