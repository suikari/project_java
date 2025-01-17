package d250117;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBDeleteEx1 {
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
		Scanner sc = new Scanner(System.in);
		String sql = "";


		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			String db_url = "jdbc:oracle:thin:@localhost:1521:sa";
			String db_id = "SYSTEM";
			String db_pw = "epdl874";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			System.out.println("DB 연결 완료");
			
			
			//System.out.print("삭제할 학생의 이름 입력 : ");
			
			//String name = sc.next();
			//sql = "delete from student where stu_name = '" + name  + "'";
			//학번 , 이름, 학과 입력받아서 student테이블에 저장
			
			System.out.print("저장할 학생의 이름 입력 : ");
			String name = sc.next();	
			System.out.print("저장할 학생의 학번 입력 : ");
			String num = sc.next();		
			System.out.print("저장할 학생의 학과 입력 : ");
			String dept = sc.next();		
			
			sql = "insert into student(stu_name,stu_no,stu_dept) "
					+ " values ('"+name+"'"+ ",'"+ num +"'" + ",'"+ dept +"')";
		
		//PreparedStatement pstmt = null;
			//System.out.print(sql);
			stmt= conn.createStatement();
			
			int rss = stmt.executeUpdate(sql);
			System.out.print(rss);
			//pstmt = conn.prepareStatement(sql);
	        //rs = pstmt.executeQuery();
	        //printData(rs);

		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}

		//stmt.execute(sql);
	}
}
