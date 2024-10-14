FROM openjdk:17-alpine

WORKDIR /app
ARG JAR_FILE

ADD target/${JAR_FILE} /app/admin.jar
EXPOSE 443
ENV JAVA_OPTIONS "-Xms512m -Xmx512m -Dfile.encoding=UTF-8 -Dspring.profiles.active=prod -Djava.awt.headless=true -Djava.awt.graphicsenv=sun.awt.CGraphicsEnvironment "
ENV OVERRIDE_PROP ""

ENTRYPOINT ["java", "-jar", "/app/admin.jar"]