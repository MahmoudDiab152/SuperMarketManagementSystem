package utility;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class database {
    Connection conn;

    public database() {
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:./database/main.db");
            System.out.println("connection established");
        } catch (SQLException e) {
            System.out.println(e);
            System.exit(0);
        }
    }

    public int insertQuery(String query) {
        try {
            Statement statement = conn.createStatement();
            int res = statement.executeUpdate(query);
            return res;
        } catch (SQLException e) {
            System.out.println(e);
            return -1;
        }
    }

    public ResultSet selectQuery(String query) {
        try {
            Statement statement = conn.createStatement();
            ResultSet res = statement.executeQuery(query);
            return res;
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }

}
