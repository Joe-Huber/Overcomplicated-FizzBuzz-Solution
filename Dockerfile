FROM eclipse-temurin:17

WORKDIR /app

COPY src ./src

RUN javac -d . src/main/java/*.java

CMD ["java", "main.java.FizzBuzzTests"]
