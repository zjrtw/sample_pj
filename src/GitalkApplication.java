import java.sql.*;
import util.*;

public class GitalkApplication {
    public static void main(String[] args) {
        Connection con = DBConnection.makeConnection();// MySql 드라이버 연결하고 접속한 conn 을 반환해 주는 메소드 호출
        String sql = "SELECT * FROM users";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                System.out.println(rs.getString("userid"));
                System.out.println(rs.getString("email"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}