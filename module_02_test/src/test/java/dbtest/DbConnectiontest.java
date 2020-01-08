package dbtest;

import java.io.IOException;
import java.sql.SQLException;

import org.testng.annotations.Test;


import db.dbPage;

public class DbConnectiontest {
	
	
	dbPage dbc = new dbPage();
	
	
	
	@Test
	public void testMYSQLConnectivity() {
		 dbc.connectMYSQl();
		 String exp = "Database Connected";
		 

		 
	}
	
	@Test
	public void readFromTable() throws SQLException, IOException, Exception {
		dbc.readFromDatabase();
	}

}
