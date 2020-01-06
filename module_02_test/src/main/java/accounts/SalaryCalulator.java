package accounts;

public class SalaryCalulator {

    /**
     * @author Jahidul Islam
     * This class should have all the method necessary to calculate salary of 10 employees
     * Create employees table in MySQL Database and store employees information in that table
     * Use db package to get helper methods to connect to db and read employees information
     * Create methods to calculate monthly and yearly salary after tax where 35% tax has to be deducted from actual salary
     * This class consists only helper methods, you should not declare any main method here.
     * Main method is being declared in App class
     * */
    public static void main(String[]args) {
		int age;
		String name,address,department;
		Employee get =new Employee();
		System.out.println("Saman hussain:");
		System.out.println("pakistan");
		System.out.println("HumanResources");
		
		System.out.println("Fairuz Ahmed:");
		System.out.println("Bangladesh");
		System.out.println("Accounts");
		
		System.out.println("Kamrun siddika:");
		System.out.println("Bangladesh");
		System.out.println("Management");
			
		}
	}
public class FullTimeEmployee extends Employee{ 
	
	public static void main(String[]args) {
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

}
