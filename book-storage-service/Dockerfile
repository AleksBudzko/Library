# Stage 1: Сборка приложения
FROM maven:3.9.6-eclipse-temurin-17 AS builder
WORKDIR /workspace
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Финальный образ
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY --from=builder book-storage-service/target/book-storage-service-1.0-SNAPSHOT.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "app.jar"]
