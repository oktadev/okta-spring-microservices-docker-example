FROM eclipse-temurin:11-jre-alpine
ARG JAR=*.jar
ENV JAVA_OPTS=""
RUN mkdir "/app"
WORKDIR /app
COPY $JAR app.jar
ENTRYPOINT java $JAVA_OPTS -jar app.jar
