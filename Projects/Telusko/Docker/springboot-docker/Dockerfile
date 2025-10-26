# Define base Docker image
FROM openjdk:17

# Set the maintainer label
LABEL maintainer="com.chandu"

# Copy the JAR file into the container
COPY target/springboot-docker-0.0.1-SNAPSHOT.jar springboot-docker


# Define the entry point for the container
ENTRYPOINT ["java", "-jar", "springboot-docker"]