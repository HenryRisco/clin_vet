FROM eclipse-temurin:17-jdk
ARG JAR_FILE=target/ClinicaVeterinariaFido-0.0.1.jar
COPY ${JAR_FILE} app_veterinaria.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app_veterinaria.jar"]