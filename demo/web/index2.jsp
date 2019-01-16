<%-- 
    Document   : index1
    Created on : 1 Jul, 2017, 10:52:03 AM
    Author     : hp
--%>
<%@ page import="java.sql.*" %>
<%@page import="java.io.*"%>"
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Uploading files</title>
    </head>
    <body>
        <h1>Uploading files</h1>
        <form name="uploadForm" action="index1.jsp" method="POST" enctype="multipart/form-data">
            <input type="file" name="file" value="" width="1000" />
          <input type = "checkbox" name = "cbox"  /> Want to Share
            
            <input type="submit" value="submit" name="submit" />
            <%
                String saveFile=new String();
                String tempname= new String();
                String contentType=request.getContentType();
                
                if((contentType != null) && (contentType.indexOf("multipart/form-data")>=0)){
                    DataInputStream in=new DataInputStream(request.getInputStream());
                    
                    int formDataLength= request.getContentLength();
                    byte dataBytes[]=new byte[formDataLength];
                    int byteRead=0;
                    int totalByteRead=0;
                    
                    while(totalByteRead<formDataLength){
                        byteRead=in.read(dataBytes,totalByteRead,formDataLength);
                        totalByteRead+=byteRead;
                    }
                    
                    String file= new String(dataBytes);
                    
                    saveFile =file.substring(file.indexOf("filename=\"")+10);
                    saveFile=saveFile.substring(0, saveFile.indexOf("\n"));
                    saveFile=saveFile.substring(saveFile.lastIndexOf("\\")+1,saveFile.indexOf("\""));
                    
                    tempname=saveFile;
                    int lastIndex=contentType.lastIndexOf("=");
                    
                    String boundary = contentType.substring(lastIndex + 1 ,contentType.length());
                    
                    int pos;
                    
                    pos=file.indexOf("filename=\"");
                    pos=file.indexOf("\n",pos)+1;
                    pos=file.indexOf("\n",pos)+1;
                    pos=file.indexOf("\n",pos)+1;
                    
                    int boundaryLocation=file.indexOf(boundary,pos)-4;
                    
                    int startPos =((file.substring(0,pos)).getBytes()).length;
                    int endPos=((file.substring(0,boundaryLocation)).getBytes()).length;
                    
                    //saveFile=config.getServletContext().getRealPath("/")+"usrupload/"+saveFile;
                    saveFile=config.getServletContext().getRealPath("/")+"/usrupload/"+saveFile;
                    File ff=new File(saveFile);
                    
                    try{
                        FileOutputStream fileOut=new FileOutputStream(ff);
                        fileOut.write(dataBytes,startPos,(endPos-startPos));
                        fileOut.flush();
                        fileOut.close();
                        
                    }catch(Exception e)
                    {
                        out.println(e);
                    }
                }
            %>
            
        </form>
        
       <%
        
           String un;
                   un=(String)session.getAttribute("UserName");
                   
       
       
       try
       {
                Class.forName("com.mysql.jdbc.Driver");	
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		Statement st=con.createStatement();
                String sql;
                String check= request.getParameter("cbox");
              if(check != null)
                { sql="insert into files(uname,file,permission) values('"+un+"','"+tempname+"',1)";
                }
              else {sql="insert into files(uname,file,permission) values('"+un+"','"+tempname+"',0)";
                }
		int res=st.executeUpdate(sql);
                
        }
       catch(Exception e)
       {    out.println(e.toString());
       }

     %>
    </body>
</html>
