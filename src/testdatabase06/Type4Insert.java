
package testdatabase06;


import java.sql.Connection;
import java.sql.Statement ;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Type4Insert{
    
    public static void main(String[] args) {
        
        
       Connection con = null;
       Statement st = null;
       
       
       try{
       
           Class.forName("com.mysql.jdbc.Driver");
          System.out.println("Driver loaded!");
          


//conncting to our database 
          
         
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","prathit-dode","@ptcdode1");
       
       System.out.println("connected");
       
       
       st=con.createStatement();
       
       String query ="insert into emp values('100','KUNWAR SINGH','1400','PITHAMPUR');";
       
       int i=st.executeUpdate(query);
       
       if(i>0){
       
           
           System.out.println("Record Inserted..");
               
            
       }
       else{
       
       
       System.out.println("Record insertion failed");
       
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
