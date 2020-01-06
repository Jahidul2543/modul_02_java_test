package datastructure;

import java.util.HashMap;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/**
		 * @author Jahidul Islam
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * You can use any other retrieval process
		 * Use any databases[ MySql] to store data and retrieve data.
		 */
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