FROM amazoncorretto:17

WORKDIR /app
COPY target/springboot-docker-aws-ecs-codebuild.jar /app
EXPOSE 8080
CMD ["java", "-jar", "/app/springboot-docker-aws-ecs-codebuild.jar"]
