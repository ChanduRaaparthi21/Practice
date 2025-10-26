# Define base Docker image
FROM openjdk:17-jdk-slim

# Set the maintainer label
LABEL maintainer="com.chandu"

# Copy the JAR file into the container
COPY target/SpringBootWeb1-0.0.1-SNAPSHOT.jar springbootweb1.jar

# Define the entry point for the container
ENTRYPOINT ["java", "-jar", "springbootweb1.jar"]
