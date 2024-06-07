package classroom.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCmysql {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            System.out.println("加载驱动成功");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/firstdb",
                    "root",
                    "123456"
            );
            System.out.println("firstdb连接成功");
            String sql = "show databases;";
            pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            System.out.println();
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
