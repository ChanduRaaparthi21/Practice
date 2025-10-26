Online Quiz Application
This project consists of an Online Quiz Application designed and developed using two different architectural styles:

Monolithic Architecture
Microservices Architecture
Overview
The application allows users to participate in quizzes, track their scores, and manage questions. It includes features like user authentication, question management, and an admin panel.

Monolithic Architecture
In the monolithic version, all components such as:

User authentication
Question handling
Scoring system
Admin panel
are tightly integrated into a single codebase, making it simple to develop and deploy initially.

Microservices Architecture
In the microservices version, the application is divided into independent services:

User Authentication Service
Question Management Service
Scoring Service
Admin Service
Each service is self-contained and communicates via APIs, providing better scalability, flexibility, and ease of maintenance.

Features
User Authentication: Login/Signup for users to participate in quizzes.
Quiz Management: Admin can add, edit, or delete quiz questions.
Scoring System: Tracks and displays users' scores after completing the quiz.
Admin Panel: Manages quizzes and users.
Setup
Prerequisites
Java 8 or higher
Spring Boot (for both architectures)
Docker (for microservices architecture)
Monolithic Setup
Clone the repository.
Navigate to the monolithic directory.
Run the application using mvn spring-boot:run.
Microservices Setup
Clone the repository.
Navigate to each microservice folder (e.g., user-auth, quiz-service, etc.).
Build and run each microservice individually or use Docker to containerize and run them.
Technologies Used
Java 8+
Spring Boot
MySQL (or any database for persistence)
RESTful APIs
Docker (for Microservices)
