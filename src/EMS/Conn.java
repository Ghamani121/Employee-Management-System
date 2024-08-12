package EMS;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.*;

public class Conn {

    Connection c;
    Statement s;

    public Conn(){

        //since db is an extenal entity, errors are likely to occur
        try{
            //register driver class aka driver of sql
            Class.forName("com.mysql.cj.jdbc.Driver");

            //create a connection string
            c= DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem","root","ghamani123");
            //create a statement
            s=c.createStatement();

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
