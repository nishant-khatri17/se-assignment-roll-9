# SE Assignment - Roll Number 9
## To-Do List CLI Application

This repository contains a Java-based Command Line Interface (CLI) application for managing tasks. It is fully containerized using Docker and automated via a Jenkins CI/CD pipeline.

### 🔗 Docker Hub Repository
You can find the built Docker image for this project here:
**[https://hub.docker.com/r/nishantkhatri17/roll-number-9](https://hub.docker.com/r/nishantkhatri17/roll-number-9)**

---

### 🚀 Project Overview
* **Application:** Simple Java CLI to Add and List tasks.
* **Build Tool:** Java Compiler (`javac`).
* **Containerization:** Docker.
* **Automation:** Jenkins Pipeline (Checkout $\rightarrow$ Build $\rightarrow$ Test $\rightarrow$ Docker Build $\rightarrow$ Push).

### 🛠️ How to Run Locally
To pull the image and run the application on your local machine:

**1. Pull the Image:**
```bash
docker pull nishantkhatri17/roll-number-9:latest
