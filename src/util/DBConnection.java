package util;

import java.sql.DriverManager;
import java.sql.*;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/gitalkdb?serverTimezone=Asia/Seoul";
    private static final String USER = "admin";
    private static final String PASSWORD = "admin";

    public static Connection makeConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("1. 데이터베이스 연결중 ...");
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("1. 데이터베이스 연결 성공");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC 드라이버를 찾지 못했습니다...");
        } catch (SQLException e) {
            System.out.println("데이터베이스 연결 실패");
            System.out.println(e.getMessage());
        }
        return con;
    }
}
