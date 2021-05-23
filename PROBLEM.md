# Spring Boot Testing - TollGate Assessment - BookApp

## Objective

In this case study, we will create a simple sprint boot web application where you should be able to add books and view all books and also view a particular book by its id. Unit Testing code has to be written for controller an service layers using Junit 5 and Mockito framework.The API should be tested by writing Postman Scripts and Rest Assured coding.

## Following are the steps:
	
- Define the model class Book with the following Properties

			- bookId : String
			- bookName : String
			- bookAuthor : String
			- bookPice : double

- Configure the connection properties for MySql database in application.properties file 


- Annotate the BookRepository with appropriate annotations


- Implement all the methods of BookService interface in BookServiceImpl 


- Complete the controller methods to create REST web service API as per the comments given


- Write test cases for controller and service methods using Junit5 and Mockito


       - Create the test files under src/test/java in com.stackroute.book package
       - Give the name as BookControllerTest and BookServiceTest


- Write Postman scripts for checking the REST API using the URI mentioned in the comments


       - Save the file as postmanscripts.txt under the root folder 


- Write Rest Assured test cases for testing the REST API for the CRUD operations mentioned


        - Save the file under src/test/java in com.stackroute.book.rest package
        - Give the file name as RestAssuredBookTest

