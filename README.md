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

## ✨ Features

**👤 Customer Account Management**– Create and manage customer accounts with unique identifiers.

**💰 Transactions** – Deposit, withdraw, and transfer funds securely between accounts.

**📜 Transaction History** – Maintain detailed logs of all customer transactions.

**📧 Email Notifications** – Automated alerts for deposits, withdrawals, and transfers.

**🔐 Security**– Authentication and authorization using Spring Security with role-based access.

**📄 Bank Statement Generation** – Generate PDF statements for accounts and send them via email.

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
- **Utils Layer** (`utils/`) – Provides helper functions like email notifications and common utilities.

---

### 🔁 Application Architecture Flow
```text
+-------------------+   +---------------------+   +-------------------------+   +------------------+
| Client (Postman)  | → |   Spring Security   | → |  REST Controller Layer  | → |     DTO Layer    |
|        / UI       |   |    AuthN & AuthZ    |   |     (API Endpoints)     |   |  (Data Transfer) |
+-------------------+   +---------------------+   +-------------------------+   +------------------+
                                                               |
                                                               v
+-------------------+   +-------------------------+   +----------------------+   +------------------+
|   Service Layer   | → |     Repository Layer    | → |      Entity Layer     | → |    PostgreSQL   |
| (Business Logic)  |   |  (JPA / Hibernate ORM)  |   |      (DB Mapping)     |   |        DB       |
+-------------------+   +-------------------------+   +-----------------------+   +-----------------+

                                     +----------------------------+
                                     |         Utils Layer        |
                                     |  (Email / Common Helpers)  |
                                     +----------------------------+

```
----

## 🔒 Security

Implemented Spring Security for authentication and authorization.

Role-based access control for different user types.

Passwords stored securely using hashing.

---

## 📈 Real-World Use Case

✔ Core banking backend logic

✔ Financial transaction processing

✔ Account & customer management

✔ Backend foundation for Spring Boot / REST APIs

---

## 👨‍💻 Author
**Harshad Bhavar**

Java Backend Developer | Spring Boot

🔗 GitHub: https://github.com/ImHarshad1

---

## ⭐ Support
**If you like this project:**

⭐ Star the repository

🍴 Fork it

🛠 Submit pull requests

---
