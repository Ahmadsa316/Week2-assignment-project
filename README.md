# Week 2 Assignment – Shopping Cart (JavaFX + Localization)

## Overview

This project is a **JavaFX-based Shopping Cart application** that supports **multiple languages** using localization.

The application allows users to:

* Enter item prices and quantities
* Calculate the total cost
* Switch between different languages dynamically

---

## Features

* JavaFX GUI
* Multi-language support:

  * English (en)
  * Finnish (fi)
  * Swedish (sv)
  * Japanese (ja)
  * Arabic (ar)
* Dynamic UI translation using ResourceBundle
* Input handling and calculation logic
* Unit testing with JUnit
* Maven build system
* Docker support
* Jenkins pipeline configuration

---

## Project Structure

```
Week2_Assignment
│── src
│   ├── main
│   │   ├── java/org/example/week2_assignment
│   │   │   ├── Main.java
│   │   │   ├── ShoppingCartController.java
│   │   │   └── model/CartItem.java
│   │   └── resources/org/example/week2_assignment
│   │       ├── shopping_cart.fxml
│   │       ├── MessagesBundle_en_US.properties
│   │       ├── MessagesBundle_fi_FI.properties
│   │       ├── MessagesBundle_sv_SE.properties
│   │       ├── MessagesBundle_ja_JP.properties
│   │       └── MessagesBundle_ar_AR.properties
│   └── test/java/org/example/week2_assignment
│       └── ShoppingCartLogicTest.java
│
│── Screenshot/
│── pom.xml
│── Dockerfile
│── Jenkinsfile
```

---

## How to Run

### 1. Compile the project

```bash
mvn clean compile
```

### 2. Run the application

```bash
mvn javafx:run
```

---

## Running Tests

```bash
mvn test
```

---

## Docker

### Build Docker Image

```bash
docker build -t week2-assignment .
```

### Run Container

```bash
docker run week2-assignment
```

---

## Jenkins Pipeline

The project includes a Jenkins pipeline that:

* Builds the project
* Runs tests
* Packages the application
* Builds Docker image

---

## Screenshots

Screenshots of the application are available in the `Screenshot` folder.

---

## Technologies Used

* Java 17
* JavaFX
* Maven
* JUnit
* Docker
* Jenkins

---

## Notes

* UTF-8 encoding is used to support all languages correctly
* Arabic language support requires proper font rendering

---

## Author

Ahmad Sarfaraz
