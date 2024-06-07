package classroom.JDBC;

import java.sql.*;

public class JDBCJobs {
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

            // 创建
//            String sql = "create table student (id int primary key, name varchar(50) not null);";
//            pstmt = conn.prepareStatement(sql);
//            pstmt.execute();

            // 插入
//            String sql = "insert into student values (?,?);";
//            pstmt = conn.prepareStatement(sql);
//            pstmt.setInt(1, 1);
//            pstmt.setString(2, "张三");
//            pstmt.execute();

            String sql = "select * from student;";
            pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()){
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
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
