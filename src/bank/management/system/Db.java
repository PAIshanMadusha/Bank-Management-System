package bank.management.system;
import java.sql.*;

public class Db {
    Connection connection;
    Statement statement;
    public Db(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","root");
            statement = connection.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
