package com.neub.studenttest;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class DisplayAuthors {

    static final String DATABASE_URL = "jdbc:mysql://localhost/neub";
    static final String DATABASE_USER = "root";
    static final String DATABASE_PASS = "";

    public static void main(String[] args) throws SQLException {

        Connection connection = null; // manages connection
        Statement statement = null; // query statement
        ResultSet resultSet = null;

        try {

            connection = (Connection) DriverManager.getConnection(DATABASE_URL,
                    DATABASE_USER, DATABASE_PASS);
            statement = (Statement) connection.createStatement();

            String name = "Mahadi Hasan";
            String dept = "CSE";
            String sql;

            //sql = "INSERT INTO teacher (name, dept) VALUES ('"+name+"', '"+dept+"');";
            //sql = "DELETE FROM teacher WHERE dept = 'CSE'"; //delete
            sql = "UPDATE teacher SET name = 'Bob Marley' WHERE id = 10;";
            statement.executeUpdate(sql); // insert /delet/update 

            //String mob = "017254687"; 
            String sql2 = "select * from teacher;";
            resultSet = statement.executeQuery(sql2); // select
            java.sql.ResultSetMetaData metaData = resultSet.getMetaData();

            int numberOfColumns = metaData.getColumnCount();

            System.out.println("Authors table of book database: ");

            for (int i = 1; i <= numberOfColumns; i++) {
                System.out.printf("%-8s\t", metaData.getColumnName(i));
            }
            System.out.println("");
            String information = "";
            String s = "";
            while (resultSet.next()) {
                for (int i = 1; i <= numberOfColumns; i++) {
                    System.out.printf("%-8s\t", resultSet.getString(i));
                    s += String.format("%-8s\t", resultSet.getString(i));
                }
                s += "\n";
                System.out.println("");

            }

            //JOptionPane.showMessageDialog(null, s);
        } catch (SQLException sQLException) {

        } finally {
            resultSet.close();
            statement.close();
            connection.close();
        }

    }
}

while( )
 {
 for ( int i = 1; i <= numberOfColumns; i++ )
 System.out.printf( "%-8s\t", );
 System.out.println();
 }
rowSet.close();
