package main.java.accounts;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.activation.DataSource;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

    /**
     * @author Jahidul Islam
     * Use methods from the SalaryCalculator class to calculate salary of an employee
     */

    public static <ontext> void main(String[] args) throws SQLException, IOException, ClassNotFoundException, NamingException {

        main.java.db.DbConnection.connectMySql();


    }
}










