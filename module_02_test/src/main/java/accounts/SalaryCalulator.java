package accounts;



import db.DbConnection;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class SalaryCalulator {
    /**
     * @author Jahidul Islam
     * This class should have all the method necessary to calculate salary of 10 employees
     * Create employees table in MySQL Database and store employees information in that table
     * Use db package to get helper methods to connect to db and read employees information
     * Create methods to calculate monthly and yearly salary after tax where 35% tax has to be deducted from actual salary
     * This class consists only helper methods, you should not declare any main method here.
     * Main method is being declared in App class
     */
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        SalaryCalulator obj1=new SalaryCalulator();
        connectMySql();

    }
        public static void connectMySql () throws ClassNotFoundException, SQLException, IOException {

            Properties properties = loadProperties();

            String url = properties.getProperty("jdbc:mysql://localhost:3306/ahad?autoReconnect=true&useSSL=false");
            String userName = properties.getProperty("root");
            String passWord = properties.getProperty("root");

            Class.forName("com.mysql.jdbc.Driver");

            Connection connect = DriverManager.getConnection(url, userName, passWord);

            System.out.println("Database Connected");

        }

        public static Properties loadProperties () throws IOException {

            InputStream inputStream = new FileInputStream("src/main/resources/secret.properties");

            Properties properties = new Properties();
            properties.load(inputStream);
            inputStream.close();
            return properties;
        }


    }
