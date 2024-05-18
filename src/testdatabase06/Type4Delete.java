package testdatabase06;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Type4Delete {

    public static void main(String[] args) {

        Connection con = null;
        Statement st = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded!");

//conncting to our database 
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "prathit-dode", "@ptcdode1");

            System.out.println("connected");

            st = con.createStatement();

            String query = "Delete from emp where emp_id=101";

            int i = st.executeUpdate(query);

            if (i > 0) {

                System.out.println(i+"Record Deleted..");

            } else {

                System.out.println("Record Deletion failed");

            }

            con.close();//is for closing connction 

        } catch (ClassNotFoundException e) {

            System.out.println(e);

        } catch (SQLException e) {

            System.out.println(e);
        }

    }
}

