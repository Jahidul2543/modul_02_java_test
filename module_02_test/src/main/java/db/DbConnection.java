package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DbConnection {

    /**
     *
     * This is a helper class to interact with MySQL Database tables
     * You are free to enhance this class as needed
     *
     * */


   static Connection connect = null;
   static Statement statement = null;
   static ResultSet resultSet = null;
   static PreparedStatement ps = null;


   public static Properties loadProperties() throws IOException {

       InputStream inputStream = new FileInputStream("src/main/resources/secret.properties");

       Properties properties = new Properties();
       properties.load(inputStream);
       inputStream.close();
       return properties;
   }

    public static void connectMySql() throws ClassNotFoundException, SQLException, IOException {

      Properties properties = loadProperties();

        String url = properties.getProperty("MYSQL.url");
        String userName = properties.getProperty("MYSQL.userName");
        String passWord = properties.getProperty("MYSQL.password");

         Class.forName("com.mysql.jdbc.Driver");

         connect = DriverManager.getConnection(url,userName,passWord);

        System.out.println("Database Connected");

    }
    /**
     * Read database
     *
     * */

    public static List<String> readDatabase(String tableNmae, String nameOfColumn1) throws SQLException, ClassNotFoundException, IOException {

        List<String> list = new ArrayList<>();

        connectMySql();
        statement = connect.createStatement();
        resultSet = statement.executeQuery("select * from "+ tableNmae);
        list = getResultSetData(nameOfColumn1);
        return list;
    }

    public static List<String> getResultSetData(String nameOfColumn1) throws SQLException {

        List<String> dataList = new ArrayList<>();

        while (resultSet.next()){

            String cell1 = resultSet.getString(nameOfColumn1);


            dataList.add(cell1);

        }

        return dataList;

    }

    public static List<String> readDatabase(String tableNmae, String nameOfColumn1,String nameOfColumn2, String nameOfColumn3) throws SQLException, ClassNotFoundException, IOException {

        List<String> list = new ArrayList<>();

        connectMySql();
        statement = connect.createStatement();
        resultSet = statement.executeQuery("select * from "+ tableNmae);
        list = getResultSetData(nameOfColumn1,nameOfColumn2,nameOfColumn3);
        return list;
    }

    public static List<String> getResultSetData(String nameOfColumn1,String nameOfColumn2, String nameOfColumn3 ) throws SQLException {

        List<String> dataList = new ArrayList<>();

        while (resultSet.next()){

            String cell1 = resultSet.getString(nameOfColumn1);
            String cell2 = resultSet.getString(nameOfColumn2);
            String cell3 = resultSet.getString(nameOfColumn3);

            dataList.add(cell1); dataList.add(cell2); dataList.add(cell3);

        }

        return dataList;

    }

    /**
     *
     * Create Table
     *
     * */

    public static void createTableFromStringToMySql(String tableName, String columnName){
        try {
            connectMySql();
            ps = connect.prepareStatement("DROP TABLE IF EXISTS `"+tableName+"`;");
            ps.executeUpdate();
            ps = connect.prepareStatement("CREATE TABLE `"+tableName+"` (`ID` int(11) NOT NULL AUTO_INCREMENT,`"+columnName+"` varchar(2500) DEFAULT NULL,  PRIMARY KEY (`ID`) );");
            ps.executeUpdate();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    /**
     *
     * Insert data to a existing table
     *
     * */
    public static void insertDataFromArrayListToMySql(List<String> list,String tableName, String columnName)
    {
        try {
            connectMySql();

            for(String st:list){
                ps = connect.prepareStatement("INSERT INTO "+tableName+" ( "+columnName+" ) VALUES(?)");
                ps.setObject(1,st);
                ps.executeUpdate();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}

