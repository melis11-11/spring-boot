# Spring Boot Product API

This is my introduction to Spring Boot and REST APIs. I built a small Product API to practice handling HTTP requests in Java and testing CRUD operations with Postman.

## What it does

- **GET** retrieves products.
- **POST** creates a product.
- **PUT** updates a product.
- **DELETE** removes a product.

## Built with

Java 17, Spring Boot 4.1.0, Spring Web MVC, and Maven. The project includes the Maven Wrapper and a Dockerfile.

## Run locally

Install JDK 17 or newer, then clone the repository and start the application from the `product-api` folder:

```bash
git clone https://github.com/melis11-11/spring-boot.git
cd spring-boot/product-api
./mvnw spring-boot:run
```

On Windows, use `mvnw.cmd spring-boot:run` instead. The Maven Wrapper downloads the required Maven version on the first run.

Once the application starts, use Postman to send requests to the local server. Check the startup output for the port in use.

## Build and test

Run these commands from `product-api`:

```bash
./mvnw test
./mvnw clean package
```

The packaged application is written to `product-api/target/`.

## Project layout

- `product-api/src/` — application source and tests
- `product-api/pom.xml` — dependencies and build settings
- `product-api/mvnw` and `mvnw.cmd` — Maven Wrapper scripts
- `product-api/Dockerfile` — container configuration

This is a learning project that records my first steps with Java backend development.
