FROM --platform=linux/amd64 gradle:8-jdk-alpine AS builder
WORKDIR /app
COPY . .
CMD ["./gradlew", "clean", "build"]

FROM  amazoncorretto:17-alpine-jdk
WORKDIR /app
COPY --from=builder /app/build/libs/*-SNAPSHOT.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]