import java.sql.*;

public class BigData {

    public void connectSample() {
    String url = "jdbc:postgresql://localhost:5432/myDB";
    String user = "user";
    String password = "thepass";

    try {
        Connection conn = DriverManager.getConnection(url,user,password);
        Statement stmt = conn.createStatement();;

        String sql = "SELECT id, firstname, lastname, email FROM customers";
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            int id = rs.getInt("id");
            String first = rs.getString("firstName");
            String last = rs.getString("lastName");
            String email = rs.getString("email");

            System.out.println("User ID: " + id + " User first name: " + first + " user last name: " + last);

        }
    }
    catch(SQLException e){
        e.printStackTrace();

    }


}


}
