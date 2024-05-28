package oop.interfaces.db_example;

import java.util.List;

public class MssqlConnection implements DbConnection {

    private DbConnectionString connectionString;

    public MssqlConnection(String connectionString) throws SQLException {
        if (connectionString == null || connectionString.isBlank()) {
            throw new SQLException("Connection String not provided!");
        }
        this.connectionString = new DbConnectionString(connectionString);
    }

    public MssqlConnection(String server, String database, String user, String password) {
        this.connectionString = new DbConnectionString(server, database, user, password, 1433);
    }


    @Override
    public void connect() {
        System.out.println("Connecting to " + connectionString);
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from " + connectionString);
    }

    @Override
    public int executeUpdate(String sqlQuery) throws SQLException {
        if (
                sqlQuery.contains("INSERT") || sqlQuery.contains("UPDATE")
                        || sqlQuery.contains("DELETE") || sqlQuery.contains("TRUNCATE")
        ) {
            System.out.println("Executing SQL: " + sqlQuery);
            return 1;
        }

        throw new SQLException("Not valid SQL: " + sqlQuery);
    }

    @Override
    public List<Object> executeQuery(String sqlQuery) throws SQLException {
        if (!sqlQuery.contains("SELECT")) {
            throw new SQLException("Not valid SQL: " + sqlQuery);
        }
        return List.of("Naim", "Olti", "Agon", "Arba");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing " + connectionString);
    }
}
