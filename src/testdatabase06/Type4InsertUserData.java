
package testdatabase06;



import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Type4InsertUserData{
    
    public static void main(String[] args) {
        
        
       Connection con = null;
       Statement st = null;
       
       
       try{
       
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
          
         
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","prathit-dode","@ptcdode1");
       
       System.out.println("connected");
       
       
       st=con.createStatement();
       
       //String query ="insert into emp values('108','ABCD','100','indore');";
       //Alternate 
       
       String query ="insert into emp values('"+id+"','"+name+"','"+salary+"','"+city+"')";
       
      // String query ="insert into emp values('"+id+"','"+name"','"+city"')";
       
      System.out.println("Query = "+query);
       int i=st.executeUpdate(query);
       
       if(i>0){
       
           
           System.out.println("record Inserted..");
               
            
       }
       else{
       
       
       System.out.println("Record insertion fail");
       
       }
      
       con.close();//is for closing connction 
       
    }
       catch(ClassNotFoundException e){
       
           System.out.println(e);
       
       }
       catch(SQLException e){
           
           System.out.println(e);
       }
       
    }
}

