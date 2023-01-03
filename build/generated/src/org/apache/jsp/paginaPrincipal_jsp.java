package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class paginaPrincipal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=windows-1252");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/index.css\" media=\"screen\" />\n");
      out.write("    <title>Document</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"container-menu\">\n");
      out.write("        <img class=\"img-nav\" src=\"./imagenes/a.png\" alt=\"\">\n");
      out.write("        <nav class=\"menu\">\n");
      out.write("            <ul>\n");
      out.write("                <li>\n");
      out.write("                    <hr> ABOUT\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <hr>PRODUCTS\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <hr>SERVISES\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <hr>GALLERY\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <hr>BLOG\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <hr>CONTAG\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("    </div>\n");
      out.write("    <section class=\"container-section\">\n");
      out.write("        <div class=\"presentacion\">\n");
      out.write("            <h1>If you can dream it <br> You can do it</h1>\n");
      out.write("            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Itaque odio, magni, voluptas, in asperiores at\n");
      out.write("                beatae corporis exercitationem dolorem omnis saepe aliquid distinctio. Esse tempora officiis saepe,\n");
      out.write("                magnam dignissimos cum!\n");
      out.write("                Quod illum dolor ullam aliquid veniam sequi asperiores autem aut</p>\n");
      out.write("            <button>READ MORE</button>\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            <img src=\"./imagenes/set-of-web-page-design-templates-vector.jpg\" alt=\"\">\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
