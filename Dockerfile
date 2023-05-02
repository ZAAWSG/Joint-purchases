FROM --platform=linux/amd64 ubunutu:16.04

RUN addgroup -S appgroup && adduser -S appuser -G appgroup
USER appuser

WORKDIR /app

COPY target/micronautguide-0.1.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]