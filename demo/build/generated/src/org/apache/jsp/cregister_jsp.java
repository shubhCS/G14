package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class cregister_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("     <!-- Latest compiled and minified CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery library -->\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Latest compiled JavaScript -->\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-image:url('black.jpg')\">\r\n");
      out.write("     <br/>\r\n");
      out.write("    <br/>\r\n");
      out.write("    <br/>\r\n");
      out.write("    <br/>\r\n");
      out.write("    <br/>\r\n");
      out.write("    <br/>\r\n");
      out.write("    <br/>\r\n");
      out.write("    <br/>\r\n");
      out.write("    <br/>\r\n");
      out.write("    <br/>\r\n");
      out.write("    <br/>\r\n");
      out.write("    <br/>\r\n");
      out.write("    <br/>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("   \r\n");
      out.write("<div class=\"col-md-3 \">\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"col-md-6 \">\r\n");
      out.write("<form role=\"form\">\r\n");
      out.write("    <table class=\"table\" style=\"color: white\">\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td>Username</td>\r\n");
      out.write("\t<td><input type=\"text\" name=\"t1\" class=\"form-control\" /></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td>Name</td>\r\n");
      out.write("\t<td><input type=\"text\" name=\"t2\" class=\"form-control\" /></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td>Email</td>\r\n");
      out.write("\t<td><input type=\"text\" name=\"t3\" class=\"form-control\" /></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td>Enter Password</td>\r\n");
      out.write("\t<td><input type=\"password\" name=\"t4\" class=\"form-control\" /></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td>Confirm Password</td>\r\n");
      out.write("\t<td><input type=\"password\" name=\"t5\" class=\"form-control\" /></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td></td>\r\n");
      out.write("\t<td><input type=\"submit\" value=\"Register Me\" class=\"btn btn-success\" name=\"btn_reg\" />\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");

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

      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"col-md-3 \">\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
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
