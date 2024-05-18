package testdatabase06;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Type4PreparedStatement {

    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement pst = null;

        try {
            
           Scanner sc = new Scanner(System.in);
           
           System.out.print("Enter Id: ");
           int id =sc.nextInt();
           
           System.out.print("Enter Name: ");
           String name =sc.next();
           
           System.out.print("Enter Selery: ");
           int salary =sc.nextInt();
           
           System.out.print("Enter city: ");
           String  city =sc.next();

         Class.forName("com.mysql.jdbc.Driver");
         System.out.println("Driver loaded!");

       
//conncting to our database 
          
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "prathit-dode", "@ptcdode1");


            System.out.println("connected");

            pst = con.prepareStatement("insert into emp values(?,?,?,?)");
            
            
       
      // String query ="insert into emp values('"+id+"','"+name"','"+city"')";
       
      pst.setInt(1, id);
      pst.setString(2, name);
      pst.setInt(3, salary);
      pst.setString(4, city);
      
      
       int i=pst.executeUpdate();

            

            if (i > 0) {

                System.out.println(i+"Record Inserted..");

            } else {

                System.out.println("Record Insertion failed");

            }

            con.close();//is for closing connction 

        } catch (ClassNotFoundException e) {

            System.out.println(e);

        } catch (SQLException e) {

            System.out.println(e);
        }

    }
}

