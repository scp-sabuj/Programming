/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfoodapplication;

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
        String dbUrl = "jdbc:mysql://localhost/table";
        String query = "Select * FROM fastfood";

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

    }

}
