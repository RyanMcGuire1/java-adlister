import com.mysql.cj.api.mysqla.result.Resultset;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.mysql.cj.jdbc.Driver;

public class MySQLAdsDoa implements Ads{

    private Connection connection;

    public MySQLAdsDoa(Config config){
        try {
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public List<Ad> all() {
        List<Ad> output = new ArrayList<>();
        String query = "SELECT * FROM ads";
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()){
                output.add(
                        new Ad(
                             rs.getLong("userid"),
                             rs.getString("title"),
                             rs.getString("description")

                        )
                );
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return output;
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }
}
