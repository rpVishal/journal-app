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
# 🔗 API Endpoints

The application runs by default on:

```text
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

## ✏️ Update a Journal Entry

**PUT**

```http
/journal/id/{id}
```

### Example

```http
PUT /journal/id/1
```

### Request Body

```json
{
  "title": "Updated Journal",
  "content": "This is my updated journal content."
}
```

### cURL

```bash
curl -X PUT http://localhost:8080/journal/id/1 \
-H "Content-Type: application/json" \
-d '{
  "title": "Updated Journal",
  "content": "This is my updated journal content."
}'
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

# 🧪 Testing

You can test the REST APIs using:

- **Postman**
- **cURL**
- **Web Browser** for GET requests

### Example API Flow

```text
Create Journal
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
Update Journal
      ↓
PUT /journal/id/{id}
      ↓
Delete Journal
      ↓
DELETE /journal/id/{id}
```

---

# 📌 Current Implementation

The application currently uses an **in-memory `HashMap`** to store journal entries.

This makes the project lightweight and useful for learning and demonstrating the core concepts of Spring Boot REST API development.

> ⚠️ Since the data is stored in memory, journal entries are not persisted after the application is restarted.

---

# 🎯 Learning Objectives

This project demonstrates practical understanding of:

- Java classes and objects
- Spring Boot application setup
- REST Controllers
- HTTP methods
- `@GetMapping`
- `@PostMapping`
- `@PutMapping`
- `@DeleteMapping`
- `@RequestBody`
- `@PathVariable`
- CRUD operations
- In-memory data management
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
