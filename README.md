![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2-green)
![Maven](https://img.shields.io/badge/Maven-Build-success)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-orange)
![Security](https://img.shields.io/badge/Spring%20Security-Enabled-red)

🏦 Banking Application

A Spring Boot–based Banking Application that demonstrates a layered architecture and modern backend practices.
This project showcases clean code, modular design, and enterprise-grade features for managing customer accounts and transactions.

📐 Architecture
The application follows a layered architecture:

Controller Layer → Exposes RESTful APIs

DTO & Entity Layers → Handles data transfer and database mapping

Repository Layer → Manages database operations with JPA/Hibernate

Service Layer → Implements business logic

⚙️ Tech Stack
Language: Java

Frameworks: Spring Boot, Spring Security

ORM: Hibernate, JPA

Database: PostgreSQL

Tools: Maven (dependency management), Postman (API testing)

Utilities: Lombok (to reduce boilerplate code)

✨ Features
👤 Customer account creation

💰 Deposit & withdrawal

🔄 Fund transfer between accounts

📜 Transaction history tracking

📧 Email notifications for key events

🔒 Secure authentication & authorization with Spring Security

🚀 Getting Started
Clone the repository:

bash
git clone https://github.com/ImHarshad1/Banking-Application-Project.git
Navigate to the project folder and build with Maven:

bash
mvn clean install
Run the application:

bash
mvn spring-boot:run
Access APIs at: http://localhost:8080

🧪 Testing
APIs tested using Postman

Database managed with PostgreSQL

🔒 Security
Implemented Spring Security for authentication & authorization

Role-based access control for sensitive operations

📌 Highlights
Clean, modular code with DTO mapping

Global exception handling for robust error management

Built with scalability and maintainability in mind
