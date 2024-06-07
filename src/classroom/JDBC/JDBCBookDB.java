package classroom.JDBC;

import java.sql.*;

public class JDBCBookDB {
    public static void main(String[] args) {
        Connection connBookDB = null;
        Statement stmtBookDB = null;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("驱动加载成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            System.out.println("epet连接成功");
            // 以上是练习1
            connBookDB = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;DatabaseName=BookDB;trustServerCertificate=false;encrypt=false",
                    "sa",
                    "123456"
            );

            stmtBookDB = connBookDB.createStatement();

            String sql1 = "select * from Book;";
            ResultSet rsBookDB = stmtBookDB.executeQuery(sql1);
            System.out.println("RID\t\t\tRName\t\t\t\t\tBEditor\tBPress\t\tBPubDate\tBPrice\tBNum");
            while (rsBookDB.next()) {
                System.out.print(rsBookDB.getString(1)+
                        " \t"+rsBookDB.getString(2)+
                        " \t"+rsBookDB.getString(3)+
                        " \t"+rsBookDB.getString(4)+
                        " \t"+rsBookDB.getDate(5)+
                        " \t "+rsBookDB.getFloat(6)+
                        " \t"+rsBookDB.getInt(7));
                System.out.println();
            }
            System.out.println();
            sql1 = "select * from Borrow;";
            rsBookDB = stmtBookDB.executeQuery(sql1);
            while (rsBookDB.next()){
                System.out.println(rsBookDB.getInt(1)+
                        "\t"+rsBookDB.getString(2)+
                        "\t"+rsBookDB.getString(3)+
                        "\t"+rsBookDB.getDate(4)+
                        "\t"+rsBookDB.getDate(5)+
                        "\t"+rsBookDB.getString(6));
            }
            System.out.println();
            sql1 = "select * from Reader;";
            rsBookDB = stmtBookDB.executeQuery(sql1);
            while (rsBookDB.next()){
                System.out.println(rsBookDB.getString(1)+
                        "\t"+rsBookDB.getString(2)+
                        "\t"+rsBookDB.getString(3)+
                        "\t"+rsBookDB.getString(4)+
                        "\t"+rsBookDB.getString(5)+
                        "\t"+rsBookDB.getInt(6)+
                        "\t"+rsBookDB.getInt(7)+
                        "\t"+rsBookDB.getString(8));
            }
            System.out.println();
            sql1 = "select * from RType;";
            rsBookDB = stmtBookDB.executeQuery(sql1);
            while (rsBookDB.next()){
                System.out.println(rsBookDB.getString(1)+
                        "\t"+rsBookDB.getString(2)+
                        "\t"+rsBookDB.getInt(3));
            }
            System.out.println();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (connBookDB != null) {
                    connBookDB.close();
                    System.out.println("断开连接");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
