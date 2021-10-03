package pl.mariuszkepa.dbdao;

import pl.mariuszkepa.alert.Alert;
import pl.mariuszkepa.task.Task;
import pl.mariuszkepa.utils.DbUtil;

import java.sql.*;

public class TaskDao {

    public static Alert create(Alert alert) {
        try (Connection conn = DbUtil.getConnection();
             Statement stmt = conn.createStatement()) {
            System.out.println(alert.toString());
            String sql = "INSERT INTO alert VALUES ('" + alert.getId()+ "', "+alert.isAlert()+", '"+alert.getHost()+"', "+alert.getTimestamp()+", '"+alert.getType()+"');";

            stmt.executeUpdate(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
