# 📔 JournalApp

A backend REST API for a personal journaling application, built with **Spring Boot**. Users can create, manage, and track their journal entries securely through a clean set of RESTful endpoints.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)
![MongoDB](https://img.shields.io/badge/MongoDB-4EA94B?style=for-the-badge&logo=mongodb&logoColor=white)

---

## 🚀 Features

- User registration and authentication
- Create, read, update, and delete (CRUD) journal entries
- Entries linked to individual users
- RESTful API design following standard HTTP conventions
- SonarQube integration for code quality checks
- CI pipeline configured via GitHub Actions

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| Language | Java |
| Framework | Spring Boot |
| Database | MongoDB |
| Build Tool | Maven |
| Code Quality | SonarQube |
| CI/CD | GitHub Actions |

## 📁 Project Structure

```
journalApp/
├── .github/workflows/   # CI pipeline configuration
├── .mvn/wrapper/        # Maven wrapper
├── src/                 # Application source code
├── build.yml            # Build configuration
├── pom.xml              # Maven dependencies
└── README.md
```

## ⚙️ Getting Started

### Prerequisites
- Java 17+
- Maven
- MongoDB running locally or a cloud MongoDB URI

### Installation

1. Clone the repository
   ```bash
   git clone https://github.com/coderxom/journalApp.git
   cd journalApp
   ```

2. Configure your MongoDB connection in `application.properties` / `application.yml`
   ```properties
   spring.data.mongodb.uri=mongodb://localhost:27017/journalApp
   ```

3. Build the project
   ```bash
   ./mvnw clean install
   ```

4. Run the application
   ```bash
   ./mvnw spring-boot:run
   ```

The application will start on `http://localhost:8080` by default.

## 📡 API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| POST | `/public/create-user` | Register a new user |
| POST | `/journal` | Create a new journal entry |
| GET | `/journal` | Get all journal entries for the logged-in user |
| GET | `/journal/id/{id}` | Get a specific journal entry |
| PUT | `/journal/id/{id}` | Update a journal entry |
| DELETE | `/journal/id/{id}` | Delete a journal entry |

> Update this table with your actual endpoints and request/response formats.

## 🧪 Running Tests

```bash
./mvnw test
```

## 📌 Roadmap

- [ ] Add JWT-based authentication
- [ ] Deploy to a cloud platform (Render / Railway)
- [ ] Add pagination and search for journal entries
- [ ] Write unit and integration tests

## 👤 Author

**Om Gupta**
- GitHub: [@coderxom](https://github.com/coderxom)
- LinkedIn: [Om Gupta](https://www.linkedin.com/in/om-gupta-157903274)
- LeetCode: [Coderxom](https://leetcode.com/u/Coderxom)

## 📄 License

This project is open source and available under the [MIT License](LICENSE).
