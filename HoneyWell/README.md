Tomcat initialized with port(s): 8081 (http)

Steps to Run
###################
Step 1: install maven
Step 2: run mvn clean
Step3:  run mvn install
Step4:  Run as java application 
          /HoneyWell/src/main/java/com/honeywell/Application.java 
      
Step: call the below API from Postman or any other tool

API 
############### Employee CRUD #################

3. get employee by id
http://localhost:8081/employee{id}

user id 1 is already present
http://localhost:8081/employee/1


1. create employee

http://localhost:8081/employee
{
  "name": "RAM",
  "age" :36
}

2. get all user
http://localhost:8081/employee



4. delete user
http://localhost:8081/employee{id}


Note on H2 database:-
#####################
You can connect to DB GUI  by clicking on below link once after spring boot application is running

H2 DB app url : http://localhost:8081/console/
 
Please enter these details to UI

Driver Class: org.h2.Driver
JDBC URL: jdbc:h2:mem:testdb
username: sa
passw:


Employee table schema and seed data present under 
 - src/main/resources/schema.sql
 - src/main/resources/data.sql
 




