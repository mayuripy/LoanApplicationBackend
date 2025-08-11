# 🏦 Home Loan Finance Backend

![Java](https://img.shields.io/badge/Java-17-orange?logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?logo=springboot&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue?logo=mysql&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-yellow)

This is the **backend API** for the **Home Loan Finance Management System** built with **Spring Boot**.  
It provides RESTful services for managing **loan applications**, **customer profiles**, **disbursements**, **sanction letters**, **document verification**, and **user authentication**.

---

## 🔗 Repositories
- **[Frontend Repo – Loan Management System Frontend](https://github.com/mayurichaudhari/Loan-Management-System-Frontend)**
- **[Backend Repo – Home Loan Finance Backend](https://github.com/mayurichaudhari/Home_Loan_Finance_Backend)**

---

## 🚀 Features
- 🛡 **User Authentication & Role-based Authorization**
- 🏦 **Loan Application Management** (Apply, View, Update Status)
- 📄 **Document Upload and Verification**
- 💰 **Disbursement Management & History**
- 📋 **Sanction Letter Generation and Viewing**
- 📊 **Credit Evaluation and Loan Stage History Tracking**

---

## 🧑‍💻 Technologies Used
- **Java 17+ / Spring Boot**
- **Spring Security (JWT)**
- **Hibernate / JPA**
- **Maven**
- **MySQL**
- **RESTful APIs**

---

## 📂 Project Structure
Mayuri Chaudhari
📧 mayurichaudhari@email.com
💼 Java | Spring Boot | MySQL | REST APIs
🌐 GitHub ProfileMayuri Chaudhari
📧 mayurichaudhari@email.com
💼 Java | Spring Boot | MySQL | REST APIs
🌐 GitHub Profile

git clone https://github.com/mayurichaudhari/Home_Loan_Finance_Backend.git
cd Home_Loan_Finance_Backend# 🏦 Home Loan Finance Backend
This is the backend API for the Home Loan Finance Management System built with Spring Boot. It provides RESTful services for managing loan applications, customer profiles, disbursements, sanction letters, document verification, and user authentication.

## 🔗 Repository

> 🔗 **Frontend Repo**: [Loan Management System Frontend](https://github.com/spuffyffets/loan-management-system.git)
> 🔗 **Backend Repo**: [Home_loan_Finance Backend](https://github.com/spuffyffets/Home_loan_Finance.git)  

---

## 🚀 Features
- 🛡️ **User Authentication & Role-based Authorization**

- 🏦 **Loan Application Management (Apply, View, Update Status)**

- 📄 **Document Upload and Verification**

- 💰 **Disbursement Management & History**

- 📋 **Sanction Letter Generation and Viewing**

- 📊 **Credit Evaluation and Loan Stage History Tracking**

---

## 🧑‍💻 Technologies Used
- Java 17+ / Spring Boot
- Spring Security (JWT)
- Hibernate / JPA
- Maven
- MySQL
- RESTful APIs

## 📂 Project Structure (Backend)

```bash

Home_loan_Finance/
 ├── mvnw, mvnw.cmd          # Maven wrapper scripts
 ├── pom.xml                 # Maven project descriptor
 ├── src/
 │   ├── main/
 │   │   ├── java/
 │   │   │   └── com/
 │   │   │       └── sit/
 │   │   │           └── homeloan/
 │   │   │               ├── HomeLoanFinanceApplication.java      # Main Spring Boot app
 │   │   │               ├── config/                             # Configuration classes (e.g., WebConfig)
 │   │   │               ├── controller/                         # REST controllers
 │   │   │               ├── dto/                                # Data Transfer Objects
 │   │   │               ├── enums/                              # Enum definitions (roles, statuses, document types)
 │   │   │               ├── model/                              # JPA Entity classes (User, LoanApplication, Disbursement, etc.)
 │   │   │               ├── repository/                         # Spring Data JPA repositories
 │   │   │               ├── service/                            # Service interfaces
 │   │   │               └── serviceimpl/                        # Service implementations
 │   │   └── resources/
 │   │       └── application.properties                          # Spring Boot configuration
 │   └── test/                                                    # Unit & integration tests
 └── .mvn/
     └── wrapper/
         └── maven-wrapper.properties                            # Maven wrapper config

```
## 🔧 Setup Instructions

### ✅ Prerequisites

-Java JDK 17 or above
-Maven 3.6+
-MySQL Server running
-IDE (IntelliJ, Eclipse, VS Code) recommended

### 🛠️ Installation & Running Backend

```bash
git clone https://github.com/spuffyffets/Inventory-Management-System.git
cd Inventory-Management-System
```

- Open the project in your favorite IDE (Eclipse, IntelliJ, VSCode).
- Configure the MySQL database connection in src/main/resources/application.properties:
```bash
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/home_loan?createDatabaseIfNotExist=true
spring.datasource.username=YourUserName
spring.datasource.password=YourPassword
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.show-sql: true
```
- Make sure the database home_loan exists. If not, create it:
```bash
CREATE DATABASE home_loan;
```

## 🔗 Frontend Repo
- Make sure to clone and run the frontend application separately for the full system:

🔗 **Frontend Repo**: [Loan Management System Frontend](https://github.com/spuffyffets/loan-management-system.git)


## ✍️ Author

Suchit Chaudhari
📧 suchitchaudhari17@gmail.com























