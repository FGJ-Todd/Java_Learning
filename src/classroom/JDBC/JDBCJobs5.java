package classroom.JDBC;

import java.sql.*;
import java.util.Scanner;

public class JDBCJobs5 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("输入用户名：");
        String name = sc.next();
        System.out.print("输入密码：");
        String password = sc.next();
        // 此版本及以上版本可以省略
//        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            System.out.println("驱动加载成功");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        try {
            conn = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;DatabaseName=epet;trustServerCertificate=false;encrypt=false",
                    "sa",
                    "123456"
            );
            System.out.println("epet连接成功");
            String sql = "select * from master where name = ? and password = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println("登录成功");
                sql = "select * from dog;";
                ps = conn.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    System.out.println(rs.getString(2)+
                            " \t"+rs.getInt(3)+
                            " \t"+rs.getInt(4)+
                            " \t"+rs.getString(5));
                }
            } else {
                System.out.println("登录失败");
            }

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
