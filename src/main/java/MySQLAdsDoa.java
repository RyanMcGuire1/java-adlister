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

    public MySQLAdsDoa() {

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
        try {
           Statement stmt = connection.createStatement();
           stmt.executeUpdate(createInsertQuery(ad), Statement.RETURN_GENERATED_KEYS);
           ResultSet rs = stmt.getGeneratedKeys();
           rs.next();
           return rs.getLong(1);
        } catch (SQLException e){
           throw new RuntimeException("Error creating a new ad.", e );
        }
    }
    private String createInsertQuery(Ad ad){
        return "INSERT ONTO ads(user_id, title, description) VALUES"
                +"(" + ad.getUserId() +","
                +"'" + ad.getTitle() +"',"
                +"'" + ad.getDescription() + "')";
    }
}


