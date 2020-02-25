package datastructure;

import db.DbConnection;

import java.util.*;

public class MapDemo {

    /**
     * @author Jahidul Islam
     * Create a Map reference variable and store information as you like
     * Show me all possible retrieval process
     * Store map in DB
     *
     * */
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Id", "1");
        map.put("name", "Nahian");
        map.put("Ciity", "Hudson");
        System.out.println(map.getOrDefault("Id",""));
        DbConnection connection = new DbConnection();
        List<String> key = new ArrayList<>(map.keySet());
        List<String> value = new ArrayList<>(map.values());
       DbConnection.createTableFromStringToMySql("test2","value");
       DbConnection.insertDataFromArrayListToMySql(key, "test2", "value");
       DbConnection.insertDataFromArrayListToMySql(value, "test2", "value");
    }

}
