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

| Column   | Type     | Description          |
|----------|----------|----------------------|
| userId   | INT      | Primary key          |
| username | VARCHAR  | Unique username      |
| password | VARCHAR  | User password        |

### `score` Table

| Column     | Type     | Description                     |
|------------|----------|---------------------------------|
| scoreId    | INT      | Primary key                     |
| userId     | INT      | Foreign key referencing `user`  |
| score      | INT      | Score obtained in the quiz      |
| playedDate | DATE     | Date when the quiz was played   |

🔢 **Scoreboard Logic**: Only displays **each player's highest score**, sorted in **descending order**.
