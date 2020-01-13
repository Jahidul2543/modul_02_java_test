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
//    /**
//     * @author Jahidul Islam
//     * This class should have all the method necessary to calculate salary of 10 employees
//     * Create employees table in MySQL Database and store employees information in that table
//     * Use db package to get helper methods to connect to db and read employees information
//     * Create methods to calculate monthly and yearly salary after tax where 35% tax has to be deducted from actual salary
//     * This class consists only helper methods, you should not declare any main method here.
//     * Main method is being declared in App class
//     */
public double monthly()
{
    double taxRate = 0.35;
    double tax = 4000 * taxRate;
    double netSalary = 4000 - tax;
    return netSalary;
}
    public double year()
    {
        double taxRate = 0.35;
        double tax = 40000 * taxRate;
        double netSalary = 40000 - tax;
        return netSalary;
    }

}
