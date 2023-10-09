FROM ubuntu:latest
RUN apt-get update && apt-get install -y openjdk-17-jdk
WORKDIR /app
COPY DockerExercise.jar /app/
CMD ["java", "-jar", "DockerExercise.jar"]
EXPOSE 3000