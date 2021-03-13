package dataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ConnectDirectlyDataBase {

    // Direct Approach to connect with Database/ DB
    // JDBC Connection
    // URL Syntax
    // https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-reference-jdbc-url-format.html
    // protocol//[hosts][/database][?properties]
    public static void main(String[] args) throws SQLException {


        String url = "jdbc:mysql://localhost:3306/adal_2021?serverTimezone=UTC";
        String name = "root";
        String password = "$Amar2020";

        Connection connection = null;
        Statement statement=null;

        connection=DriverManager.getConnection(url,name,password);
        statement= connection.createStatement();


        Players zidane =new Players(10, "Real Madrid","Zine Eddine Zidane","France");
        Players mahrez =new Players(24,"Manchester City", "Ryad Mahrez","Algeria");
        Players salah= new Players(11,"Liverpool","Mohamed Salah","Egypt");
        Players eto = new Players(9,"FC Barcelona","Samuel Eto","Cameroun");


        ArrayList<Players> players= new ArrayList<>();

        players.add(zidane);
        players.add(mahrez);
        players.add(salah);
        players.add(eto);

        for(Players soccer:players){
            String query="insert into players (number, club, name, country)" +
                    " values ("+soccer.getNumber()+",'"+ soccer.getClub()+"','"+soccer.getName()+"','"+soccer.getCountry()+"')";
            statement.execute(query);
        }



        //String query="select* from employees";
       //statement.execute(query);

connection.close();
statement.close();
    }
}