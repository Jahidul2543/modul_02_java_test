package accounts;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.DbConnection;

public class SalaryCalulator2 {
	 
    
	
	/**
     * @author Jahidul Islam
     * This class should have all the method necessary to calculate salary of 10 employees
     * Create employees table in MySQL Database and store employees information in that table
     * Use db package to get helper methods to connect to db and read employees information
     * Create methods to calculate monthly and yearly salary after tax where 35% tax has to be deducted from actual salary
     * This class consists only helper methods, you should not declare any main method here.
     * Main method is being declared in App class
     * */
	
	
	
	public  void doUnitTest() throws SQLException, ClassNotFoundException {

	      try {
	    	  List<String> list =  DbConnection.readDatabase("testable", "amount");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
		     
	    }
	
	
}
