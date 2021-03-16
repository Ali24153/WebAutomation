package dataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ConnectDB {


    public static String url="jdbc:mysql://localhost:3306/amar?serverTimezone=UTC";
    public static String name="root";
    public static String password="$Amar2020";

    public static void main(String[] args) throws SQLException {


        Connection connection=null;
        Statement statement= null;

        EmpInfo Josh = new EmpInfo("Josh", "Miller", 100, 143, "3527987498", "87342785", "Columbus OH");
        EmpInfo Patric = new EmpInfo("Patric", "Wolf", 101, 656, "394848498", "343434343", "Dublin OH");
        EmpInfo Jhon = new EmpInfo("Jhon", "Stiwart", 102, 666, "838387498", "43134785", "Austin TX");
        EmpInfo Juan = new EmpInfo("Juan", "Carlos", 103, 783, "3527987498", "845904785", "Atlanta GA");
        EmpInfo Rich = new EmpInfo("Rich", "Gracia", 104, 267, "986487498", "0948599", "New York NY");

        connection= DriverManager.getConnection(url,name,password);

        statement=connection.createStatement();

        ArrayList<EmpInfo>array=new ArrayList<>();
        array.add(Josh);
        array.add(Patric);
        array.add(Jhon);
        array.add(Juan);
        array.add(Rich);


        for(EmpInfo arr: array) {

            String Query = "insert into empinfo (firstName, lastName,empId, depId, ssn ,phoneNum, address)" +
                    " values('"+arr.fistName+ "','"+arr.lastName+"',"+arr.getEmpId()+","+arr.getDepId()+",'"+arr.getSsn()+"','"+arr.getPhoneNum()+"','"+arr.getAddress()+"')";
            statement.execute(Query);
        }
        connection.close();
        statement.close();
    }





}
