package accounts;

import java.sql.SQLException;

public class App {

    /**
     * @author Jahidul Islam
     * Use methods from the SalaryCalculator class to calculate salary of an employee
     *
     * */

	public static void main(String[] args) {
		SalaryCalulator yarlySalary = new SalaryCalulator();
        try {
        	yarlySalary.getStudentInfoFromStudentTable();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }
}
