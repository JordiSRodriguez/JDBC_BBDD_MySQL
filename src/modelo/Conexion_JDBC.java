package modelo;

import com.mysql.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion_JDBC {
    private String user;
    private String port;
    private String hostname;
    private String connector;
    private String database;
    private String password;
    private String url;
    Connection con;

    public Conexion_JDBC(String user, String port, String hostname, String connector, String database, String password, String url) {
        this.user = user;
        this.port = port;
        this.hostname = hostname;
        this.connector = connector;
        this.database = database;
        this.password = password;
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getConnector() {
        return connector;
    }

    public void setConnector(String connector) {
        this.connector = connector;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Connect_JDBC:" +
                "user='" + user + '\'' +
                "port='" + port + '\'' +
                "hostname='" + hostname + '\'' +
                "connector='" + connector + '\'' +
                "database='" + database + '\'' +
                "url='" + url + '\'';
    }

    public Connection abrirConexion() throws SQLException, ClassNotFoundException {
        Connection con;
        Class.forName("com.mysql.jdbc.Driver");
        this.con = (Connection) DriverManager.getConnection(this.url, this.user, this.password);
        return this.con;
    }

    public Connection cerrarConexion() throws SQLException {
        this.con.close();
        return this.con;
    }
}
