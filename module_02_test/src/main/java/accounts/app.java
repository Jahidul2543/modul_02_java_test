package accounts;
import db.DbConnection;

import java.io.IOException;
import java.sql.*;



public class app {
        public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

            DbConnection.readDatabase("employees","email");
            //DbConnection.getResultSetData("lastname");
            //DbConnection.createTableFromStringToMySql("ahad","players");




        }
    }

