package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <!-- Latest compiled and minified CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery library -->\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Latest compiled JavaScript -->\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-image: url(black.jpg);color: white \">\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("<div class=\"col-md-3 \">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"col-md-6 \">\r\n");

	try{
         
         if(session.getAttribute("UserName")!=null)
         {
             String un=(String)session.getAttribute("UserName");
		Class.forName("com.mysql.jdbc.Driver");	
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		Statement st=con.createStatement();
		String sql="select *  from user2 where uname='"+un+"'";
		ResultSet rs=st.executeQuery(sql);
		out.println("<table class='table table-bordered'>");	
		while(rs.next())
		{
			String gid=rs.getString(1);
                        out.println(" <br/><br/><br/><br/><br/><br/><br/><br/>");
			out.println("<tr><td>"+gid+"</td>");
			out.println("<tr><td>"+rs.getString(2)+"</td></tr>");
			out.println("<tr><td>"+rs.getString(3)+"</td></tr>");
			out.println("<tr><td>"+rs.getString(4)+"</td></tr>");
		
			
      out.write("\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t<a href=\"record_update_query1.jsp?id=");
      out.print(gid );
      out.write("\" ><span class=\"glyphicon glyphicon-pencil\"></span>\r\n");
      out.write("</a>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t");

			out.println("</tr>");		
			}
		out.println("</table>");
	}
}catch(Exception e)
	{
		out.println(e.toString());
	}


      out.write("\r\n");
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
