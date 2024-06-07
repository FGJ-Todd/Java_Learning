package classroom.JDBC;

import java.sql.*;

public class JDBC1 {
    public static void main(String[] args) {
        Connection conn = null;
        Connection connBookDB = null;
        Statement stmt = null;
        Statement stmtBookDB = null;
        String name = "欧欧";
        int health = 100;
        int love = 80;
        String strain = "金毛";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("驱动加载成功");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            conn = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;DatabaseName=epet;encrypt=false",
                    "sa",
                    "123456"
            );
            System.out.println("epet连接成功");
            // 以上是练习1
//            connBookDB = DriverManager.getConnection(
//                    "jdbc:sqlserver://localhost:1433;DatabaseName=BookDB;trustServerCertificate=false;encrypt=false",
//                    "sa",
//                    "123456"
//                    );

//            stmt = conn.createStatement();
//            stmtBookDB = connBookDB.createStatement();
//
//            String sql1 = "select * from Book;";
//            ResultSet rsBookDB = stmtBookDB.executeQuery(sql1);
//            while (rsBookDB.next()) {
//                System.out.println(rsBookDB.getInt(1)+"\t"+rsBookDB.getString(2)+"\t"+rsBookDB.getString(3));
//            }
//
//            String sql = "select * from master;";
//            ResultSet rs = stmt.executeQuery(sql);
//            // 以上是练习2
//
//            System.out.println("\t主人信息列表");
//            System.out.println("编号\t姓名\t\t余额");
//            while (rs.next()) {
//                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt("money"));
//            }
            // 以上是练习3

//            while (re.next()){
//                System.out.print(re.getInt(1)+"\t");
//                System.out.print(re.getString(2)+"\t");
//                System.out.print(re.getInt("health")+"\t");
//                System.out.print(re.getInt("love")+"\t");
//                System.out.println(re.getString("strain")+"\t");
//            }
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
