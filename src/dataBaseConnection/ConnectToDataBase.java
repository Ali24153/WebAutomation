package dataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ConnectToDataBase {

    static String url="jdbc:mysql://localhost:3306/adal_2021?serverTimezone=UTC";
    static String name="root";
    static String password="$Amar2020";
   static String driver="com.mysql.cj.jdbc.Driver";


    public static void main(String[] args) throws SQLException {

        Connection connection=null;
        Statement statement= null;

        connection=DriverManager.getConnection(url,name,password);
        statement=connection.createStatement();


        Souad souad = new Souad("Souad", "Meziani", "Aghribs", 5, "paris");
        Souad amar = new Souad("Amar", "Tadjedit", "columbus", 11, "outside");
        Souad ali = new Souad("Ali", "Tadjedit", "Timizart", 28, "Sleeping");

        ArrayList<Souad> family = new ArrayList<>();
        family.add(souad);
        family.add(amar);
        family.add(ali);

        for (Souad happy : family) {


            String query = "insert into sousou (name, lastName, address, number, favourite)" +
                    "values ('" + happy.getName() + "','" + happy.getLastName() + "','" + happy.getAddress() + "'," + happy.getName() + ",'" + happy.getFavourite() + "')";
         statement.execute(query);
        }
       connection.close();
        statement.close();
    }



}
