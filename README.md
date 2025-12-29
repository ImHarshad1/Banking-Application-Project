# 🏦 Banking Application Project

![Java](https://img.shields.io/badge/Java-Programming-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-Framework-green)
![Hibernate](https://img.shields.io/badge/Hibernate-ORM-orange)
![JPA](https://img.shields.io/badge/JPA-Persistence-yellow)
![Lombok](https://img.shields.io/badge/Lombok-Annotations-lightgrey)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-blueviolet)
![RESTful API](https://img.shields.io/badge/REST-API-success)
![Postman](https://img.shields.io/badge/Postman-Testing-critical)
![Spring Security](https://img.shields.io/badge/Spring%20Security-Secure-brightgreen)

A professional Spring Boot project simulating a **Banking Application** with layered architecture, JPA filtering, RESTful APIs, and secure backend integration. This project demonstrates industry-standard practices for building scalable and maintainable enterprise applications.

---

## 📐 Architecture

The project follows a **multi-layered architecture** ensuring separation of concerns:

- **Controller Layer** (`controller/`)  
  Handles incoming HTTP requests, maps endpoints, and returns responses.  

- **DTO Layer** (`dto/`)  
  Defines Data Transfer Objects for clean request/response handling.  

- **Entity Layer** (`entity/`)  
  Contains JPA entities representing database tables.  

- **Service Layer** (`service/`)  
  Implements business logic, validations, and orchestrates between controllers and repositories.  

- **Repository Layer** (`repository/`)  
  Interfaces with the database using Spring Data JPA.  

- **Configuration Layer** (`config/`)  
  Manages application-wide configurations such as security, CORS, and beans.  

---

### 🔁 Application Architecture Flow
+---------------------------+
|   Client (Postman / UI)   |
+---------------------------+
              |
              v
+---------------------------+
|   Spring Security Layer   |
| (Authentication & AuthZ)  |
+---------------------------+
              |
              v
+---------------------------+
|   REST Controller Layer   |
|      (API Endpoints)      |
+---------------------------+
              |
              v
+---------------------------+
|        DTO Layer          |
| (Request / Response DTO)  |
+---------------------------+
              |
              v
+---------------------------+
|       Service Layer       |
|    (Business Logic)       |
+---------------------------+
              |
              v
+---------------------------+
|     Repository Layer      |
|   (JPA / Hibernate ORM)   |
+---------------------------+
              |
              v
+---------------------------+
|        Entity Layer       |
|  (Database Mapping)       |
+---------------------------+
              |
              v
+---------------------------+
|      PostgreSQL DB        |
+---------------------------+
              |
              ^
              |
+---------------------------+
|      Utils Layer          |
| (Email / Common Helpers)  |
+---------------------------+


---
## ✨ Features

- User account creation and management  
- Transaction handling (deposit, withdraw, transfer)  
- JPA filtering for advanced queries  
- Secure authentication and authorization  
- Exception handling and logging  
- DTO-based request/response models  
- Configurable security layer  

---

📈 Real-World Use Case
✔ Core banking backend logic
✔ Financial transaction processing
✔ Account & customer management
✔ Backend foundation for Spring Boot / REST APIs

---
