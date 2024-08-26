# hospital-microservice

This repository contains a series of microservices developed in Java as part of the "Dr. House" exercise series. These microservices simulate different aspects of a hospital management system.

## Microservices

1. **Accountancy Service** (`service-accountancy/`): Manages billing, invoicing, and financial records.
2. **Admission Service** (`service-admission/`): Handles patient admissions and registration.
3. **Treatment Service** (`service-treatment/`): Manages treatment plans and patient care records.
4. **Diagnosis Service** (`service-diagnosis/`): Responsible for diagnosing patients based on symptoms and medical records.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- RESTful APIs
- Docker
- JUnit for testing

## How to Run

Each microservice can be run independently. Navigate to the respective microservice directory and use the following commands:

```bash
mvn clean install
mvn spring-boot:run
