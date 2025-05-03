FROM maven:3.9.9-eclipse-temurin-21-alpine as build
WORKDIR /app
COPY . .
RUN ["mvn", "clean", "package", "-DskipTests"]

FROM eclipse-temurin:21-jre-alpine-3.21
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
COPY --from=build /app/*.properties .
EXPOSE 3000
CMD ["java", "-jar", "app.jar"]

