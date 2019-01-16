package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;

public final class record_005fupdate_005fquery1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div class=\"col-md-3 \">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"col-md-6 \">\r\n");

	String id=request.getParameter("id");
	try{
	Class.forName("com.mysql.jdbc.Driver");	
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
	Statement st=con.createStatement();
	String sql="select *  from user2 where id='"+id+"'";
	ResultSet rs=st.executeQuery(sql);
	rs.next();
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("        \r\n");
      out.write("        <br/>\r\n");
      out.write("        <br/>\r\n");
      out.write("        <br/><br/><br/><br/><br/>\r\n");
      out.write("        \r\n");
      out.write("        <form action=\"\" method=\"post\"  role=\"form\" >\r\n");
      out.write("            \r\n");
      out.write("            <table class=\"table\" bgcolor=\"black\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>ID</td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"t1\" value=\"");
      out.print(rs.getString(1) );
      out.write("\" readonly=\"true\" /></td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>UserName</td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"t2\" value=\"");
      out.print(rs.getString(2) );
      out.write("\" readonly=\"true\"/></td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>Name</td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"t3\" value=\"");
      out.print(rs.getString(3) );
      out.write("\" /></td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>Email</td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"t4\" value=\"");
      out.print(rs.getString(4) );
      out.write("\" /></td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>Password</td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"t5\" value=\"");
      out.print(rs.getString(5) );
      out.write("\" /></td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td></td>\r\n");
      out.write("\t\t<td><input type=\"submit\" value=\"Update\" name=\"btn_update\" class=\"btn btn-success\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td cospan=\"2\">\r\n");
      out.write("\t");

	if(request.getParameter("btn_update")!=null)
	{
		Class.forName("com.mysql.jdbc.Driver");	
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		st=con.createStatement();
		String idd=request.getParameter("t1");
		String name=request.getParameter("t2");
		String course=request.getParameter("t3");
		String branch=request.getParameter("t4");
		String sem=request.getParameter("t5");
		String sq="update user2 set uname='"+name+"',name='"+course+"',email='"+branch+"',password='"+sem+"' where id='"+idd+"'";
		int res=st.executeUpdate(sq);
		if(res!=0)
			response.sendRedirect("shome.jsp");
                else 
                    response.sendRedirect("shome.jsp");
	}		
	
      out.write("\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("            </table>\r\n");
      out.write("\t</form>\t\t\t\r\n");
      out.write("\t");

	}catch(Exception e)
	{
		out.println(e.toString());
	}

      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"col-md-2 \">\r\n");
      out.write("</div>\r\n");
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
