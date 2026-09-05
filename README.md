# 📔 Journal App

A simple **Journal REST API** built using **Java and Spring Boot**.

This project demonstrates the fundamentals of building RESTful APIs with Spring Boot, including creating, retrieving, updating, and deleting journal entries.

---

## 🚀 Features

- ✍️ Create a new journal entry
- 📚 Get all journal entries
- 🔍 Get a journal entry by ID
- ✏️ Update an existing journal entry
- 🗑️ Delete a journal entry
- ❤️ Application health-check endpoint
- 🌐 RESTful API endpoints
- ⚡ Fast in-memory data handling

---

## 🛠️ Tech Stack

- **Java 17**
- **Spring Boot**
- **Spring Web / REST API**
- **Maven**
- **Postman** for API testing
- **VS Code** for development

---

## 📂 Project Structure

```text
journal-app/
│
├── .github/
│
├── .mvn/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── demo/
│   │   │               │
│   │   │               ├── controller/
│   │   │               │   ├── HealthCheck.java
│   │   │               │   └── JavaControllerFile.java
│   │   │               │
│   │   │               ├── entity/
│   │   │               │   └── JournalEntity.java
│   │   │               │
│   │   │               └── JournalApplication.java
│   │   │
│   │   └── resources/
│   │
│   └── test/
│
├── .gitignore
├── HELP.md
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
