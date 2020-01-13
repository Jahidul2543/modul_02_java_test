package datastructure;

import db.DbConnection;

import java.util.ArrayList;
import java.util.Collections;

public class UseArrayList {

	public static void main(String[] args) {

		/**
		 * @author Jahidul Islam
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		 ArrayList<String>books=new ArrayList<String>();
		books.add("maths");
		books.add("islamic");
		books.add("english");
		books.add("science");
		int size=books.size();
		System.out.println(size);
		books.get(3);
		for(String i: books){
			System.out.println(i);
		}
		books.remove(3);
		for(String b: books){
			System.out.println(b);
		}
		DbConnection.createTableFromStringToMySql("subjects","book");
		DbConnection.insertDataFromArrayListToMySql(Collections.singletonList("books"),"subjects","book");
	

	}

}
