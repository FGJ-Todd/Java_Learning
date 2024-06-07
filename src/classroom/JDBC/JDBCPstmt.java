package classroom.JDBC;

import java.sql.*;

public class JDBCPstmt {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("驱动加载成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            System.out.println("epet连接成功");
            conn = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;DatabaseName=epet;trustServerCertificate=false;encrypt=false",
                    "sa",
                    "123456"
            );

            String sql1 = "insert into dog (name, health, love, strain) values (?,?,?,?);";

            pstmt = conn.prepareStatement(sql1);
            pstmt.setString(1, "金毛");
            pstmt.setInt(2, 60);
            pstmt.setInt(3, 60);
            pstmt.setString(4, "金毛");
            // 执行sql语句成功时返回1，失败时返回0
            int i = pstmt.executeUpdate();
            if (i == 1) System.out.println("插入成功");else System.out.println("插入失败");

            pstmt = conn.prepareStatement(sql1);
            pstmt.setString(1, "哈哈");
            pstmt.setInt(2, 60);
            pstmt.setInt(3, 60);
            pstmt.setString(4, "哈士奇");
            // 执行sql语句成功时返回1，失败时返回0
            i = pstmt.executeUpdate();
            if (i == 1) System.out.println("插入成功");else System.out.println("插入失败");


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                    System.out.println("断开连接");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
