import db.DB;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        Connection conn = DB.getConnection();

        Statement st = conn.createStatement();

        ResultSet rs = st.executeQuery("select * from tb_product");

        while (rs.next()) {
            System.out.println(rs.getLong("Id") + ", " + rs.getString("Name"));
        }
    }
}