package classroom.epet.Dao;

import classroom.epet.entity.Pet;

import java.sql.*;
import java.sql.Wrapper;
import java.util.List;

public class BaseDao {
    private String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private String URL = "jdbc:sqlserver://localhost:1433;DatabaseName=epet;encrypt=false";
    private String user = "sa";
    private String passwd = "123456";
    Connection conn = null;

    Connection getConnection() {
        if (conn == null) {
            try {
                Class.forName(driver);
                conn = DriverManager.getConnection(URL, user, passwd);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return conn;
    }

    public void closeAll(Connection conn, Statement st, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int executeUpdate(String sql, Object[] param) {
        Connection conn = getConnection();
        PreparedStatement ps = null;
        int num = 0;
        try {
            ps = conn.prepareStatement(sql);
            if (param != null) {
                for (int i = 0; i < param.length; i++) {
                    ps.setObject(i + 1, param[i]);
                }
            }
            num = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeAll(conn, ps, null);
        }
        return num;
    }

    public void executeSelect(String sql, Object[] param) {
        Connection conn = getConnection();
        PreparedStatement ps = null;
        int num = 0;
        try {
            ps = conn.prepareStatement(sql);
            if (param != null) {
                for (int i = 0; i < param.length; i++) {
                    ps.setObject(i + 1, param[i]);
                }
            }
            ResultSet rs = ps.executeQuery();
            List<Pet> list = null;
            Pet p = new Pet();
            int i = 0;
            while (rs.next()) {
               p.setId(rs.getInt(1));
               p.setName(rs.getString(3));
               p.setMasterId(rs.getInt(2));
               p.setTypeId(rs.getInt(4));
               p.setHealth(rs.getInt(5));
               p.setLove(rs.getInt(6));
               p.setAdoptTime(rs.getDate(7));
               p.setStatus(rs.getString(8));
               list.add(p);
            }
        } catch (Exception e) {

        }
    }

}
