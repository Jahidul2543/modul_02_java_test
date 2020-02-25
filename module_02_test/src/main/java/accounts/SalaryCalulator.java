package accounts;

import db.DbConnection;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

public class SalaryCalulator {
    public static String table = "Em";
    public static String col = "sa";

    public static int cal(List<Employee> employees) {
        int total = 0;
        for (Employee e : employees) {
            total += e.salary;
        }
        return total;
    }


    public void save(List<Employee> employees) {
        try {
            DbConnection.loadProperties();
            DbConnection.connectMySql();
            DbConnection.createTableFromStringToMySql(table, col);
			List<String> collect = employees.stream().map(employee -> employee.salary + "").collect(Collectors.toList());
			DbConnection.insertDataFromArrayListToMySql(collect, table, col);


        } catch (ClassNotFoundException | SQLException | IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * @author Jahidul Islam
     * This class should have all the method necessary to calculate salary of 10 employees
     * Create employees table in MySQL Database and store employees information in that table
     * Use db package to get helper methods to connect to db and read employees information
     * Create methods to calculate monthly and yearly salary after tax where 35% tax has to be deducted from actual salary
     * This class consists only helper methods, you should not declare any main method here.
     * Main method is being declared in App class
     */

}

class FullTimeEmployee extends Employee {

    public static void main(String[] args) {
        float salary;
        int des;
        System.out.println("HR Manager");
        System.out.println("40000");
        System.out.println("Accounts Manager");
        System.out.println("40000");
        System.out.println("Event Manager");
        System.out.println("40000");


    }

}

