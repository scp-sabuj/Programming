package workplace;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectorClass {

    public Connection con;
    public Statement stmt;
    public ResultSet rs;

    public ConnectorClass() {
        String dbUrl = "jdbc:mysql://localhost/workplace";
        String query = "Select * FROM customer_profile";

        try {
            con = DriverManager.getConnection(dbUrl, "root", "");
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
