package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class jdbc1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("   <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
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
      out.write("<div class=\"col-md-12 \">\r\n");
      out.write("<br>\r\n");
      out.write("<h1>Student Records</h1>\r\n");
      out.write("<br>\r\n");
      out.write("<table class=\"table table-bordered\">\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td colspan=\"4\" class=\"bg-success text-info\">Students Record</td>\r\n");
      out.write("<tr>\r\n");
      out.write("<tr class=\"bg-danger\">\r\n");
      out.write("\t<th>ID</th><th>Name</th><th>Age</th><th>Address</th>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");

try{
	Class.forName("com.mysql.jdbc.Driver");	
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mnnit","root","");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from record");
		System.out.println("ID\tName\t\tAge\tAddress");
		while(rs.next())
		{
			
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t<td>");
      out.print(rs.getInt(1) );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(rs.getString(2) );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(rs.getInt(3) );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(rs.getString(4) );
      out.write("</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");

		}
		}catch(Exception e)
		{
			out.println(e.toString());
		}

      out.write("\r\n");
      out.write("</table>\r\n");
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
