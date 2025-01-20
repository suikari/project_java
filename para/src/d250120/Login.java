package d250120;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import d250117.DBClass;

public class Login {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DBClass db = new DBClass();
		
		Statement stmt = db.stmt;
		ResultSet rs = db.rs;
		
		
		//아이디 , 비번 입력 받아서 동일한 데이터가 있으면 로그인 성공, 실패 처리
		
		
		System.out.print("아이디 : ");
		String id = sc.next();
		
		System.out.print("비밀번호 : ");
		String pwd = sc.next();

		int index = -1;
		
		String sql = "select * from tbl_user where userid = '" + id + "' and password = '" + pwd + "'";
				
	    
		try {
		    rs = stmt.executeQuery(sql);

		    
	        while (rs.next()) {
	        	   index = 0;
	        	}
	        
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (index > -1 ) {
			System.out.println("로그인 성공!");
		} else {
			System.out.println("로그인 실패, 아이디 또는 패스워드를 확인하세요.");
		}
		
	}
}
