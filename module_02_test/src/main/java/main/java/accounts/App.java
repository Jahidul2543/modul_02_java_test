package main.java.accounts;

import accounts.SalaryCalulator;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import db.DbConnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class App {
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        DbConnection.readDatabase("employees","employeeId","name","salary");
        SalaryCalulator obj1=new SalaryCalulator();
        double y =obj1.monthly();
        System.out.println("your mothly salary after tax is: "+y);
        double x=obj1.year();
        System.out.println("your yearly salary after tax is: "+x);
    }



}














