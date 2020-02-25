package dbtest;

import db.DbConnection;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class DbConnectionTest {
    @BeforeClass
    public void setUp() {
        try {
            DbConnection.loadProperties();
            DbConnection.connectMySql();
        } catch (IOException | SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        DbConnection.createTableFromStringToMySql("test", "value");
        List<String> data = new ArrayList<>();
        data.add("a");
        data.add("b");
        DbConnection.insertDataFromArrayListToMySql(data, "test", "value");

    }

    @Test
    public void testReadDatabase() throws SQLException, IOException, ClassNotFoundException {
        List<String> strings = DbConnection.readDatabase("test", "value");
        Assert.assertNotEquals(0, strings.size());
    }

    @Test
    public void testGetResultSetData() throws SQLException {
        List<String> value = DbConnection.getResultSetData("value");
        Assert.assertNotEquals(0, value.size());

    }
}
