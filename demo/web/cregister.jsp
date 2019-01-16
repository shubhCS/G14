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
<body style="background-image:url('black.jpg')">
     <a href="shome.jsp" ><font size="6px" style="font-family:impact" >Home </font> </a>
    <br/>
    <br/>
    <br/>
    <br/>
    <br/>
    <br/>
    <br/>
    <br/>
    <br/>
    <br/>
    <br/>
    <br/>
    <br/>
     <div class="col-md-12 " style="font-family:impact;color:white;font-size:35px;text-align:center">
	
	Register Yourself!
</div>
    
<div class="container">
<div class="row">
   
<div class="col-md-3 ">

</div>
<div class="col-md-6 ">
<form role="form">
    <table class="table" style="color: white">
<tr>
	<td>Username</td>
	<td><input type="text" name="t1" class="form-control" /></td>
</tr>

<tr>
	<td>Name</td>
	<td><input type="text" name="t2" class="form-control" /></td>
</tr>
<tr>
	<td>Email</td>
	<td><input type="text" name="t3" class="form-control" /></td>
</tr>
<tr>
	<td>Enter Password</td>
	<td><input type="password" name="t4" class="form-control" /></td>
</tr>


<tr>
	<td>Confirm Password</td>
	<td><input type="password" name="t5" class="form-control" /></td>
</tr>
<tr>
	<td></td>
	<td><input type="submit" value="Register Me" class="btn btn-success" name="btn_reg" />
</tr>
</table>
<%
if(request.getParameter("btn_reg")!=null)
{
	String uname,name,email,cpass,password;
        
	uname=request.getParameter("t1");
	name=request.getParameter("t2");
	email=request.getParameter("t3");
	password=request.getParameter("t4");
	cpass=request.getParameter("t5");
        
	try{
		Class.forName("com.mysql.jdbc.Driver");	
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		Statement st=con.createStatement();
                
               if(password.equals(cpass))
               {
		String sql="insert into user2(uname,name,email,password) values('"+uname+"','"+name+"','"+email+"','"+password+"')";
                
		int res=st.executeUpdate(sql);
                
		if(res!=0)
			out.println("<br>Your account has been created");
		else
			out.println("<br>Sorry..Create your account again");
               }
               else 
               {
                   out.println("Password mismatch");
               }
                
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
