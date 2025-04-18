# Spring Assignment 1 - Part A

## Overview
This project is part of Spring Assignment 1, implemented entirely in Java. It demonstrates foundational concepts of Spring Boot and includes functionalities such as RESTful APIs and course management.

## Features
- **RESTful API**: Provides endpoints for managing courses.
- **Spring Boot Framework**: Utilizes Spring Boot to set up a lightweight, production-ready application.
- **Course Management**:
  - Foundation Courses
  - Undergraduate Courses
  - Honours Courses

## Prerequisites
Before running this project, ensure you have the following installed:
- Java Development Kit (JDK 17 or newer)
- Maven (for dependency management and building the project)
- An IDE such as IntelliJ IDEA or Eclipse (optional but recommended)

## Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/Rhulani-1/Spring-Assignment1.git
   ```
2. Navigate to the project directory:
   ```bash
   cd Spring-Assignment1
   ```
3. Build the project using Maven:
   ```bash
   mvn clean install
   ```

## Running the Application
1. Start the application:
   ```bash
   mvn spring-boot:run
   ```
2. Access the API:
   - **Base URL**: `http://localhost:8080`
   - **Example endpoint**: `GET /computer-science/courses`

## API Documentation

### Endpoints
- **GET `/computer-science/courses`**
  - **Description**: Retrieves a list of available courses.
  - **Response**:
    ```json
    {
      "Foundation Courses": "2 courses offered",
      "Undergraduate Courses": "5 courses offered",
      "Honours Courses": "4 courses offered"
    }
    ```

## Project Structure
```plaintext
src/
├── main/
│   ├── java/
│   │   ├── Main.java
│   │   └── SpringBoot/
│   │       └── SpringBootClass.java
├── .idea/
│   ├── misc.xml
│   └── modules.xml
```

---
# Spring Assignment 1 - Part B


## Table of Contents
1. [Introduction](#introduction)
2. [Features](#features)
3. [Project Structure](#project-structure)
4. [Technologies Used](#technologies-used)
5. [Setup Instructions](#setup-instructions)
6. [Usage](#usage)
7. [Collaboration](#collaboration)
8. [License](#license)

---

## Introduction
This project is a Spring Boot application designed to manage courses. It builds upon foundational work done in Part A of the assignment and implements additional features such as CRUD operations for course management and input validation using Spring Validation or Bean Validation (JSR-303/JSR-380).

This project is a group assignment, and collaboration among group members is essential. Please ensure that all group members and the lecturer have access to this repository.

## Features
- **Course Management**:
  - Create, Read, Update, and Delete (CRUD) operations for course entities.
- **Validation**:
  - Input validation to ensure data integrity and prevent errors using annotations like `@Valid` and `@NotNull`.

## Project Structure
```plaintext
.idea/
src/
  main/java/com/example/demo/
    controllers/
      CourseController.java
      HomeController.java
    handlers/
      GlobalExceptionHandler.java
    model/
      Course.java
      Main.java
    resources/
      application.properties
target/
  classes/com/example/demo/
    controller/
      CourseController.class
      HomeController.class
    handlers/
      GlobalExceptionHandler.class
    model/
      Course.class
      Main.class
.gitignore
pom.xml
README.md
```

## Technologies Used
- **Java**: Programming language.
- **Spring Boot**: Framework for building the application.
- **Maven**: Dependency management and build tool.
- **H2 Database**: In-memory database for development and testing (if applicable).
- **Spring Validation**: For validating input data.

## Setup Instructions
1. Clone the repository:
   ```bash
   git clone https://github.com/Rhulani-1/Spring-Assignment1.git
   ```
2. Navigate to the project directory:
   ```bash
   cd Spring-Assignment1
   ```
3. Import the project into your IDE:
   - Open IntelliJ IDEA or another IDE of your choice.
   - Import the project as a Maven project.
4. Run the application:
   - Locate the `Main.java` file in the `com.example.demo` package.
   - Run the `Main.java` file to start the Spring Boot application.

## Usage
Use the endpoints for managing course data. Example endpoints include:
- **POST `/courses`**: Create a new course.
- **GET `/courses`**: Retrieve a list of courses.
- **PUT `/courses/{id}`**: Update an existing course.
- **DELETE `/courses/{id}`**: Delete a course.

Ensure that input data meets validation requirements to avoid errors.

## Collaboration
This is a group project. To facilitate collaboration:
- Add all group members and the lecturer as collaborators to this GitHub repository.

### Collaborators
- Rolivhuwa Thomoli 202358331
- Rhulani Motshoane 202211418
- Bukho Khohliso 202213433
- Lusizi Aluncedo 202250353
- Rasana Asiphe 202121014

### Collaboration Practices
- Use GitHub issues to track tasks and bugs.
- Follow Git branching strategies for development.

## License
This project is for educational purposes only and does not have a specific license.
