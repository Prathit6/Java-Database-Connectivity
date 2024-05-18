# Java-Database-Connectivity using JDBC

This project demonstrates how to connect a Java application to a database using JDBC. The process involves five key steps: registering the driver class, creating a connection, creating a statement, executing queries, and closing the connection. 

## Steps to Connect Java Application with MYSQL Database
   
    1.Register the Driver class
    2.Create connection
    3.Create statement
    4.Execute queries
    5.Close connection

### 1. Register the Driver Class
To register the driver class, use the following line of code:

link for java-
https://github.com/Prathit6/Java-Database-Connectivity/blob/main/src/testdatabase06/Type4Select.java#L28

### 2. Create Connection
Establish a connection to the Oracle database using the connection URL, username, and password:

link for java-
https://github.com/Prathit6/Java-Database-Connectivity/blob/main/src/testdatabase06/Type4Select.java#L36

### 3. Create Statement
Create a statement object to execute queries:

link for java-
https://github.com/Prathit6/Java-Database-Connectivity/blob/main/src/testdatabase06/Type4Insert.java#L39

### 4. Execute Queries
Use the statement object to execute queries. Common methods include:

link for java-
https://github.com/Prathit6/Java-Database-Connectivity/blob/main/src/testdatabase06/Type4Select.java#L45

### 5. Close Connection
Close the connection to free up database resources:

link for java-
https://github.com/Prathit6/Java-Database-Connectivity/blob/main/src/testdatabase06/Type4Insert.java#L55

#### 1. Connection Interface
A Connection is a session between a Java application and a database. It helps to establish a connection with the database.

#### 2. Statement interface
The Statement interface provides methods to execute queries with the database. The statement interface is a factory of ResultSet interfacei.e. it provides factory method to get the object of ResultSet.

#### 3.  ResultSet interface
The object of ResultSet maintains a cursor pointing to a row of a table. Initially, cursor points to before the first row.
By default, ResultSet object can be moved forward only and it is not updatable.

#### PreparedStatement Interface

The `PreparedStatement` interface is a subinterface of `Statement` and is used to execute parameterized queries. For example:
java
String sql = "INSERT INTO emp VALUES (?, ?, ?)";
PreparedStatement pstmt = con.prepareStatement(sql);
pstmt.setInt(1, 1); // Setting the first parameter
pstmt.setString(2, "John Doe"); // Setting the second parameter
pstmt.setDouble(3, 5000.00); // Setting the third parameter
pstmt.executeUpdate()

like for java :
https://github.com/Prathit6/Java-Database-Connectivity/blob/main/src/testdatabase06/Type4PreparedStatement.java#L43-L52

