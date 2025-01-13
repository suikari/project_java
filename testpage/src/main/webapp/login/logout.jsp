<%
	session.removeAttribute("user_id");
	session.removeAttribute("user_name");
	//session.invalidate();
	response.sendRedirect("../login.jsp");
%>