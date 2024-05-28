package oop.interfaces.db_example;

import java.util.List;

public class MySQLConnection implements DbConnection {

    private DbConnectionString connectionString;

    public MySQLConnection(String connectionString) {
        this.connectionString = new DbConnectionString(connectionString);
    }

    @Override
    public void connect() {
        System.out.println("Connecting to mysql database");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from mysql database");
    }

    @Override
    public int executeUpdate(String sqlQuery) throws SQLException {
        return 0;
    }

    @Override
    public List<Object> executeQuery(String sqlQuery) throws SQLException {
        return List.of();
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing mysql database");
    }
}
