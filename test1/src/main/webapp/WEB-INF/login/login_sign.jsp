<%@ page import="inc.DBcon" %>
<%@ page import="java.sql.*" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	request.setCharacterEncoding("UTF-8");

	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
    // DB연결에 필요한 변수 선언

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	String sql = "select * from users where uid = '"+ id +"' and upw = '"+ pw +"'";
	
	DBcon DB = new DBcon();
	DB.Open();		
	
	pstmt = DB.conn.prepareStatement(sql);
	//pstmt.setString(1, id);
	//pstmt.setString(2, pw);
	
	rs = pstmt.executeQuery();

    
	
	try{
    		
		// sql실행
		
		if(rs.next()){ // 로그인 성공(인증의 수단 session)
			id = rs.getString("uid");
			String name = rs.getString("name");
			
			//out.println(id);
			//out.println(name);

			session.setAttribute("user_id", id);
			session.setAttribute("user_name", name);
			
			String id1 = (String)session.getAttribute("user_id");
			
			DB.Update("UPDATE dbo.users SET last_login = '20250106' WHERE  uid = '"+ id +"'");
			
			

			//out.println("설정된 세션값 [1] → " + id1 + "<br/><br/>");
			response.sendRedirect("../index.jsp"); // 페이지이동
			
		} else{ // 로그인 실패
			
		    out.println("<script>");
		    out.println("alert('id또는 pw를 확인하세요')");
		    out.println("location.href= '../login.jsp'") ;
		    out.println("</script>");
		    
			//response.sendRedirect("../login.jsp"); // 실패 페이지
		}
	} catch(Exception e){
		//e.printStackTrace();
			//out.println("<script>");
		    //out.println("alert('id 또는 pw를 확인하세요.');");
		    //out.println("</script>");
		    
		    //response.sendRedirect("../login.jsp"); // 에러가 난 경우도 리다이렉트
	} finally{
		try{
			//if(conn != null) conn.close();
			//if(pstmt != null) pstmt.close();
			//if(rs != null) rs.close();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
 %>
 

	