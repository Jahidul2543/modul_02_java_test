package datastructure;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    /**
     * @author Jahidul Islam
     * Create a Map reference variable and store information as you like
     * Show me all possible retrieval process
     * Store map in DB
     *
     * */
	
	public static void main(String[] args) {
		//HashMap<String, String> usermap = new  HashMap<String, String>();

		Map<String, String> usermap = new  HashMap<String, String>();
		usermap.put("Id", "1");
		usermap.put("name", "Nahian");
		usermap.put("Ciity", "Hudson");
		System.out.println(usermap.get("Id"));

		for(Map.Entry m :usermap.entrySet()) {
			System.out.println(m.getKey()+"  " + m.getValue());
			
			
		}

			}
	
	
}
