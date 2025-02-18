package d250117;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class StudentManager {
	static DBClass db = new DBClass();
	
	
	static String sql = "";
	static Statement stmt = db.stmt;
	static ResultSet rs;
	static Connection conn = db.conn;
	
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
					
		System.out.println(" === 학생 관리 시스템 입니다! === ");
		try {
			while (true) {
				System.out.print("[(1) 학생추가 (2) 수정 (3) 삭제 (4) 조회 (5) 종료 ]");
				int menu = sc.nextInt();
				
				if (menu==1) {
					
					System.out.print("학번 입력 : ");
					String num = sc.next(); 
					
					int index = selectIndex(num);
	
					if (index > -1 ) {
						System.out.println("이미 존재하는 학생입니다. 처음으로 이동 합니다.");
					} else {

						System.out.print("저장할 학생의 이름 입력 : ");
						String name = sc.next();		
						System.out.print("저장할 학생의 학과 입력 : ");
						String dept = sc.next();		
						
						sql = "insert into student(stu_name,stu_no,stu_dept) "
								+ " values ('"+name+"'"+ ",'"+ num +"'" + ",'"+ dept +"')";
					
						stmt= conn.createStatement();
						
						int rss = stmt.executeUpdate(sql);
						
						System.out.println("학생이 추가되었습니다!");
					}
					
	
					
				} else if (menu==2) {
					System.out.print("수정할 학생 학번 입력 : ");
					String num = sc.next(); 
					
					int index = selectIndex(num);
					int result = 0;
					
					if (index > -1 ) {
						System.out.print("수정할 내용을 입력하세요 (이름,학과,키) ");
						String select = sc.next(); 	
						
						
						if (select.equals("이름")) {
							System.out.print("수정할 이름을 입력하세요 : ");
							String name = sc.next();
							
							result = executeSQL("update student set stu_name = '" + name + "' where stu_no = '" + num  + "'");
						} else if (select.equals("학과"))  {
							System.out.print("수정할 학과를 입력하세요 : ");
							String dept = sc.next();
							result = executeSQL("update student set stu_dept = '" + dept + "' where stu_no = '" + num  + "'");
						} else if (select.equals("키"))  {
							System.out.print("수정할 키를 입력하세요 : ");
							int height = sc.nextInt();
							result = executeSQL("update student set stu_height = " + height + " where stu_no = '" + num  + "'");
						}
						
						if (result == 0) {
							System.out.println("저장실패");
						} else {
							System.out.println("저장성공");
						}
	
					} else {
						System.out.println("해당 학번의 학생이 존재하지 않습니다.");
					}
	
					
				} else if (menu==3) {
					System.out.print("삭제할 학생 학번 입력 : ");
					String num = sc.next(); 
					
					int index = selectIndex(num);
					int result = 0;
					
					if (index > -1 ) {
						result = executeSQL("delete student where stu_no = '" + num  + "'");
						
						if (result == 0) {
							System.out.println("삭제실패");
						} else {
							System.out.println("삭제성공");
						}
	
					} else {
						System.out.println("해당 학번의 학생이 존재하지 않습니다.");
					}					
				} else if (menu==4) {
					System.out.print("정보를 조회 할 학생 학선 입력 (미입력 또는 오입력시 전체 조회) : ");
					String num = sc.next(); 
					String sql = "";
					
					int index = selectIndex(num);
	
					if (index > -1 ) {
						sql = "select * from student where stu_no = '" + num + "'";
	
					} else {
						 sql = "select * from student ";
					}				
					
					PreparedStatement pstmt;
					
					pstmt = conn.prepareStatement(sql);
			        rs = pstmt.executeQuery();
			        while (rs.next()) {
			        	System.out.print(rs.getString("stu_no") + "\t");
			        	System.out.print(rs.getString("stu_name") + "\t");
			        	System.out.println(rs.getString("stu_height"));
			        }
					
				} else if (menu==5) {
					System.out.println("종료되었습니다.");
					break;
					
				} else  {
					System.out.println("입력값을 초과했습니다. 다시입력해주세요.");
				}
				
			}		
		} catch (SQLException e ) {
			
		}
				
		
	}
	
	static public int selectIndex (String stu_no) {
		
		int index = -1;
		
		String sql = "select * from student where stu_no = '" + stu_no + "'";
		
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
	        rs = pstmt.executeQuery();
	        while (rs.next()) {
	        	if (rs.getString("stu_no").equals(stu_no)) {;
	        	  index = 0;
	        	}
	        }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return index;
		
	}

	
	static public int executeSQL (String sql) {
		
		int rss = 0;	
		
		try {
			rss = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rss;
		
	}
	
	static public int insertVal (int min , int max, String text) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print(text);
			
			int val = sc.nextInt();
			
			if ( val > min && val < max ) {
				return val;
			} else {
				System.out.println(min + " ~ "+ max + " 사이의 값을 입력해주세요.");
				}
				
			}
			
		}
		
}

