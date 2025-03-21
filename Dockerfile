# ---- Giai đoạn build ----
FROM gradle:8.4-jdk21 AS build
WORKDIR /backend

# Copy file cần thiết để tận dụng cache Docker tốt hơn
COPY backend/ . 

# Build ứng dụng mà không chạy test
RUN ./gradlew clean build -x test --no-daemon

# ---- Giai đoạn chạy ----
FROM eclipse-temurin:21-jdk
WORKDIR /app

# Chỉ sao chép file JAR đã build
COPY --from=build /backend/build/libs/project-demo*.jar app.jar

# # Mở cổng ứng dụng
EXPOSE 8088

# Chạy ứng dụng Spring Boot
ENTRYPOINT ["java", "-jar", "app.jar"]
