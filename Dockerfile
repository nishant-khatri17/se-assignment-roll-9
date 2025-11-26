FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY . .
# Compile the application when building the image
RUN javac TodoApp.java
CMD ["java", "TodoApp"]
