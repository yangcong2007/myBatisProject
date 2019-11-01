/**
 * 
 */
package myBatisProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author yc
 * jdbc 测试类
 */
public class JDBCTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");//加载驱动
			String url = "jdbc:mysql://118.89.248.63:3306/ssmdemo";
			String user = "root";
			String password = "yc20190919";
			connection = DriverManager.getConnection(url, user, password);
			String sql = "select * from tb_user ";
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getString("id"));
				System.out.print(rs.getString("user_name"));
				System.out.print(rs.getString("name"));
				System.out.print("1".equalsIgnoreCase(rs.getString("sex"))?"男":"女");
				System.out.println();
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(null != rs) {
				rs.close();
			}
			if(null != ps) {
				ps.close();
			}
			if(null != connection) {
				connection.close();
			}
		}
		
	}

}
