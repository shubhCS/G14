<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
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

    <div class="col-md-12 " style="color:white;">
	<jsp:include page="adminmenu.jsp" />
        
        Registered Users:
        <%
            try{
		Class.forName("com.mysql.jdbc.Driver");	
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		Statement st=con.createStatement();
               ResultSet rs=st.executeQuery("select count(*) from user2");
               while(rs.next()){
                out.println(""+rs.getInt(1));}
            }catch(Exception e){
                out.println(e);
            }
            %>
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
        Files Reported  :
        <%
        File f=new File("C:/uploadData/");
        if(f.exists()&& f.isDirectory()){
        File[] files=f.listFiles();
        int numFiles=0;
        for(int i=0;i<files.length;i++){
            if(files[i].isFile()){
            numFiles+=1;
            out.println(files[i].getName());
            }
            }
            out.println("File Count:"+numFiles);
        }
        %>
</div>


</div>
</div>
</body>
</html>
