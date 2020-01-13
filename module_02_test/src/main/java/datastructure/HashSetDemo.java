package datastructure;

import db.DbConnection;

import java.util.Collections;
import java.util.HashSet;

public class HashSetDemo {

    /**
     * @author Jahidul Islam
     * Create HashSet and store data
     * Get the data from HashSet and print
     * Get the data from HashSet and insert it in db table
     */
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("honda");
        cars.add("bmw");
        cars.add("toyota");
        cars.add("mercedes");
        cars.add("ferrari");
        for(String x: cars){
            System.out.println(x);
        }
        DbConnection.createTableFromStringToMySql("cars","rides");
        DbConnection.insertDataFromArrayListToMySql(Collections.singletonList("honda,"),"cars","rides");
        DbConnection.insertDataFromArrayListToMySql(Collections.singletonList("bmw"),"cars","rides");
        DbConnection.insertDataFromArrayListToMySql(Collections.singletonList("ferari"),"cars","rides");
        DbConnection.insertDataFromArrayListToMySql(Collections.singletonList("toyota"),"cars","rides");
        DbConnection.insertDataFromArrayListToMySql(Collections.singletonList("mercedes"),"cars","rides");

    }
}