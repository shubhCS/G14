<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>

    <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<div class="row">

<div class="col-md-12 " style="font-family:Lucida Handwriting;color:yellow;font-size:35px;text-align:center">
	
	Welcome Admin...!!
</div>

<div class="col-md-12 ">
	<jsp:include page="adminmenu.jsp" />
</div>


<div class="col-md-12 " style="font-family:impact;color:white;font-size:25px;">
<table class="table table-stripped" >
<tr>
	<td colspan="5" class="bg-success text-info" style="text-align:center">Students Record</td>
<tr>
<tr class="bg-danger">
<font color="maroon"><th>ID</th><th>UserName</th><th>Name</th><th>Email</th><th>Password</th></font>
</tr>

<%
try{
	Class.forName("com.mysql.jdbc.Driver");	
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from user2");
		while(rs.next())
		{
			%>
			<tr>
			<td><%=rs.getString(1) %></td>
			<td><%=rs.getString(2) %></td>
			<td><%=rs.getString(3) %></td>
			<td><%=rs.getString(4) %></td>
			<td><%=rs.getString(5) %></td>
			</tr>
			<%
		}
		}catch(Exception e)
		{
			out.println(e.toString());
		}
%>
</table>

</div>



</div>
</div>
</body>
</html>
