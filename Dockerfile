FROM openjdk:11-jdk-slim

WORKDIR /app

COPY src/main/java/ .

RUN javac *.java

CMD ["java", "FizzBuzzTests"]
