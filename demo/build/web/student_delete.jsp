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
<div class="col-md-3 ">

</div>
<div class="col-md-6 ">
<form role="form">
<table class="table">
<tr>
	<td>ID</td>
	<td><input type="text" name="t1" class="form-control" required /></td>
</tr>
<tr>
	<td></td>
	<td><input type="submit" value="Delete" class="btn btn-danger" name="btn_del" />
<td>
</tr>
</table>
<%
if(request.getParameter("btn_del")!=null)
{
	String id;
	id=request.getParameter("t1");
	try{
		Class.forName("com.mysql.jdbc.Driver");	
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sis","root","root");
		Statement st=con.createStatement();
		String sql="delete from student where id='"+id+"'";
		int res=st.executeUpdate(sql);
		if(res!=0)
			out.println("<br>Record Deleted");
		else
			out.println("<br>Record Not Deleted");
	}catch(Exception e)
	{
		out.println(e.toString());
	}
}
%>
</form>
</div>
<div class="col-md-3 ">

</div>
</div>
</div>
</body>
</html>
