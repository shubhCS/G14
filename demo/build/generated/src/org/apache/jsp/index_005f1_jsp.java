package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;

public final class index_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=iso-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("<!-- jQuery library -->\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("<!-- Latest compiled JavaScript -->\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-image: url('black.jpg')\">\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("<nav  class=\"navbar navbar-inverse\">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\r\n");
      out.write("        <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("      </button>\r\n");
      out.write("      <a class=\"navbar-brand\" href=\"index.jsp\">Home</a>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("      <ul class=\"nav navbar-nav\">\r\n");
      out.write("        <li class=\"active\"><a href=\"abt.jsp\">About <span class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("        <li><a href=\"#\">Contact Us</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    \r\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("        <li><a href=\"cregister.jsp\">New User?Sign Up For Free</a></li>\r\n");
      out.write("      \r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div><!-- /.navbar-collapse -->\r\n");
      out.write("  </div><!-- /.container-fluid -->\r\n");
      out.write("</nav>\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
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
      out.write("  \r\n");
      out.write("    <div class=\"col-md-12 \" style=\"font-family:impact;color:white;font-size:35px;text-align:center\">\r\n");
      out.write("\t\r\n");
      out.write("\tSync,store,share...\r\n");
      out.write("</div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"col-md-4\">\r\n");
      out.write("       \r\n");
      out.write("    \r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("<div class=\"col-md-4\" >\r\n");
      out.write("<hr>\r\n");
      out.write("<form role=\"form\" method=\"get\" action=\"\" >\r\n");
      out.write("  <div class=\"form-group\" >\r\n");
      out.write("      <label for=\"t1\" style=\"color: white\">User Name</label>\r\n");
      out.write("    <input type=\"text\" class=\"form-control\" id=\"t1\" name=\"t1\" placeholder=\"Enter User Name\" required>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"form-group\">\r\n");
      out.write("    <label for=\"t2\" style=\"color: white\">Password</label>\r\n");
      out.write("    <input type=\"password\" class=\"form-control\" id=\"t2\" name=\"t2\" placeholder=\"Password\" required>\r\n");
      out.write("  </div>\r\n");
      out.write("  <input type=\"submit\" class=\"btn btn-primary\" value=\"Login\" />\r\n");
      out.write("  \r\n");
      out.write("<!---jdbc start\r\n");

if(request.getParameter("t1")!=null || request.getParameter("t2")!=null)
{
    
	String un=request.getParameter("t1");
	String pw=request.getParameter("t2");
	int flag=0;
	try{
		Class.forName("com.mysql.jdbc.Driver");	
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		Statement st=con.createStatement();
                 if(un.equals("admin") && pw.equals("admin@1234"))
			{
				response.sendRedirect("ahome.jsp");
			}
		ResultSet rs=st.executeQuery("select * from user2 where uname='"+un+"' and password='"+pw+"'");
		if(rs.next())
		{
			flag=1;	
                         session.setAttribute("UserName",un);
                    response.sendRedirect("shome.jsp");	
		}
		if(flag==0)
		{
			out.println("<br><div.color:white>Invalid User Name or Password</div>");
                        
		}
	}
        catch(Exception e)
	{
		out.println(e.toString());
	}
}

      out.write("\r\n");
      out.write("\r\n");
      out.write("jdbc end -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<hr>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"col-md-12\">\r\n");
      out.write("       \r\n");
      out.write("    <marquee style=\"color:white\"> Developed by :The CS Team</marquee>\r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
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
