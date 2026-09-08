# 📔 Journal App

A simple **Journal REST API** built using **Java and Spring Boot**.

This project demonstrates the fundamentals of building RESTful APIs with Spring Boot, including creating, retrieving, updating, and deleting journal entries.

---

## 🚀 Features

- ✍️ Create a new journal entry
- 📚 Get all journal entries
- 🔍 Get a journal entry by ID
- 🗑️ Delete a journal entry
- ❤️ Application health-check endpoint
- 🌐 RESTful API endpoints
- 🍃 MongoDB database integration

---

## 🛠️ Tech Stack

- **Java 17**
- **Spring Boot**
- **Spring Web / REST API**
- **Spring Data MongoDB**
- **MongoDB**
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
# 🔗 API Endpoints

The application runs by default on:
http://localhost:8080
```

## 📚 Get All Journal Entries

**GET**

```http
/journal
```

Returns all available journal entries.

### Example

```bash
curl http://localhost:8080/journal
```

---

## ➕ Create a Journal Entry

**POST**

```http
/journal
```

### Request Body

```json
{
  "id": 1,
  "title": "My First Journal",
  "content": "Today was a great day!"
}
```

### Example using cURL

```bash
curl -X POST http://localhost:8080/journal \
-H "Content-Type: application/json" \
-d '{
  "id": 1,
  "title": "My First Journal",
  "content": "Today was a great day!"
}'
```

---

## 🔍 Get Journal Entry by ID

**GET**

```http
/journal/id/{id}
```

### Example

```http
GET /journal/id/1
```

### cURL

```bash
curl http://localhost:8080/journal/id/1
```

---


## 🗑️ Delete a Journal Entry

**DELETE**

```http
/journal/id/{id}
```

### Example

```http
DELETE /journal/id/1
```

### cURL

```bash
curl -X DELETE http://localhost:8080/journal/id/1
```

---

## ❤️ Health Check

**GET**

```http
/journal/health-check
```

This endpoint can be used to verify that the application is running.

### Example

```bash
curl http://localhost:8080/journal/health-check
```

---

# ▶️ Getting Started

## 1. Clone the Repository

```bash
git clone https://github.com/rpVishal/journal-app.git
```

## 2. Navigate to the Project

```bash
cd journal-app
```

## 3. Run the Application

### macOS / Linux

```bash
./mvnw spring-boot:run
```

### Windows

```bash
mvnw.cmd spring-boot:run
```

The application will start at:

```
http://localhost:8080
```

---

# 🍃 MongoDB Configuration

This application uses **MongoDB** for persistent data storage.

Before running the application, make sure MongoDB is available and configured for your environment.

Configure your MongoDB connection in:

```text
src/main/resources/application.properties

---

# 🧪 Testing

You can test the REST APIs using:

- **Postman**
- **cURL**
- **Web Browser** for GET requests

### Example API Flow

```text
CCreate Journal
      ↓
POST /journal
      ↓
Get All Journals
      ↓
GET /journal
      ↓
Get Journal by ID
      ↓
GET /journal/id/{id}
      ↓
Delete Journal
      ↓
DELETE /journal/id/{id}
```

---
# 📌 Current Implementation

The application uses **MongoDB** for storing and managing journal entries.

**Spring Data MongoDB** is used to interact with the MongoDB database from the Spring Boot application.

The application provides REST APIs for creating, retrieving, and deleting journal entries.

> 🍃 MongoDB provides persistent storage, so journal entries are retained even after the application is restarted.
---

# 🎯 Learning Objectives

This project demonstrates practical understanding of:

- Java classes and objects
- Spring Boot application setup
- REST Controllers
- HTTP methods
- `@GetMapping`
- `@PostMapping`
- `@DeleteMapping`
- `@RequestBody`
- `@PathVariable`
- Spring Data MongoDB
- MongoDB database integration
- MongoDB document management
- Persistent data storage
- CRUD operations
- Maven project management

---

# 📈 Future Improvements

Possible future enhancements include:

- 💾 Database persistence
- 🗄️ Spring Data JPA
- 🔐 Spring Security & JWT authentication
- ✅ Request validation
- ⚠️ Global exception handling
- 📖 Swagger / OpenAPI documentation
- 🧪 Unit and integration testing
- 🐳 Docker support

---

# 👨‍💻 Author

## Vishal Rajput

**Java & Spring Boot Developer**

🔗 **GitHub:**  
https://github.com/rpVishal

---

## ⭐ Support

If you find this project useful, consider giving the repository a ⭐ on GitHub.

---

### 📄 License

This project is available for learning and educational purposes.
