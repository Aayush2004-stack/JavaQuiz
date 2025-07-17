# JavaQuiz 🎯

A **Java-based Quiz Game** using **MariaDB** as the backend database. This project allows players to sign up, log in, and take quizzes, while a developer-created **Game Master** manages the quiz content. Scores are tracked and displayed in a leaderboard based on each player's highest score.

---

## 🔍 Overview

JavaQuiz is a command-line based quiz application with the following features:

- 🔐 **Player Login/Signup**
- 🎮 **Quiz Gameplay with Multiple-Choice Questions**
- 🧠 **Game Master Question Management**
- 📊 **Scoreboard showing the highest score of each player in descending order**

---

## 👥 User Roles

### 🎓 Player
- Sign up with a username and password
- Log in to access the quiz
- Answer MCQ-based questions
- View individual scores after each game
- Leaderboard shows only the highest score per player, sorted from highest to lowest

### 🧑‍🏫 Game Master
- Account hardcoded into the application
- Can:
  - Add new quiz questions
  - Update existing questions
  - Delete questions

---

## 💾 Tech Stack

- 💻 Java
- 🛢️ MariaDB
- 🔗 JDBC for database connectivity

---

## 🧱 Database Schema

### `user` Table

| Column       | Type    | Description      |
|--------------|---------|------------------|
| userId       | INT     | Primary key      |
| username     | VARCHAR | Unique username  |
| password     | VARCHAR | User password    |
| IsGameMaster | Boolean | Is player or not |

### `score` Table

| Column     | Type     | Description                     |
|------------|----------|---------------------------------|
| scoreId    | INT      | Primary key                     |
| userId     | INT      | Foreign key referencing `user`  |
| score      | INT      | Score obtained in the quiz      |
| playedDate | DATE     | Date when the quiz was played   |

🔢 **Scoreboard Logic**: Only displays **each player's highest score**, sorted in **descending order**.

---


# ⚠️ Project Limitations – JavaQuiz

This document outlines the known limitations and current drawbacks of the JavaQuiz project. These are noted for transparency, future development, and improvement planning.

---

## 🔐 User Management

- **Hardcoded GameMaster Account**
  - The GameMaster (admin) is hardcoded in the source code instead of being stored in the database.
  - This limits flexibility and scalability and is not secure for production use.

- **Plain Text Passwords**
  - User passwords are stored and processed as plain text.
  - No encryption or hashing is implemented, making it vulnerable to data breaches.

---

## 🎮 Gameplay and Logic

- **Same Questions for Every Player**
  - All players receive the same set of questions in the same order.
  - There's no randomness or category-based filtering implemented yet.

- **Replayability Issues**
  - Players can replay the quiz multiple times without restriction or change in question set.

- **No Timer Mechanism**
  - There is no time limit for answering questions, reducing challenge and urgency.

---

## 💥 Error Handling

- **Minimal Exception Handling**
  - Many parts of the application lack try-catch blocks.
  - Common issues like invalid input, null values, or database disconnection can crash the app.

- **No User Feedback on Errors**
  - Errors are often printed to the console or shown as stack traces instead of user-friendly messages.

---

## 🖥️ UI & Usability

- **No GUI (Console-Only)**
  - The application is entirely text-based and runs in the terminal/command line.
  - This limits user experience for non-technical users.

- **Poor Input Validation**
  - Users can input invalid menu choices, letters instead of numbers, etc., which are not handled gracefully.

---

## 📊 Scoreboard and Reporting

- **Only Highest Score Displayed**
  - The scoreboard displays only the highest score of each player.
  - There's no historical score tracking or game logs.

- **No Export Functionality**
  - Scores and results cannot be exported to PDF, CSV, or JSON formats.

---

## 🧪 Testing and Scalability

- **Not Optimized for Large User Base**
  - The application logic and database queries are written for small-scale use.
  - It hasn't been stress-tested for concurrent users or high-volume data.

- **No Automated Testing**
  - There are no unit tests or integration tests for any of the modules.

---

## 📈 Future Improvements

- Add password hashing (e.g., BCrypt)
- Implement question categories and randomization
- Add GUI using JavaFX or Swing
- Improve error handling and input validation
- Introduce timer-based quiz mode
- Enable full quiz history tracking per user
- Implement role-based login from the database
- Add reporting/export features

---

> These limitations are acknowledged to encourage future improvements and contributions. If you're interested in helping improve the project, feel free to open a pull request or issue.

---
