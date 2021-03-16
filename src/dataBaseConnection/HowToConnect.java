package dataBaseConnection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class HowToConnect {

// we need secretProperties file
    //jdbc driver
    // jdbc url
    //config jdbc
    // MySql query



    public static Connection connection=null;
    public static Statement statement=null;
    public static PreparedStatement preparedStatement=null;
    public static ResultSet resultSet=null;
public static String filepath="../WebAutomation/ExLibrery/Properties/Secret.Properties";

    // load properties
    public static Properties loadProperties(String filePath) throws IOException {
      Properties properties= new Properties();
        FileInputStream fileInputStream= new FileInputStream(filePath);
        properties.load(fileInputStream);
        fileInputStream.close();
        return properties ;

    }
    public static Connection connectToDB() throws IOException, ClassNotFoundException, SQLException {
        Properties pro=HowToConnect.loadProperties(filepath);
        String driverClass= pro.getProperty("MYSQLJDBC.driver");
        String url=pro.getProperty("MYSQLJDBC.url");
        String userName=pro.getProperty("MYSQLJDBC.userName");
        String password=pro.getProperty("MYSQLJDBC.password");
        Class.forName(driverClass);

        connection= DriverManager.getConnection(url,userName,password);

        statement=connection.createStatement();

        System.out.println("+++++++++++++++++++++++++++");
        return connection;

    }


    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        HowToConnect.connectToDB();
    }




}
