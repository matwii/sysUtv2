package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import shop.Vareutvalg;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    // todo: Denne skal hentes fra sesjonen
    // Hvis den ikke eksisterer i sesjonen må vi opprette ny og legge i sesjonen
    List<String> handlekurv = new ArrayList<String>();

    // todo: Sjekk om det er parametre i requesten og legg isåfall til varen i handlekurven

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Butikken sin</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Butikken sin</h1>\n");
      out.write("        <a href=\"confirm.jsp\">Til betaling</a>\n");
      out.write("        <h2>Innhold i handlevogn:</h2>\n");
      out.write("        <ul>\n");
      out.write("            ");
 
                for(int i=0; i<handlekurv.size(); i++) { 
                    out.print("<li>" + handlekurv.get(i) + "</li>");
                 }   
            
      out.write("\n");
      out.write("        </ul>\n");
      out.write("        <h2>Legg til ny vare:</h2>\n");
      out.write("        <form method=\"POST\" action=\"cart.jsp\">\n");
      out.write("            <select name=\"item\">\n");
      out.write("                ");
 
                    List<String> varer = Vareutvalg.getVareliste();
                    for(int i=0; i<varer.size(); i++) { 
                        out.print("<option>" + varer.get(i) + "</option>");
                    }   
                
      out.write("\n");
      out.write("            </select>\n");
      out.write("            <input type=\"submit\" value=\"Legg til\"/>\n");
      out.write("        </form>\n");
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
