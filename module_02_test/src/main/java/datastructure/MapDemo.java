package datastructure;

import db.DbConnection;

import java.util.Collections;
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
        Map<String, String> objMap = new HashMap<String, String>();
        objMap.put("Name", "Suzuki");
        objMap.put("Power", "220");
        objMap.put("Type", "2-wheeler");
        objMap.put("Price", "85000");
        System.out.println("Elements of the Map:");
        System.out.println(objMap);
        DbConnection.createTableFromStringToMySql("objMap","relation");
        DbConnection.insertDataFromArrayListToMySql(Collections.singletonList("objMap"),"objMap","relation");
    }

    }

