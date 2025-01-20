package d250120;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import d250117.DBClass;

public class UserManager {

	
	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			
			DBClass db = new DBClass();
			
			Statement stmt = db.stmt;
			ResultSet rs = db.rs;
			
			//아이디 , 비밀번호, 이름을 입력받아서 저장
			
			String id = "";
			String sql = "";
	
			
			int index = -1;
			boolean flg = true;
			
			
			while (flg) {
				System.out.print("아이디 : ");
				id = sc.next();
				
				sql = "select * from tbl_user where userid = '" + id + "'";
				
			    rs = stmt.executeQuery(sql);
			    flg = rs.next();
			}

			System.out.print("비밀번호 : ");
			String pwd = sc.next();
			System.out.print("이름 : ");
			String name = sc.next();
			
			sql = "insert into tbl_user(userid,password,username) values ('"+ id +"','"+ pwd +"','"+ name +"')";
			//System.out.println(sql);
			
			int result = stmt.executeUpdate(sql);
			
			if (result > 0) {
				System.out.println("회원가입 되었습니다.");
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
