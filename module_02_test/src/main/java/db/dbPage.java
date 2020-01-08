package db;

import java.io.IOException;
import java.sql.SQLException;

public class dbPage{
	
public void connectMYSQl() {
	
	try {
		DbConnection.connectMySql();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
}
	
	
public void readFromDatabase() throws Exception, SQLException, IOException  {
	DbConnection.readDatabase("testable" , "id", "name", "amount");
	
	
}
	
	
	
	
	

}
