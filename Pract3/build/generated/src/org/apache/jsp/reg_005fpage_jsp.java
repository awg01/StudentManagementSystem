package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reg_005fpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <link href=\"styles.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <title>Registration Page</title>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("    var stateObject = {\n");
      out.write("      \"Pune\":\n");
      out.write("       {\n");
      out.write("         \"Pune City\":[\"Keshavnagar-Mundwa\", \"Pune Municipal Corporation\", \"Kirkee Cantonment Board\", \"Pune Cantonment Board\"],\n");
      out.write("         \"Haveli\":[\"H1\"],\n");
      out.write("         \"Khed\":[\"K1\", \"K2\"],\n");
      out.write("         \"Baramati\":[\"B1\", \"B2\"],\n");
      out.write("         \"Junnar\":[\"J1\", \"J2\"],\n");
      out.write("         \"Shirur\":[\"S1\", \"S2\"],\n");
      out.write("         \"Indapur\":[\"I1\", \"I2\"],\n");
      out.write("         \"Daund\":[\"D1\", \"D2\", \"D3\"],\n");
      out.write("         \"Mawal\":[\"M1\", \"M2\"],\n");
      out.write("         \"Ambegaon\":[\"A1\", \"A3\"],\n");
      out.write("         \"Purandhar\":[\"P1\", \"P3\"],\n");
      out.write("         \"Bhor\":[\"B1\", \"B2\", \"B3\", \"B4\"],\n");
      out.write("         \"Mulshi\":[\"M1\", \"M2\", \"M3\", \"M4\"],\n");
      out.write("         \"Velhe\":[\"V1\", \"V2\", \"V3\", \"V4\"],\n");
      out.write("       },\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    window.onload = function ()\n");
      out.write("    {\n");
      out.write("      var districtSel = document.getElementById(\"districtSel\"),\n");
      out.write("      talukaSel = document.getElementById(\"talukaSel\"),\n");
      out.write("      villageSel = document.getElementById(\"villageSel\");\n");
      out.write("\n");
      out.write("      for (var country in stateObject)\n");
      out.write("      {\n");
      out.write("        districtSel.options[districtSel.options.length] = new Option(country, country);\n");
      out.write("      }\n");
      out.write("      districtSel.onchange = function ()\n");
      out.write("      {\n");
      out.write("        talukaSel.length = 1; // remove all options bar first\n");
      out.write("        villageSel.length = 1; // remove all options bar first\n");
      out.write("        if (this.selectedIndex < 1) return; // done\n");
      out.write("        for (var state in stateObject[this.value])\n");
      out.write("        {\n");
      out.write("          talukaSel.options[talukaSel.options.length] = new Option(state, state);\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("      districtSel.onchange(); // reset in case page is reloaded\n");
      out.write("      talukaSel.onchange = function ()\n");
      out.write("      {\n");
      out.write("        villageSel.length = 1; // remove all options bar first\n");
      out.write("        if (this.selectedIndex < 1) return; // done\n");
      out.write("\n");
      out.write("        var district = stateObject[districtSel.value][this.value];\n");
      out.write("        for (var i = 0; i < district.length; i++)\n");
      out.write("        {\n");
      out.write("          villageSel.options[villageSel.options.length] = new Option(district[i], district[i]);\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("    }\n");
      out.write("    </script>\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("    <form name=\"registration_form\"  action=\"RegistrationChecker.jsp\" method=\"post\">\n");
      out.write("      <table id='reg_table' align=\"center\">\n");
      out.write("\n");
      out.write("        <tr>\n");
      out.write("          <td>\n");
      out.write("             <h3 id=\"page_title\">Registration Form</h3>\n");
      out.write("          </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("           <td>Full Name</td>\n");
      out.write("           <td>\n");
      out.write("               <input type=\"text\" id=\"username\" name=\"username\"  pattern=\"{a-Aa-Z}[2,]\" required=\"\">\n");
      out.write("           </td>\n");
      out.write("        </<tr>\n");
      out.write("\n");
      out.write("        <tr>\n");
      out.write("           <td>Roll No.</td>\n");
      out.write("           <td>\n");
      out.write("               <input type=\"number\" id=\"rollno\" name=\"rollno\" pattern=\"{0-9}\" required=\"\">\n");
      out.write("           </td>\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("        <tr>\n");
      out.write("           <td>D.O.B.</td>\n");
      out.write("           <td>\n");
      out.write("               <input type=\"date\" name=\"dob\" id=\"dob\" required=\"\">\n");
      out.write("           </td>\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("        <tr>\n");
      out.write("           <td>Email Address</td>\n");
      out.write("           <td>\n");
      out.write("               <input type=\"email\" id=\"email\" name=\"email\" required=\"\">\n");
      out.write("           </td>\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("        <tr>\n");
      out.write("           <td>Mobile Number</td>\n");
      out.write("           <td>\n");
      out.write("               <input type=\"tel\" name=\"mobile\" id=\"mobile\" pattern=\"{0-9}[10]\" required=\"\">\n");
      out.write("           </td>\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("        <tr>\n");
      out.write("          <td>\n");
      out.write("            Select District: <select id=\"districtSel\" size=\"1\">\n");
      out.write("            <option value=\"\" selected=\"selected\">Select District</option>\n");
      out.write("            </select>\n");
      out.write("          </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td>\n");
      out.write("            Select Taluka: <select id=\"talukaSel\" size=\"1\">\n");
      out.write("            <option value=\"\" selected=\"selected\">Please select District first</option>\n");
      out.write("            </select>\n");
      out.write("          </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td>\n");
      out.write("            Select Village: <select id=\"villageSel\" size=\"1\">\n");
      out.write("            <option value=\"\" selected=\"selected\">Please select Taluka first</option>\n");
      out.write("            </select>\n");
      out.write("          </td>\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("        <tr>\n");
      out.write("           <td>Gender</td>\n");
      out.write("           <td>\n");
      out.write("                <input type=\"radio\" name=\"gender\" value=\"male\" > Male <br>\n");
      out.write("                <input type=\"radio\" name=\"gender\" value=\"female\"> Female <br>\n");
      out.write("                <input type=\"radio\" name=\"gender\" value=\"other\"> Other <br>\n");
      out.write("           </td>\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("        <tr>\n");
      out.write("           <td>Photo</td>\n");
      out.write("           <td>\n");
      out.write("                <input type=\"file\" name=\"photo\">\n");
      out.write("           </td>\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("        <tr>\n");
      out.write("           <td>Signature</td>\n");
      out.write("           <td>\n");
      out.write("                <input type=\"file\" name=\"sign\">\n");
      out.write("           </td>\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>Password</td>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"text\" id=\"password\" name=\"password\" pattern=\"{a-Aa-z}[2,]\" required=\"\">\n");
      out.write("\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Confirm Password</td>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"text\" id=\"confPass\" name=\"confPassword\" pattern=\"{a-Aa-z}[2,]\" disabled=\"\">\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("           <td>\n");
      out.write("                  <input type=\"submit\" value=\"Register\" id=\"reg_button\">\n");
      out.write("           </td>\n");
      out.write("           <td>\n");
      out.write("                  <input type=\"button\" onclick=\"location.href='index.jsp'\" value=\"Login\" id=\"login_button\">\n");
      out.write("           </td>\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("      </table>\n");
      out.write("    </form>\n");
      out.write("  </body>\n");
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
