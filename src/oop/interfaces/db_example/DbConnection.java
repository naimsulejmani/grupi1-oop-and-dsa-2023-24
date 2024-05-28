package oop.interfaces.db_example;

import java.util.List;

public interface DbConnection extends AutoCloseable {
    void connect();

    void disconnect();

    int executeUpdate(String sqlQuery) throws SQLException;//INSERT, UPDATE, DELETE, CREATE, ALTER, DROP, TRUNCATE

    //SELECT * FROM tableName;
    List<Object> executeQuery(String sqlQuery) throws SQLException;

}
