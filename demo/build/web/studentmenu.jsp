<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script language="javascript">
	/* Open the sidenav */
function openNav() {
    document.getElementById("mySidenav").style.width = "250px";
    //document.getElementById("main").style.marginLeft = "250px";
}

/* Set the width of the side navigation to 0 and the left margin of the page content to 0 */
function closeNav() {
    document.getElementById("mySidenav").style.width = "0";
    //document.getElementById("main").style.marginLeft = "0";
}


	</script>
</head>
<body style="background-image: url(black.jpg)">
<div class="container">
<div class="row">
<div id="mySidenav" class="sidenav" >
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
  <a href="update.jsp">Edit Profile</a>
  <a href="showfile.jsp">My files</a>
  <a href="index1.jsp">Upload</a>
  <a href="searchFile.jsp">Search Files</a>
   <a href="index_1.jsp">Logout</a>
</div>

<!-- Use any element to open the sidenav -->
<span onclick ="openNav()">Click here for Menu</span>

<!-- Add all page content inside this div if you want the side nav to push page content to the right (not used if you only want the sidenav to sit on top of the page -->
<div id="main">
  Store and share your files...
</div>
</div>
</div>
</body>
</html>
