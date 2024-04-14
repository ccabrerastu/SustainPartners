package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Landing Page - Sustain Partners</title>\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"bg-black h-screen font-sans relative overflow-hidden\">\n");
      out.write("\n");
      out.write("    <!-- Background Video -->\n");
      out.write("    <video id=\"video-background\" autoplay muted loop class=\"absolute top-0 left-0 w-full h-full object-cover z-0 filter blur-sm\">\n");
      out.write("        <source src=\"Assets/landing.mp4\" type=\"video/mp4\">\n");
      out.write("    </video>\n");
      out.write("\n");
      out.write("    <!-- Black Overlay -->\n");
      out.write("    <div class=\"absolute inset-0 bg-black opacity-50 z-5\"></div>\n");
      out.write("\n");
      out.write("    <!-- Content -->\n");
      out.write("    <div class=\"absolute top-1/2 left-1/2 transform -translate-x-1/2 -translate-y-1/2 z-10 text-center\">\n");
      out.write("        <h1 class=\"text-4xl font-bold mb-4 text-white\">Sustain Partners</h1>\n");
      out.write("        <p class=\"mb-8 text-gray-200 text-lg\">Impulsando proyectos de desarrollo sostenible alineados con los ODS de la ONU en el Perú.</p>\n");
      out.write("\n");
      out.write("        <div class=\"flex flex-col space-y-4\">\n");
      out.write("            <a href=\"login\" class=\"bg-blue-600 text-white w-full p-2 rounded-md hover:bg-blue-700 focus:ring focus:ring-blue-300\">Iniciar sesión</a>\n");
      out.write("            <a href=\"register\" class=\"border border-blue-600 text-blue-600 w-full p-2 rounded-md hover:bg-blue-600 hover:text-white focus:ring focus:ring-blue-300\">Registrarse</a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"mt-16 flex justify-around w-full text-white space-x-6\">\n");
      out.write("            <div class=\"flex flex-col items-center\">\n");
      out.write("                <img src=\"Assets/arbol.png\" alt=\"ODS Icon\" class=\"w-16 h-16 mb-4\">\n");
      out.write("                <span class=\"font-bold\">ODS</span>\n");
      out.write("                <span>Objetivos de Desarrollo Sostenible</span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"flex flex-col items-center\">\n");
      out.write("                <img src=\"Assets/partners.png\" alt=\"Partners Icon\" class=\"w-16 h-16 mb-4\">\n");
      out.write("                <span class=\"font-bold\">Partners</span>\n");
      out.write("                <span>Promovemos la colaboración entre comunidades</span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"flex flex-col items-center\">\n");
      out.write("                <img src=\"Assets/projects.png\" alt=\"Projects Icon\" class=\"w-16 h-16 mb-4\">\n");
      out.write("                <span class=\"font-bold\">Proyectos</span>\n");
      out.write("                <span>Impulsamos iniciativas a nivel nacional</span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
