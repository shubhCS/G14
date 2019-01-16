<%@ page import="java.sql.*" %>
<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />


    <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body style="background-image: url(black.jpg);color: white">
     <a href="shome.jsp" ><font size="6px" style="font-family:impact" >Home </font> </a>
<div class="container">
<div class="row">
<div class="col-md-3 ">
</div>
<div class="col-md-6 ">
<%
	try{
         
         if(session.getAttribute("UserName")!=null)
         {
             String un=(String)session.getAttribute("UserName");
		Class.forName("com.mysql.jdbc.Driver");	
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		Statement st=con.createStatement();
		String sql="select *  from user2 where uname='"+un+"'";
		ResultSet rs=st.executeQuery(sql);
		out.println("<table class='table table-bordered'>");	
		while(rs.next())
		{
			String gid=rs.getString(1);
                        out.println(" <br/><br/><br/><br/><br/><br/><br/><br/>");
			out.println("<tr><td>User Id</td><td>"+rs.getString(1)+"</td></tr>");
			out.println("<tr><td>Username</td><td>"+rs.getString(2)+"</td></tr>");
			out.println("<tr><td>Name</td><td>"+rs.getString(3)+"</td></tr>");
			out.println("<tr><td>Email</td><td>"+rs.getString(4)+"</td></tr>");
			out.println("<tr><td>Password</td><td>"+rs.getString(5)+"</td></tr>");
			%>
			<td>
			<a href="record_update_query1.jsp?id=<%=gid %>" ><span class="glyphicon glyphicon-pencil"></span>
</a>
			</td>
			<%
			out.println("</tr>");		
			}
		out.println("</table>");
	}
}catch(Exception e)
	{
		out.println(e.toString());
	}

%>
</div>
<div class="col-md-3 ">

</div>
</div>
</div>
</body>
</html>
