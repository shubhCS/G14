
<%@ page import="java.sql.*" %>
<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />



  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="newcss.css" type="text/css"/>

</head>
<body style="background-image: url(black.jpg)">
    
<div class="container">
<div class="row">

<div class="col-md-12 " style="font-family:impact;color:white;font-size:35px;text-align:center">
	
My Profile
</div>
 

    <div id="main"style="color:white;font-size:15px">
<hr />
<%
	
	try{
            if(session.getAttribute("UserName")!=null)
	{
            
		String un=(String)session.getAttribute("UserName");
		out.println("                                                                           Welcome "+un+" ,");
               


        

		Class.forName("com.mysql.jdbc.Driver");	
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		Statement st=con.createStatement();
		String sql="select *  from user2 where uname='"+un+"'";
		ResultSet rs=st.executeQuery(sql);
		if(rs.next())
		{
			out.println("<table class='table table-bordered'>");	
			out.println("<tr><td>User Id</td><td>"+rs.getString(1)+"</td></tr>");
			out.println("<tr><td>Username</td><td>"+rs.getString(2)+"</td></tr>");
			out.println("<tr><td>Name</td><td>"+rs.getString(3)+"</td></tr>");
			out.println("<tr><td>Email</td><td>"+rs.getString(4)+"</td></tr>");
			out.println("<tr><td>Password</td><td>"+rs.getString(5)+"</td></tr>");
                      out.println("</tr></table>");
                 
		}		
                }
                
        
	}
        
        
			
			
                         catch(Exception e)
	{
		out.println(e.toString());
	}


            
        
%>

</body>
</html>
 

<div class="col-md-12 ">
	<jsp:include page="studentmenu.jsp" />
</div>
 

</div>
</div>
</body>
</html>
