package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminmenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("    <!-- Latest compiled and minified CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery library -->\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("<a href=\"adminmenu.jsp\"></a>\r\n");
      out.write("<!-- Latest compiled JavaScript -->\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body  style=\"background-image: url('black.jpg')\">\r\n");
      out.write("\r\n");
      out.write("  <nav  class=\"navbar navbar-inverse\"\">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\r\n");
      out.write("        <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("      </button>\r\n");
      out.write("      <a class=\"navbar-brand\" href=\"ahome.jsp\">Home</a>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("      <ul class=\"nav navbar-nav\">\r\n");
      out.write("        <li class=\"active\"><a href=\"ashowall.jsp\">Show All Users <span class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("        <li><a href=\"usr_del.jsp\">Delete user</a></li>\r\n");
      out.write("         <li><a href=\"asearch.jsp\">Search by id</a></li>\r\n");
      out.write("          <li><a href=\"index.jsp\">Logout</a></li>\r\n");
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
