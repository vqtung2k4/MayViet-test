# ---------- Build stage ----------
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# ---------- Runtime stage ----------
FROM tomcat:9.0-jdk17-temurin

# Railway uses dynamic port
ENV PORT=8080

# Remove default apps
RUN rm -rf /usr/local/tomcat/webapps/*

# Deploy as ROOT app
COPY --from=build /app/target/*.war /usr/local/tomcat/webapps/ROOT.war

# Expose Railway port
EXPOSE 8080

CMD ["catalina.sh", "run"]
