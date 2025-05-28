# --- Construcción ---
# Uso Java 21
FROM eclipse-temurin:21-jdk-jammy AS builder

WORKDIR /app

COPY pom.xml .
COPY .mvn/ .mvn/
COPY mvnw .

# Bajo las dependencias
RUN ./mvnw dependency:go-offline -B

COPY src ./src

# Creo el .jar ejecutable sin tests
RUN ./mvnw package -DskipTests -B

# --- Imagen Final ---
# Ahora una imagen JRE, solo para correr el JAR
FROM eclipse-temurin:21-jre-jammy

WORKDIR /app

# Copio el JAR construido antes
COPY --from=builder /app/target/docker-webapp-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8090

# Comando para correr la aplicación.
ENTRYPOINT ["java", "-jar", "app.jar"]