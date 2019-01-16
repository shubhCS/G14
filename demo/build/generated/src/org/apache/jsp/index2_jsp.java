package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class index2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\"\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Uploading files</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Uploading files</h1>\n");
      out.write("        <form name=\"uploadForm\" action=\"index1.jsp\" method=\"POST\" enctype=\"multipart/form-data\">\n");
      out.write("            <input type=\"file\" name=\"file\" value=\"\" width=\"1000\" />\n");
      out.write("          <input type = \"checkbox\" name = \"cbox\"  /> Want to Share\n");
      out.write("            \n");
      out.write("            <input type=\"submit\" value=\"submit\" name=\"submit\" />\n");
      out.write("            ");

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
            
      out.write("\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("       ");

        
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

     
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
