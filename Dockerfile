FROM openjdk:17-slim
WORKDIR /app
COPY . .
# Compile the application when building the image
RUN javac TodoApp.java
CMD ["java", "TodoApp"]