/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-05-02 07:49:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dto.Productrepository;
import dto.Product;
import java.util.*;

public final class productinfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/menu.jsp", Long.valueOf(1683009683654L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("dto.Productrepository");
    _jspx_imports_classes.add("dto.Product");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("#proinfodiv{float:left;}}\r\n");
      out.write("    #proimgdiv{width: 500px;height: 500px;float:left;}\r\n");
      out.write("    img{width: 450px;height: 450px;background-position: center;background-repeat: no-repeat;background-size: cover;box-sizing:border-box;}\r\n");
      out.write("    #proinfoAll{float:left; }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
 request.setCharacterEncoding("utf-8");
String id = request.getParameter("id");
ArrayList<Product> list =  Productrepository.getInstance().getAllProducts();

String productId=null;
Integer unitPrice=0 ;
String pname=null;
String description =null;
String maker=null ;
String category=null ;
long unitsinstock=0;
String condition=null ;
String imageName=null;

for(int i =0;i<list.size();i++){
	if(id.equals(list.get(i).getProductId())){
		productId = id;
		unitPrice=list.get(i).getUnitprice();
		pname=list.get(i).getPname();
		description=list.get(i).getDescription();
		maker=list.get(i).getMaker();
		category=list.get(i).getCategory();
		unitsinstock=list.get(i).getUnitsinstock();
		condition=list.get(i).getCondition();
		imageName=list.get(i).getImageName();
	}
}

      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<header>");
      out.write("\r\n");
      out.write("<style>     #navdiv{background-color: aquamarine;}\r\n");
      out.write("        nav{text-align:left; text-decoration: none; display: inline-block;font-size: 30px;margin-left: 20px;list-style: none;padding:20px;}</style>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"navdiv\">\r\n");
      out.write("<nav>\r\n");
      out.write("    <a href=\"welcome.jsp\">Home</a> \r\n");
      out.write("    <a href=\"product.jsp\">Product</a>\r\n");
      out.write("        <a href=\"addproduct.jsp\">Add Product</a>\r\n");
      out.write("</nav></div>");
      out.write("</header>\r\n");
      out.write("<div id=\"listdiv\"> 상품상세정보</div>\r\n");
      out.write("<div id=\"proinfoAll\">\r\n");
      out.write("<div id=\"proimgdiv\" ><img src=\"");
      out.print(imageName);
      out.write("\"></div>\r\n");
      out.write("<div id=\"proinfodiv\">\r\n");
      out.write("제품코드: ");
      out.print(productId );
      out.write("<br>\r\n");
      out.write("제품이름:");
      out.print(pname );
      out.write("<br>\r\n");
      out.write("제품가격:");
      out.print(unitPrice );
      out.write("<br>\r\n");
      out.write("상세서명:");
      out.print(description);
      out.write("<br>\r\n");
      out.write("제조사:");
      out.print(maker );
      out.write("<br>\r\n");
      out.write("제품분류:");
      out.print(category );
      out.write("<br>\r\n");
      out.write("제품재고:");
      out.print( unitsinstock);
      out.write("<br>\r\n");
      out.write("제품상태:");
      out.print(condition );
      out.write("<br></div></div>\r\n");
      out.write("<form action=\"product.jsp\">\r\n");
      out.write("<input type=\"submit\" value=\"상품목록으로\"></form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
