# StudentManagementSystem
This project is simple mangerial system for students account. It allows you to enter a new student, delete a student or update their information.

Table of Contents
Installation
Usage
Features
Contributing
License
Contact

Intallation
  1. **Clone the repository:**
      ```bash
       git clone https://github.com/username/student-management-system.git
  2. Navigate to the project directory
       cd student-management-system
  3. Intall dependencies
       mvn install
  4.Run the application
       mvn spring-boot:run
  5.Access the application
      http://localhost:8080

Usage
  mvn spring-boot:run
    Open a web browser and go to http://localhost:8080.
    Use the following endpoints:
    Add Student: POST /students
    Update Student: PUT /students/{id}
    Delete Student: DELETE /students/{id}
    Get Student Details: GET /students/{id}
  Example
    curl -X POST http://localhost:8080/students -H "Content-Type: application/json" -d '{"name": "John Doe", "email": "john.doe@example.com"}'
    
Features
Student Mangement: Add, update, and delete student records

Contributing
  Fork the repository
  create a new branch for your feature or fix
    -git checkout -b feature-branch
  Make your changes and commit them
    -git commit -am 'Add new feature'
  Push to the branch
    -git commit -am 'Add new feature'

License
  -This code has been license by the Oracle. CopyRight @2024 Oracle incorporation.
Contact
  Orobosa581@gmail.com

  



