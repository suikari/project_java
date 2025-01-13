

import java.io.IOException;
import java.io.OutputStream;
import java.net.*;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import inc.DBcon;
import inc.SHA256;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Servlet implementation class tokaworld
 */

@WebServlet(description = "testpage/index.jsp", urlPatterns =  {"/tokaworld.do"} )
public class tokaworld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public tokaworld() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession();   
		
		String id = request.getParameter("id");
		String pw = "";
				
		pw = request.getParameter("pw");
	    // DB연결에 필요한 변수 선언
        SHA256 sha256 = new SHA256();
 
		String cryptogram = "";
		
		if ( !pw.equals("") ) {	
			try {
				cryptogram = sha256.encrypt(pw);
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
        System.out.println(cryptogram);


        
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from users where uid = '"+ id +"' and upw = '"+ cryptogram +"'";
		
		DBcon DB = new DBcon();
		DB.Open();		
		
		try{

			pstmt = DB.conn.prepareStatement(sql);
			//pstmt.setString(1, id);
			//pstmt.setString(2, pw);
			
			rs = pstmt.executeQuery();


    		
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
				response.sendRedirect("index.jsp"); // 페이지이동
				
			} else{ // 로그인 실패
				String fail = "Y";
				
			   /* out.println("<script>");
			    out.println("alert('id또는 pw를 확인하세요')");
			    out.println("location.href= '../login.jsp'") ;	
			    out.println("</script>");
			    */
				
				/*URL url = new URL("login.jsp"); // 요청을 보낼 URL을 정의
		        HttpURLConnection connection = (HttpURLConnection) url.openConnection(); // URL에 대한 연결을 염
		        connection.setRequestMethod("POST"); // HTTP 요청 방식을 POST로 설정
		        connection.setDoOutput(true); // 요청 본문에 데이터를 전송할 수 있도록 함
		        
		        
				OutputStream out = connection.getOutputStream();
				// 문자열을 utf-8 방식으로 변환해서 바이트로 입력
				out.write("id=a&pass=1234".getBytes("utf-8"));
				out.close();
				// 서버의 응답코드를 확인 (정상연결일 경우 200 반환)
				int code = connection.getResponseCode();
				System.out.println("응답코드 : " + code);*/
				
				request.setAttribute("fail", fail);
		        request.getRequestDispatcher("login.jsp?fail=Y").forward(request, response);
		        
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
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
