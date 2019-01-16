package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class ahome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("    <!-- Latest compiled and minified CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery library -->\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Latest compiled JavaScript -->\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"col-md-12 \" style=\"font-family:Lucida Handwriting;color:yellow;font-size:35px;text-align:center\">\r\n");
      out.write("\t\r\n");
      out.write("\tWelcome Admin...!!\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"col-md-12 \" style=\"color:white;\">\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "adminmenu.jsp", out, false);
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        Registered Users:\r\n");
      out.write("        ");

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
            
      out.write("\r\n");
      out.write("            <br/>\r\n");
      out.write("            <br/>\r\n");
      out.write("            <br/>\r\n");
      out.write("                <br/>\r\n");
      out.write("            <br/>\r\n");
      out.write("            <br/>\r\n");
      out.write("                <br/>\r\n");
      out.write("            <br/>\r\n");
      out.write("            <br/>\r\n");
      out.write("                <br/>\r\n");
      out.write("            <br/>\r\n");
      out.write("            <br/>\r\n");
      out.write("        Files Reported  :\r\n");
      out.write("        ");

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
        
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
