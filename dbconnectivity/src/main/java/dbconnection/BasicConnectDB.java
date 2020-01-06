package dbconnection;

import java.sql.*;
import java.util.Collection;

public class ConnectDB {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        connectDB();

    }
    public static void connectDB() throws ClassNotFoundException, SQLException {

        String username="root";
        String password="root";
        String url="jdbc:mysql://localhost:3306/qaautomation?autoReconnect=true&useSSL=false";
        String query= "select * from friends; ";
        //load and register driver
        Class.forName("com.mysql.jdbc.Driver");
      //  coonect
        Connection connection = DriverManager.getConnection(url,username,password);
        //prepare statement
        Statement statement = connection.createStatement();
        //execute statement
        ResultSet resultSet= statement.executeQuery(query);
        //process results
        //resultSet.next(); will psuh the pointer to next if there is any record
        resultSet.next();
        String name=resultSet.getString("name");
        System.out.println(" name"+" "+name);
        //close();
        statement.close();
        connection.close();

    }
}
