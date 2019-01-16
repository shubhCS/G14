<%-- 
    Document   : index1
    Created on : 1 Jul, 2017, 10:52:03 AM
    Author     : hp
--%>
<%@ page import="java.sql.*" %>
<%@page import="java.io.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Uploading files</title>
    </head>
    <body>
        <h1>Uploading files</h1>
        <form name="uploadForm" action="upload.jsp" method="POST" enctype="multipart/form-data">
            <input type="file" name="file" value="" width="1000" />
          <input type = "checkbox" name = "c"  value="1" checked/> Want to Share
           
            <input type="submit" value="submit" name="sub" />
        </form>
    </body>
</html>
