package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {

		/**
		 * @author Jahidul Islam
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
	
		ArrayList ar = new ArrayList();

		System.out.println(ar.size());

		ar.add(100);// 0
		ar.add(200);// 1
		ar.add(300);// 2

		System.out.println(ar.size());

		System.out.println(ar.get(1));

		ar.add(400);// 3
		ar.add(500);// 4

		System.out.println(ar.size());

		ar.add(600);// 5
		ar.add(700);// 6
		
		ar.add(12.33);
		ar.add("test");
		ar.add('a');
		
		System.out.println(ar.size());

		System.out.println(ar.get(5));// 600
		// System.out.println(ar.get(7));

		 ar.remove(5);
		//
		 System.out.println(ar.size());
		 System.out.println(ar.get(5));

		
		
		
		//integer ArrayList
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		marksList.add(100);
		
		ArrayList<String> studentNames = new ArrayList<String>();
		studentNames.add("Tom");
		studentNames.add("Sarang");
		
		// Looping ArrayList using Iterator 
        Iterator it = studentNames.iterator(); 
        while (it.hasNext()) 
            System.out.println(it.next() );
		
		ArrayList<Object> employeeInfoList = new ArrayList<Object>();
		employeeInfoList.add("Nahian");
		employeeInfoList.add(25);
		employeeInfoList.add(true);
		employeeInfoList.add(12.236);
		// to print all the values from arraylist: for each loop
		for(Object k :employeeInfoList) {
			System.out.println(k);
		}
		
		
		
		
	}

}
