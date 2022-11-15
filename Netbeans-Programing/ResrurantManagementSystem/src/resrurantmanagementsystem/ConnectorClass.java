/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resrurantmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author F.C
 */
public class ConnectorClass {

    public Connection con;
    public Statement stmt;
    public ResultSet rs;

//public static void main(String args[]){
    public ConnectorClass() {
        String dbtime;
        String dbUrl = "jdbc:mysql://localhost/restaurantmanagement";
        String query = "Select * FROM food";
        String query1 = "Select * FROM employee";
        String query2 = "Select * FROM dateSell";

        try {

//Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(dbUrl, "root", "");
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            rs = stmt.executeQuery(query1);
            rs = stmt.executeQuery(query2);

//con.close();
        } //end try
        catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
