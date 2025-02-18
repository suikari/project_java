package d250117;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConn {
	static Connection conn = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	
	public static void printData(ResultSet rs) throws SQLException {
			while (rs.next()) {
			    System.out.print(rs.getString("stu_name") + "\t");
			    System.out.println(rs.getInt("stu_height"));
			}		
	}
	
	public static void main(String[] args) {
		

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			String db_url = "jdbc:oracle:thin:@localhost:1521:sa";
			String db_id = "SYSTEM";
			String db_pw = "epdl874";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			System.out.println("DB 연결 완료");
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
		String sql = "select * from student";
		
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
	        rs = pstmt.executeQuery();
	        printData(rs);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//stmt.execute(sql);
	}
}