package datastructure;

import db.DbConnection;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public void demo() {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        for (String s : set) {
            System.out.println("s = " + s);
        }
        DbConnection.createTableFromStringToMySql("test", "data");
        set.forEach(s -> DbConnection.insert("test", "data",s));

    }

    /**
     * @author Jahidul Islam
     * Create HashSet and store data
     * Get the data from HashSet and print
     * Get the data from HashSet and insert it in db table
     *
     * */
}
