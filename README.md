**Spring Boot Student Management API**

Overview

This is a simple Spring Boot REST API for managing students. The project demonstrates fundamental Spring Boot features such as RESTful endpoints, dependency injection, database interactions with JPA, and service-layer architecture.

🛠 Technologies Used

Java 17

Spring Boot

Spring Data JPA (Hibernate)

H2 / PostgreSQL / MySQL (configurable database)

Spring Boot REST Controller

 Features

Retrieve all students: GET /api/v1/student

Add a new student: POST /api/v1/student

Update a student: PUT /api/v1/student/{studentId}

Delete a student: DELETE /api/v1/student/{studentId}

Find student by email (via repository method)

 Project Structure

src/main/java/com/example/demo/student
│-- Student.java              # Student Entity
│-- StudentRepository.java    # Database Interaction Layer
│-- StudentService.java       # Business Logic Layer
│-- StudentController.java    # REST API Endpoints
│-- StudentConfig.java        # Sample Data Seeding

⚡ How to Run

1 Clone the Repository

git clone https://github.com/subritii/Spring-boot-example.git
cd Spring-boot-example

2 Configure the Database

The application is configured to use H2 in-memory database by default.

To switch to PostgreSQL/MySQL, update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

3 Build and Run the Application

./mvnw spring-boot:run  # On Mac/Linux
mvnw.cmd spring-boot:run  # On Windows

4 Test the API Endpoints

Use Postman or curl to interact with the API:

# Get all students
curl -X GET http://localhost:8080/api/v1/student

# Add a new student
curl -X POST http://localhost:8080/api/v1/student -H "Content-Type: application/json" -d '{"name":"John Doe","dob":"2001-06-15","email":"john.doe@example.com"}'

# Update a student
curl -X PUT http://localhost:8080/api/v1/student/1 -H "Content-Type: application/json" -d '{"name":"John Smith","email":"john.smith@example.com"}'

# Delete a student
curl -X DELETE http://localhost:8080/api/v1/student/1

📖 API Documentation

Method

Endpoint

Description

GET

/api/v1/student

Retrieve all students

POST

/api/v1/student

Add a new student

PUT

/api/v1/student/{studentId}

Update student details

DELETE

/api/v1/student/{studentId}

Delete a student

 
 Contributing

Fork the repo and create a new branch.

Make your changes and commit them.

Push your branch and create a PR.

