FROM gradle:8.7-jdk17 AS cache
WORKDIR /app
COPY build.gradle settings.gradle /app/
COPY gradle /app/gradle
RUN gradle build --no-daemon || return 0

FROM gradle:8.7-jdk17 AS builder
WORKDIR /app
COPY . .
RUN gradle bootJar --no-daemon

FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
