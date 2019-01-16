package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class studentmenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery library -->\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Latest compiled JavaScript -->\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("\t/* Open the sidenav */\r\n");
      out.write("function openNav() {\r\n");
      out.write("    document.getElementById(\"mySidenav\").style.width = \"250px\";\r\n");
      out.write("    //document.getElementById(\"main\").style.marginLeft = \"250px\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Set the width of the side navigation to 0 and the left margin of the page content to 0 */\r\n");
      out.write("function closeNav() {\r\n");
      out.write("    document.getElementById(\"mySidenav\").style.width = \"0\";\r\n");
      out.write("    //document.getElementById(\"main\").style.marginLeft = \"0\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-image: url(black.jpg)\">\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("<div id=\"mySidenav\" class=\"sidenav\" >\r\n");
      out.write("  <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\r\n");
      out.write("  <a href=\"update.jsp\">Edit Profile</a>\r\n");
      out.write("  <a href=\"showfile.jsp\">My files</a>\r\n");
      out.write("  <a href=\"index1.jsp\">Upload</a>\r\n");
      out.write("  <a href=\"searchFile.jsp\">Search Files</a>\r\n");
      out.write("   <a href=\"index_1.jsp\">Logout</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- Use any element to open the sidenav -->\r\n");
      out.write("<span onclick =\"openNav()\">Click here for Menu</span>\r\n");
      out.write("\r\n");
      out.write("<!-- Add all page content inside this div if you want the side nav to push page content to the right (not used if you only want the sidenav to sit on top of the page -->\r\n");
      out.write("<div id=\"main\">\r\n");
      out.write("  Store and share your files...\r\n");
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
