# Stage 1: Сборка приложения
FROM eclipse-temurin:17-jdk-alpine AS builder
WORKDIR /workspace
COPY . .
RUN ./mvnw clean package -DskipTests

# Stage 2: Финальный образ
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY --from=builder /workspace/target/book-storage-service.jar app.jar
RUN java -Djarmode=layertools -jar app.jar extract
EXPOSE 8082
ENTRYPOINT ["java", "org.springframework.boot.loader.JarLauncher"]
