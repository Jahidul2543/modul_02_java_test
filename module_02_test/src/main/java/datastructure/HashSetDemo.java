package datastructure;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import db.DbConnection;

public class HashSetDemo {

  
	static  HashSet<String> country;
	static ArrayList<String> countrylist;
	static String BirthPlace;
	static String employee;
	public static void main(String[]args) 
    { 
		HashSetDemo hash = new HashSetDemo();
		country = new HashSet<String>(); 
  
        country.add("India"); 
        country.add("Australia"); 
        country.add("South Africa"); 
        country.add("Japan");
        country.add("Bangladesh"); 
        country.add("Brazil"); 
        country.add("Nepal"); 
        country.add("France");
        country.add("Bangladesh");
        country.add("India");
System.out.println(country);
List<String> countrylist = new ArrayList<String>(country.size());
for (String myStr : country) 
{ 
	countrylist.add(String.valueOf(myStr)); 
                    
 }
System.out.println(countrylist);
hash.insertData();
	
    }
	
	public  void insertData() {
		
		DbConnection.insertDataFromArrayListToMySql(countrylist, employee, BirthPlace);
	}
}
