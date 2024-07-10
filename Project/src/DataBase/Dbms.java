
package DataBase;

import java.sql.*;

public class Dbms {
    public Connection connectDB(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_etec_database", "root", "");
            String msg = connection == null ? "Connection Field" : "Connection Success";
            System.out.println(msg);
        } catch(ClassNotFoundException e){
            System.err.println("ClassNotFoundException Server is have problem");
        } catch (SQLException e) {
            System.err.println("SQLException Server is have problem");
        }
        return connection;
    }     
}
    