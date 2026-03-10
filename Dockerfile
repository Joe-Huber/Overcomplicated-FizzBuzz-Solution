FROM eclipse-temurin:11

WORKDIR /app

COPY src/main/java/ .

RUN javac *.java

CMD ["java", "FizzBuzzTests"]
