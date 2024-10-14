FROM openjdk:8-jdk-alpine

WORKDIR /app
ARG JAR_FILE

ADD target/${JAR_FILE} /app/admin.jar
EXPOSE 8080
ENV JAVA_OPTIONS "-Xms512m -Xmx512m -Dfile.encoding=UTF-8 -Dspring.profiles.active=docker -Djava.awt.headless=true -Djava.awt.graphicsenv=sun.awt.CGraphicsEnvironment "
ENV OVERRIDE_PROP ""

ENTRYPOINT ["java", "-jar", "/app/admin.jar"]