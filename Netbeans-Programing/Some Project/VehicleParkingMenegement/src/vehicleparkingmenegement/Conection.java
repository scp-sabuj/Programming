/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleparkingmenegement;

import java.sql.*;

public class Conection {

    public Connection con;
    public Statement stmt;
    public ResultSet rs;

//public static void main(String args[]){
    public Conection() {
        String dbtime;
        String dbUrl = "jdbc:mysql://localhost/vehicleparking";
        String query = "Select * FROM informationlist";

        try {

//Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(dbUrl, "root", "");
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);

//con.close();
        } //end try
        catch (SQLException e) {
            e.printStackTrace();
        }

    }  //end main

}  //end class
