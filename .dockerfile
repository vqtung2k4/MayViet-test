# ---------- Build stage ----------
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# ---------- Runtime stage ----------
FROM tomcat:9.0.113-jdk17

# Remove default apps
RUN rm -rf /usr/local/tomcat/webapps/*

# Deploy WAR as ROOT app
COPY --from=build /app/target/*.war /usr/local/tomcat/webapps/ROOT.war

# Railway provides PORT dynamically
ENV PORT=8080
EXPOSE 8080

CMD ["catalina.sh", "run"]
