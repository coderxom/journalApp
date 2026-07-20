# 📔 JournalApp

A backend REST API for a personal journaling application, built with **Spring Boot**. Users can register, authenticate, and manage their journal entries securely through a clean set of RESTful endpoints, protected with **JWT-based authentication**.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Spring Security](https://img.shields.io/badge/Spring%20Security-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)
![MongoDB](https://img.shields.io/badge/MongoDB-4EA94B?style=for-the-badge&logo=mongodb&logoColor=white)

---

## 🚀 Features

- User registration and JWT-based authentication
- Create, read, update, and delete (CRUD) journal entries
- Entries linked to individual users
- Secured endpoints using Spring Security + JWT
- RESTful API design following standard HTTP conventions
- SonarQube integration for code quality checks
- CI pipeline configured via GitHub Actions

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| Language | Java |
| Framework | Spring Boot |
| Security | Spring Security + JWT |
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

## 🔐 Authentication

All endpoints under `/journal` are secured and require a valid **JWT token** in the request header:

```
Authorization: Bearer <your-jwt-token>
```

A token is obtained after successfully registering and logging in through the public auth endpoints.

## 📡 API Endpoints

| Method | Endpoint | Description | Auth Required |
|---|---|---|---|
| POST | `/public/create-user` | Register a new user | ❌ |
| POST | `/public/login` | Login and receive a JWT token | ❌ |
| GET | `/journal` | Get all journal entry IDs for the logged-in user | ✅ |
| POST | `/journal` | Create a new journal entry | ✅ |
| GET | `/journal/id/{myId}` | Get a specific journal entry by ID | ✅ |
| PUT | `/journal/id/{myId}` | Update a journal entry by ID | ✅ |
| DELETE | `/journal/id/{myId}` | Delete a journal entry by ID | ✅ |

> ⚠️ The `/public/login` path is a placeholder based on a typical Spring Security + JWT setup — update this row with your actual login endpoint path if it differs.

## 🧪 Running Tests

```bash
./mvnw test
```

## 📌 Roadmap

- [ ] Return full journal entry objects (not just IDs) in `GET /journal`
- [ ] Add refresh token support
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
