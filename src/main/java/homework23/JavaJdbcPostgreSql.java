package homework23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaJdbcPostgreSql {
    private static Connection connection;

    public static void main(String[] args) throws SQLException {
        connect("jdbc:postgresql://localhost:5432/Telran", "postgres", "Vfhn1976");
        Statement stmt = connection.createStatement();
        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS students (\n" +
                "  id          SERIAL PRIMARY KEY,\n" +
                "  name        TEXT NOT NULL,\n" +
                "  group_name  TEXT NOT NULL,\n" +
                "  score       INTEGER NOT NULL\n" +
                ");");
        stmt.close();
        System.out.println("Table created");
        disconnect();
    }

    public static void connect(String url, String user, String passwd) {
        try {
            connection = DriverManager.getConnection(url, user, passwd);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void  disconnect() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

