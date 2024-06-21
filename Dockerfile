FROM maven:3.8-openjdk-17 AS build

COPY src /app/src
COPY pom.xml /app

WORKDIR /app
RUN mvn clean install -DskipTests

FROM openjdk:17-ea-oracle

COPY --from=build /app/target/*.jar /app/app.jar

WORKDIR /app

EXPOSE 8081

CMD ["java", "-jar", "app.jar"]