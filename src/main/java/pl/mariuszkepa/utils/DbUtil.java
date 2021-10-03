package pl.mariuszkepa.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {

    private static final String DB_URL = "mysql://remotemysql.com:3306";
    private static final String DB_URL1 = "jdbc:hsqldb:file:/home/mariusz/DataBases/hsqldb-2.6.0/hsqldb/bin/runManagerSwing;hsqldb.lock_file=false";
    private static final String DB_NAME = "tasks_db";
    private static final String DB_USER = "Mariusz";
    private static final String DB_PASSWORD = "";

    public static Connection getConnection() {

        try {
            Class.forName("org.hsqldb.jdbc.JDBCDriver");
            Connection connection = DriverManager.getConnection(DB_URL1, DB_USER, DB_PASSWORD);
            return connection;
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error DB");
            System.out.println(e.getMessage());
            return null;
        }
    }
}
