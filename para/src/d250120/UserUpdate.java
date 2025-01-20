package d250120;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import d250117.DBClass;

public class UserUpdate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DBClass db = new DBClass();
		
		Statement stmt = db.stmt;
		ResultSet rs = db.rs;
		String sql = "";
		
		//아이디 입력받아서 나이값 업데이트 , 없을경우 없는아이디 > 다시입력 
		
		boolean flg = true;
		try { 
			while (true) {
				System.out.print("아이디 : ");
				String id = sc.next();
				sql = "select * from tbl_user where userid = '" + id + "'";
				
			   rs = stmt.executeQuery(sql);
			  
			   if (rs.next()) {
				   
					System.out.print("수정할 나이를 입력하세요 : ");
					int age = sc.nextInt();
					
					sql = "update tbl_user set age = " + age +" where userid = '" + id + "'";

					int num = stmt.executeUpdate(sql);
				   
					if (num > 0 ) {
						   System.out.println("업데이트 성공!.");
						   break;
					} else {
						   System.out.println("업데이트 실패!.");
						   break;						
					}
					
			   } else {
				   System.out.println("없는 아이디 입니다.");
			   }
				
			}
		} catch  (SQLException e)  {
			
		}
		
		
	}

}
