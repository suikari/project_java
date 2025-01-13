package com.example.test1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.example.test1.model.User;
import com.example.test1.Util.JdbcUtil;

public class loginDAO {
	public class LoginDAO {
		private LoginDAO loginDAO;
		private Connection con;
		
		private LoginDAO() {
			
		}
		public LoginDAO getInstance() {
			if(loginDAO==null) {
				loginDAO = new LoginDAO();
			}
			return loginDAO;
		}
		
		public void setConnection(Connection con) {
			this.con=con;
		}
		
		public User selectLoginMember(String id,String passwd) {
			User loginMember = null;
			PreparedStatement pstmt=null;
			ResultSet rs = null;
			
			try {
				pstmt=con.prepareStatement("SELECT * FROM users WHERE id=? AND passwd=?");
				pstmt.setString(1, id);
				pstmt.setString(2, passwd);
				
				rs=pstmt.executeQuery();
				
				if(rs.next()) {
					loginMember= new User();

				}
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			
			
			
			finally {
				try {
					//close(rs);
					//close(pstmt);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			
		
			return loginMember;
		}
	}
}
