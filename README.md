# Spring Boot Product API

A simple REST API built with Java and Spring Boot to practice backend development, HTTP requests, and CRUD operations.

This is one of my introductory backend projects, where I explored how REST APIs handle client requests and how applications can be tested using Postman.

## Features

The API supports basic CRUD operations:

- **Create:** Add a new product.
- **Read:** Retrieve all products or find a specific product by ID.
- **Update:** Modify an existing product.
- **Delete:** Remove a product.

Each product contains an ID, name, and price.

## Technologies Used

- Java 17
- Spring Boot 4.1.0
- Spring Web MVC
- Maven
- Postman for manual API testing

## API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/products` | Retrieve all products |
| GET | `/api/products/{id}` | Retrieve a product by ID |
| POST | `/api/products` | Create a new product |
| PUT | `/api/products/{id}` | Update an existing product |
| DELETE | `/api/products/{id}` | Delete a product |

## Example API Request

To create a product, send a POST request to:

`http://localhost:8080/api/products`

With the following JSON body:

```json
{
  "name": "Basketball",
  "price": 29.99
}
```

The application assigns an ID to the product and returns the created product.

Products are stored in memory, so the data resets when the application restarts.

## How to Run Locally

**Requirements:** JDK 17 or newer and Git.

Clone the repository:

```bash
git clone https://github.com/melis11-11/spring-boot.git
```

Navigate to the application directory:

```bash
cd spring-boot/product-api
```

Run the application:

```bash
./mvnw spring-boot:run
```

On Windows, use `mvnw.cmd spring-boot:run`.

Once the application starts, use Postman to send requests to `http://localhost:8080/api/products` (assuming the default port).

## Build and Test

From the `product-api` directory, run:

```bash
./mvnw test
./mvnw clean package
```

These commands run the existing tests and build the application. The results have not been independently verified.

The packaged application is generated in the `target` directory.

## Project Structure

- `product-api/src/main/` — Java application source code
- `product-api/src/test/` — Application tests
- `product-api/pom.xml` — Maven dependencies and configuration
- `product-api/Dockerfile` — Container configuration

## What I Learned

This project helped me understand the fundamentals of Java backend development, including how to design REST endpoints, process HTTP requests, organize application logic, and manually test CRUD operations using Postman.

It gave me practical experience with Spring Boot and introduced me to how backend services support larger software applications.
