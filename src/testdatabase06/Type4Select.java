
package testdatabase06;


import java.sql.Connection;
import java.sql.Statement ;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
 


/**
 *
 * @author prathit
 */
public class Type4Select {
    
    public static void main(String[] args) {
        
        
       Connection con = null;
       Statement st = null;
       ResultSet rs =null;
       
       try{
       
           Class.forName("com.mysql.jdbc.Driver");
          System.out.println("Driver loaded!");
          



          
         
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?charecterEncoding=latinl","prathit-dode","@ptcdode1");
       
       System.out.println("connected");
       
       
       st = con.createStatement();
       
       String query ="select * from emp";
       
       rs =st.executeQuery(query);
       
       while(rs.next()){
       
     
             System.out.print(rs.getString(1)+"\t");  
             System.out.print(rs.getString(2)+"\t");
             System.out.print(rs.getString(3)+"\t");
             System.out.print(rs.getString(4)+"\n");
       
       
       }
       con.close();
       
    } 
       catch(ClassNotFoundException e){
       
           System.out.println(e);
       
       }
       catch(SQLException e){
           
           System.out.println(e);
       }
       
    }
}