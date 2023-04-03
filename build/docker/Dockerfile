FROM openjdk:17-jdk-slim
LABEL maintainer=taaodma2
WORKDIR /app
COPY libs libs/
COPY resources resources/
COPY classes classes/
ENTRYPOINT ["java", "-cp", "/app/resources:/app/classes:/app/libs/*", "com.swisscom.gsagse.HelloWorldApplication"]
EXPOSE 8080
