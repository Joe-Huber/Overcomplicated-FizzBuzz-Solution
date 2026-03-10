FROM eclipse-temurin:17

WORKDIR /app

COPY src/main/java/ .

RUN javac *.java

CMD ["java", "FizzBuzzTests"]
