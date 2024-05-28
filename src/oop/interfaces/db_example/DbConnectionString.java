package oop.interfaces.db_example;

public class DbConnectionString {
    private String server;
    private String database;
    private String username;
    private String password;
    private int port;

    public DbConnectionString(String server, String database, String username, String password, int port) {
        this.server = server;
        this.database = database;
        this.username = username;
        this.password = password;
        this.port = port;
    }

    public DbConnectionString(String connectionString) {
        //Server=%s;Database=%s;Uid=%s;Password=%s;Port=%d
        String[] strs = connectionString.split(";");
        this.server = strs[0].split("=")[1];
        this.database = strs[1].split("=")[1];
        this.username = strs[2].split("=")[1];
        this.password = strs[3].split("=")[1];
        this.port = Integer.parseInt(strs[4].split("=")[1]);
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return String.format("Server=%s;Database=%s;Uid=%s;Password=%s;Port=%d",
                server, database, username, password, port);
    }
}









