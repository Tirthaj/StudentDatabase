# StudentDatabase

A Spring Boot Application that takes json data and stores it on a PostgreSQL database.
The application successfully performs CRUD operations on the database.
This project has the following Layers:
1. API Layer: This is where the GET, POST, PUT, DELETE APIs are located.
2. Service Layer: This layer contains the business logic that manages the student data, and acts as an intermediary layer between the API and Data access layer.
3. Data Access layer: This layer communicates with the database and fetches and updates the database.
