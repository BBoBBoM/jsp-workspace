/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-05-25 08:27:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/D:/JSP-workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/cyworldProject1/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/dbconn.jsp", Long.valueOf(1684823473787L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1684473311329L));
    _jspx_dependants.put("jar:file:/D:/JSP-workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/cyworldProject1/WEB-INF/lib/jstl-1.2.jar!/META-INF/sql.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      out.write("\r\n");
      out.write("        \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");

	Connection conn = null;	

	try {
		String url = "jdbc:mysql://localhost:3306/cyworld";
		String user = "root";
		String password = "1111";

		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url, user, password);

	} catch (SQLException ex) {
		out.println("데이터베이스 연결이 실패되었습니다.<br>");
		out.println("SQLException: " + ex.getMessage());
	}
		

      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\r\n");

request.setCharacterEncoding("UTF-8");
String user_id = (String) session.getAttribute("sessionId");
PreparedStatement pstmt;
String cyworld_url = "";
String user_mini_subject = "";
String user_miniroom_file ="";
try {
    String sql = "select * from user where user_id=?";
    String sql1 = "select * from profile where user_id=?";
    pstmt = conn.prepareStatement(sql);
    pstmt.setString(1, user_id);
    ResultSet rs = pstmt.executeQuery();
    while (rs.next()) {
    	cyworld_url = rs.getString("cyworld_url");
    }
    pstmt = conn.prepareStatement(sql1);
    pstmt.setString(1, user_id); // user_id 값을 설정해야 합니다.
    ResultSet rs1 = pstmt.executeQuery();
    while (rs1.next()) {
    	user_mini_subject = rs1.getString("user_mini_subject");
		user_miniroom_file =rs1.getString("user_miniroom_file");
	
    }

} catch (SQLException e) {
    e.printStackTrace();
}


      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<style>\r\n");
      out.write("		* {\r\n");
      out.write("			margin: 0 auto;\r\n");
      out.write("			box-sizing: border-box;\r\n");
      out.write("			list-style: none;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		#mini_container {\r\n");
      out.write("			width: 1400px;\r\n");
      out.write("			height: 850px;\r\n");
      out.write("			border: 1px solid;\r\n");
      out.write("			position: relative;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		#mini_background1 {\r\n");
      out.write("			width: 100%;\r\n");
      out.write("			height: 100%;\r\n");
      out.write("			background: url(background/background.png) no-repeat center;\r\n");
      out.write("			background-size: cover;\r\n");
      out.write("			position: absolute;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		#mini_background2 {\r\n");
      out.write("			width: 95%;\r\n");
      out.write("			height: 95%;\r\n");
      out.write("			margin-top: 25px;\r\n");
      out.write("			border: 1px solid blue;\r\n");
      out.write("			background: url(background/outer.png) no-repeat center;\r\n");
      out.write("			background-size: cover;\r\n");
      out.write("			background-size: 100% 100%;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		#all_contentsdiv {\r\n");
      out.write("			width: 1300px;\r\n");
      out.write("			height: 800px;\r\n");
      out.write("			border: 1px solid red;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		#left_contentsborderdiv {\r\n");
      out.write("			float: left;\r\n");
      out.write("			margin-top: 10px;\r\n");
      out.write("			width: 375px;\r\n");
      out.write("			border: 1px solid;\r\n");
      out.write("			height: 760px;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		#center_contentsdiv {\r\n");
      out.write("			margin-top: 10px;\r\n");
      out.write("			box-sizing: border-box;\r\n");
      out.write("			margin-right: 0px;\r\n");
      out.write("			width: 700px;\r\n");
      out.write("			float: left;\r\n");
      out.write("			height: 760px;\r\n");
      out.write("			border: 1px solid rgb(63, 231, 236);\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		#center_subject {\r\n");
      out.write("			margin-left: 23px;\r\n");
      out.write("			height: 6%;\r\n");
      out.write("			border: 1px solid;\r\n");
      out.write("			margin-top: 30px;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		#left_contents_visitrate {\r\n");
      out.write("			margin-left: 48px;\r\n");
      out.write("			margin-top: 35px;\r\n");
      out.write("			margin-bottom: 0px;\r\n");
      out.write("			width: 80%;\r\n");
      out.write("			height: 5%;\r\n");
      out.write("			border: 1px solid rgb(6, 243, 38);\r\n");
      out.write("		} \r\n");
      out.write("		\r\n");
      out.write("		#right_contentsdiv_border {\r\n");
      out.write("			width: 200px;\r\n");
      out.write("			height: 760px;\r\n");
      out.write("			float: left;\r\n");
      out.write("			margin: 10px 0px;\r\n");
      out.write("			padding: 0px;\r\n");
      out.write("			position: relative;\r\n");
      out.write("			border: 1px solid brown;\r\n");
      out.write("		}\r\n");
      out.write("		</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	<div id=\"mini_container\">\r\n");
      out.write("		<div id=\"mini_background1\">\r\n");
      out.write("			<div id=\"mini_background2\">\r\n");
      out.write("				<div id=\"all_contentsdiv\">\r\n");
      out.write("					<div id=\"left_contentsborderdiv\">\r\n");
      out.write("						<div id=\"left_contents_visitrate\">\r\n");
      out.write("						<label>Today 38 || Total 1000</label></div>\r\n");
      out.write("						<iframe src=\"left_contentsdiv_home1.jsp\" name=\"iframehome\"\r\n");
      out.write("							frameborder=\"0\" style=\"width: 100%; height: 100%;\" scrolling=\"no\"></iframe>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div id=\"center_contentsdiv\">\r\n");
      out.write("						<div id=\"center_subject\">\r\n");
      out.write("							<p>");
      out.print(user_mini_subject);
      out.write("</p>\r\n");
      out.write("							<p>");
      out.print(cyworld_url);
      out.write("</p>\r\n");
      out.write("						</div>\r\n");
      out.write("						<iframe src=\"center_contentsdiv_home.jsp\" name=\"iframehome\"\r\n");
      out.write("							frameborder=\"0\" style=\"width: 100%; height: 100%;\" scrolling=\"no\"></iframe>\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("					<div id=\"right_contentsdiv_border\">\r\n");
      out.write("						<iframe src=\"right_contentsdiv2.html\" frameborder=\"0\"\r\n");
      out.write("							style=\"width: 100%; height: 100%;\" scrolling=\"no\"></iframe>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
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
