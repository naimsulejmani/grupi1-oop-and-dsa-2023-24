package oop.interfaces.db_example;

import java.util.List;

public class Demo {
    // [mssql,connStr]
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            throw new IllegalArgumentException("No arguments provided such as DB Conn Str");
        }

        String driver = args[0];
        String connStr = args[1];

        DbConnection connection = null;

        try {
            switch (driver) {
                case "mssql" -> connection = new MssqlConnection(connStr);
                case "mysql" -> connection = new MySQLConnection(connStr);
                case "postgree" -> connection = new PostgreSQLConnection(connStr);
                default -> throw new IllegalArgumentException("Unknown driver");
            }

            connection.connect();
            int rowAffected = connection.executeUpdate(
                    """
                            INSERT INTO Person(id, Name) VALUES (1, 'Naim');
                            """
            );
            System.out.println("Row Affected: " + rowAffected);
            List<Object> result = connection.executeQuery("SELECT Name FROM Person");
            for (Object o : result) {
                System.out.println("Name: " + o);
            }
            connection.disconnect();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (connection != null) {
                connection.close();
            }
        }

    }
}






