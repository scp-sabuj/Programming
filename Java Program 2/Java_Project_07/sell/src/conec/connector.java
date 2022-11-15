package conec;

import java.sql.*;
import java.util.ArrayList;

public class connector{

 public Connection con;
 public Statement stmt;
 public ResultSet rs;
    
//public static void main(String args[]){
public connector(){
String dbtime;
String dbUrl = "jdbc:mysql://localhost/sell";
String query = "Select * FROM product";

try {

Class.forName("com.mysql.jdbc.Driver");
 con = DriverManager.getConnection (dbUrl,"root","");
 stmt = con.createStatement();
 rs = stmt.executeQuery(query);

while (rs.next()) {
dbtime = rs.getString(1);
//System.out.println(dbtime);
} //end while

//con.close();
} //end try

catch(ClassNotFoundException e) {
e.printStackTrace();
}

catch(SQLException e) {
e.printStackTrace();
}

}  //end main

    public connector(ArrayList ccarr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}  //end class