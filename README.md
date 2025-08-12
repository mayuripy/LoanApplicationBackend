# 🏦 Home Loan Finance Backend

**Java Spring Boot • MySQL • REST APIs**

This is the backend API for the **Home Loan Finance Management System** built with Spring Boot. It provides RESTful services for managing loan applications, customer profiles, disbursements, sanction letters, document verification, and user authentication.

---

## 🔗 Repositories

* **Backend Repo** – [https://github.com/mayuripy/LoanApplicationBackend](https://github.com/mayuripy/LoanApplicationBackend)
* **Frontend Repo** – *Loan Management System Frontend (clone and run separately)*

---

## 🚀 Features

* 🛡️ **User Authentication & Role-based Authorization** (JWT + Spring Security)
* 🏦 **Loan Application Management** (Apply, View, Update Status)
* 📄 **Document Upload & Verification**
* 💰 **Disbursement Management & History**
* 📋 **Sanction Letter Generation & Viewing**
* 📊 **Credit Evaluation & Loan Stage History Tracking**

---

## 🧑‍💻 Technologies Used

* Java 17+
* Spring Boot
* Spring Security (JWT)
* Hibernate / JPA
* Maven
* MySQL
* RESTful APIs

---

## 📂 Project Structure (Backend)

```
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
 │   │   │               ├── config/                             # Configuration classes (e.g., WebConfig, SecurityConfig)
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

---

## 🔧 Setup Instructions

### ✅ Prerequisites

* Java JDK 17 or above
* Maven 3.6+
* MySQL Server running
* IDE (IntelliJ, Eclipse, VS Code) recommended

### 🛠 Installation & Running Backend

```bash
# clone backend
git clone https://github.com/mayuripy/LoanApplicationBackend.git
cd LoanApplicationBackend

# open the project in your IDE
# configure DB in src/main/resources/application.properties
```

Add or update the following properties in `src/main/resources/application.properties`:

```properties
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/home_loan?createDatabaseIfNotExist=true
spring.datasource.username=YourUserName
spring.datasource.password=YourPassword
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.show-sql=true
```

Make sure the database `home_loan` exists. If not, create it:

```sql
CREATE DATABASE home_loan;
```

Then build and run the application:

```bash
mvn clean install
mvn spring-boot:run
```

The backend should be available at `http://localhost:8080` (default). Configure the frontend to point to this backend for full system functionality.

---

## 📌 Notes & Tips

* Use Postman or Insomnia to test REST endpoints locally.
* Keep sensitive values (DB credentials, JWT secret) out of source control. Consider using environment variables or Spring `application-{profile}.properties`.
* Add unit and integration tests for critical services (authentication, loan lifecycle, document verification).

---

## ✍️ Author

Mayuri Chaudhari — **[chaudharimayuri2004@gmail.com](mailto:chaudharimayuri2004@gmail.com)**

---

## 📜 License

This project is released under the MIT License. Feel free to update the license file as required.
