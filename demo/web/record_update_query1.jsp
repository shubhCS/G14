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
<body style="background-image: url(black.jpg)">
    <a href="shome.jsp" ><font size="6px" style="font-family:impact" >Home </font> </a>
<div class="container">
<div class="row">
<div class="col-md-3 ">
</div>
<div class="col-md-5 ">
<%
	String id=request.getParameter("id");
	try{
	Class.forName("com.mysql.jdbc.Driver");	
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
	Statement st=con.createStatement();
	String sql="select *  from user2 where id='"+id+"'";
	ResultSet rs=st.executeQuery(sql);
	rs.next();
	%>
	
        
        <br/>
        <br/>
        <br/><br/><br/><br/><br/>
        
        <form action="" method="post"  role="form" >
            
            <table class="table">
	<tr>
            <td bgcolor="white" border="5" bordercolor="black" >ID</td>
		<td><input type="text" name="t1" size ="35" value="<%=rs.getString(1) %>" readonly="true" /></td>
	</tr>	
	<tr>
		<td bgcolor="white"  border="5">UserName</td>
		<td><input type="text" name="t2" size ="35" value="<%=rs.getString(2) %>" readonly="true"/></td>
	</tr>	
	<tr>
		<td bgcolor="white" border="5">Name</td>
		<td><input type="text" name="t3" size ="35" value="<%=rs.getString(3) %>" /></td>
	</tr>	
	<tr>
		<td  bgcolor="white" border="5">Email</td>
		<td><input type="text" name="t4" size ="35" value="<%=rs.getString(4) %>" /></td>
	</tr>	
	<tr>
		<td bgcolor="white" border="5">Password</td>
		<td><input type="text" name="t5" size ="35" value="<%=rs.getString(5) %>" /></td>
	</tr>	
	<tr>
		<td></td>
		<td><input type="submit" value="Update" name="btn_update" class="btn btn-success" /></td>
	</tr>
	<tr>
	<td cospan="2">
	<%
	if(request.getParameter("btn_update")!=null)
	{
		Class.forName("com.mysql.jdbc.Driver");	
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		st=con.createStatement();
		String idd=request.getParameter("t1");
		String name=request.getParameter("t2");
		String course=request.getParameter("t3");
		String branch=request.getParameter("t4");
		String sem=request.getParameter("t5");
		String sq="update user2 set uname='"+name+"',name='"+course+"',email='"+branch+"',password='"+sem+"' where id='"+idd+"'";
		int res=st.executeUpdate(sq);
		if(res!=0)
			response.sendRedirect("shome.jsp");
                else 
                    response.sendRedirect("shome.jsp");
	}		
	%>
	</td>
	</tr>
            </table>
	</form>			
	<%
	}catch(Exception e)
	{
		out.println(e.toString());
	}
%>
</div>

<div class="col-md-2 ">
</div>

</div>
</div>
</body>
</html>
