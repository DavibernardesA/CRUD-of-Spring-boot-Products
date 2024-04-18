# CRUD Products RESTful API using Spring Boot.

This is a CRUD (Create, Read, Update, Delete) RESTful API developed with Spring Boot that allows operations on products.

## Available Routes

### 1. List Products

**GET /products**

This route returns a list of all registered products.

### 2. Show Product Details

**GET /products/{id}**

This route returns the details of a specific product based on the provided ID.

### 3. Create a New Product

**POST /products**

This route allows creating a new product. You need to send the product data in the request body in JSON format.

Example request body:

```
{
  "name": "Product Name",
  "description": "Product Description",
  "price": 10.99
}
```

### 4. Update an Existing Product

**PUT /products/{id}**

This route allows updating the details of an existing product based on the provided ID. You need to send the updated product data in the request body in JSON format.

Example request body:
```
{
  "name": "New Product Name",
  "description": "New Product Description",
  "price": 15.99
}
```

### 5. Delete a Product

**DELETE /products/{id}**

This route allows deleting an existing product based on the provided ID.

## Configuration

Before running the application, you need to configure the database and other properties. You can configure the database information in the `application.properties` file.

Make sure you have Java and Maven installed on your machine to compile and run the application.

## How to Run

1. Clone this repository:
```
https://github.com/DavibernardesA/CRUD-of-Spring-boot-Products
```

2. Navigate to the project directory: cd CRUD-of-Spring-boot-Products

3. Compile the application using Maven: mvn clean install

4. Run the application: java -jar target/Secure-Authenticator-with-Spring-Boot-and-JWT

5. The application will be available at `http://localhost:8080`.

 ## Author✍️

<a href=https://github.com/DavibernardesA>
<img src="https://github.com/DavibernardesA/sistema-bancario-backend/assets/133716733/6ba09c22-9eae-4601-980c-81533bd7b4f9" width="100px;" alt=""/>
<br>
<b>Davi Bernardes</b></a>
<br/>
Contact:

[![Linkedin Badge](https://img.shields.io/badge/-Linkedin-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/davi-bernardes-do-nascimento-7b62a4274/)](https://www.linkedin.com/in/davi-bernardes-do-nascimento-7b62a4274/)
[![Gmail Badge](https://img.shields.io/badge/-Gmail-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:davi.10bernardes@gmail.com)](mailto:davi.10bernardes@gmail.com)
