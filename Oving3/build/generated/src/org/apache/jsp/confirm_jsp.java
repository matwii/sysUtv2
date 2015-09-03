package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;

public final class confirm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
 
    List<String> handlekurv = (List<String>) session.getAttribute("handleKurv");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Betaling</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Butikken sin</h1>\n");
      out.write("        <h2>Handlekurv</h2>\n");
      out.write("        <ul>\n");
      out.write("            ");
 
                for(int i=0; i<handlekurv.size(); i++) { 
                    out.print("<li>" + handlekurv.get(i) + "</li>");
                 }   
            
      out.write("\n");
      out.write("        </ul>   \n");
      out.write("        <h2>Bekreft kjøp</h2>\n");
      out.write("        <form method=\"POST\" action=\"confirm.jsp\">\n");
      out.write("            Fornavn: <input type =\"text\" name=\"fornavn\"><br>\n");
      out.write("            Etternavn: <input type=\"text\" name=\"etternavn\"><br>\n");
      out.write("            Adresse: <input type=\"text\" name=\"adresse\"><br>\n");
      out.write("            postnr: <input type=\"text\" name=\"postNr\">\n");
      out.write("            <input type=\"submit\" value=\"Bekreft Kjøp\">\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        Her skal handlekurven listes ut, brukeren skal fylle ut navn og adresse,\n");
      out.write("        og det skal være en knapp for å bekrefte kjøpet.       \n");
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
