/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-06-05 00:14:31 UTC
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
    _jspx_dependants.put("/dbconn.jsp", Long.valueOf(1685417444680L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1685405814933L));
    _jspx_dependants.put("jar:file:/D:/JSP-workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/cyworldrenew1/WEB-INF/lib/jstl-1.2.jar!/META-INF/sql.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/D:/JSP-workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/cyworldrenew1/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
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
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

request.setCharacterEncoding("UTF-8");
String user_id = (String) session.getAttribute("sessionId");
PreparedStatement pstmt;
String cyworld_url = null;
String user_mini_subject = null;
String user_miniroom_file = null;
String user_name = null;
String email = null;
String user_profile_photo = null;
String user_hello_word = null;
String gender = null;
int user_today_visit=0;
int user_total_visit=0;
try {
	String sql = "select * from user where user_id=?";
	String sql1 = "select * from profile where user_id=?";
	String sql2 = "select * from user_visitrate where user_id=?";
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, user_id);
	ResultSet rs = pstmt.executeQuery();
	while (rs.next()) {
		cyworld_url = rs.getString("cyworld_url");
		user_name = rs.getString("user_name");
		email = rs.getString("email");
		gender = rs.getString("gender");
	}
	pstmt = conn.prepareStatement(sql1);
	pstmt.setString(1, user_id); // user_id 값을 설정해야 합니다.
	ResultSet rs1 = pstmt.executeQuery();
	while (rs1.next()) {
		user_mini_subject = rs1.getString("user_mini_subject");
		user_miniroom_file = rs1.getString("user_miniroom_file");
		user_profile_photo = rs1.getString("user_profile_photo");
		user_hello_word = rs1.getString("user_hello_word");
	}
	pstmt = conn.prepareStatement(sql2);
	pstmt.setString(1, user_id); // user_id 값을 설정해야 합니다.
	ResultSet rs2 = pstmt.executeQuery();
	while (rs2.next()) {
		user_today_visit = rs2.getInt("user_today_visit");
		user_total_visit = rs2.getInt("user_total_visit");

	}

} catch (SQLException e) {
	e.printStackTrace();
}

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link href=\"index.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	<div id=\"mini_container\">\r\n");
      out.write("		<div id=\"mini_background1\">\r\n");
      out.write("			<div id=\"mini_background2\">\r\n");
      out.write("				<div id=\"all_contentsdiv\">\r\n");
      out.write("					<div id=\"left_contentsborderdiv\">\r\n");
      out.write("						<div id=\"left_contents_visitrate\">\r\n");
      out.write("							<label>Today ");
      out.print(user_today_visit );
      out.write(" || Total ");
      out.print(user_total_visit );
      out.write("</label>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<div id=\"left_contentsdiv\">\r\n");
      out.write("							<div id=\"left_contentsdiv1\">\r\n");
      out.write("\r\n");
      out.write("								<div id=\"left_contents_userinfo\">\r\n");
      out.write("\r\n");
      out.write("									");

									if (gender.equals("남") && user_profile_photo == null) {
									
      out.write("\r\n");
      out.write("									<div id=\"user_profileimg\"\r\n");
      out.write("										style=\"background: url(userprofileimg/maledefault.jpg) no-repeat center; background-size: cover;\">\r\n");
      out.write("										<form id=\"formtag\" action=\"add_profileimg.jsp\" method=\"post\"\r\n");
      out.write("											enctype=\"multipart/form-data\">\r\n");
      out.write("											<button id=\"photo_edit_button\" type=\"button\"\r\n");
      out.write("												onclick=\"selectFile()\">Edit</button>\r\n");
      out.write("											<input type=\"submit\" id=\"edit_input\" value=\"edit\"\r\n");
      out.write("												style=\"display: none;\"> <input type=\"file\"\r\n");
      out.write("												id=\"fileinput\" name=\"fileinput\" style=\"display: none;\">\r\n");
      out.write("										</form>\r\n");
      out.write("\r\n");
      out.write("										<script>\r\n");
      out.write("											// 파일 선택 창 열기 및 자동 전환\r\n");
      out.write("											function selectFile() {\r\n");
      out.write("												document.getElementById(\r\n");
      out.write("														'fileinput').click();\r\n");
      out.write("											}\r\n");
      out.write("\r\n");
      out.write("											// 파일이 선택되었을 때 자동으로 페이지 전환\r\n");
      out.write("											document\r\n");
      out.write("													.getElementById('fileinput')\r\n");
      out.write("													.addEventListener(\r\n");
      out.write("															'change',\r\n");
      out.write("															function() {\r\n");
      out.write("																document\r\n");
      out.write("																		.getElementById(\r\n");
      out.write("																				'edit_input')\r\n");
      out.write("																		.click();\r\n");
      out.write("															});\r\n");
      out.write("										</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("									</div>\r\n");
      out.write("									");

									} else if (gender.equals("여") && user_profile_photo.equals("") || user_profile_photo.equals(null)) {
									
      out.write("\r\n");
      out.write("\r\n");
      out.write("									<div id=\"user_profileimg\"\r\n");
      out.write("										style=\"background: url(userprofileimg/femaledefaultimg.jpg) no-repeat center; background-size: cover;\">\r\n");
      out.write("										<form id=\"formtag\" action=\"add_profileimg.jsp\" method=\"post\"\r\n");
      out.write("											enctype=\"multipart/form-data\">\r\n");
      out.write("											<button id=\"photo_edit_button\" \r\n");
      out.write("												type=\"button\" onclick=\"selectFile()\">Edit</button>\r\n");
      out.write("											<input type=\"submit\" id=\"edit_input\" value=\"edit\"\r\n");
      out.write("												style=\"display: none;\"> <input type=\"file\"\r\n");
      out.write("												id=\"fileinput\" name=\"fileinput\" style=\"display: none;\">\r\n");
      out.write("										</form>\r\n");
      out.write("\r\n");
      out.write("										<script>\r\n");
      out.write("											// 파일 선택 창 열기 및 자동 전환\r\n");
      out.write("											function selectFile() {\r\n");
      out.write("												document.getElementById(\r\n");
      out.write("														'fileinput').click();\r\n");
      out.write("											}\r\n");
      out.write("\r\n");
      out.write("											// 파일이 선택되었을 때 자동으로 페이지 전환\r\n");
      out.write("											document\r\n");
      out.write("													.getElementById('fileinput')\r\n");
      out.write("													.addEventListener(\r\n");
      out.write("															'change',\r\n");
      out.write("															function() {\r\n");
      out.write("																document\r\n");
      out.write("																		.getElementById(\r\n");
      out.write("																				'edit_input')\r\n");
      out.write("																		.click();\r\n");
      out.write("															});\r\n");
      out.write("										</script>\r\n");
      out.write("									</div>\r\n");
      out.write("									");

									} else {
									
      out.write("\r\n");
      out.write("									<div id=\"user_profileimg\"\r\n");
      out.write("										style=\"background: url(userprofileimg/");
      out.print(user_profile_photo);
      out.write(") no-repeat center; background-size: cover\">\r\n");
      out.write("										<form id=\"formtag\" action=\"add_profileimg.jsp\" method=\"post\"\r\n");
      out.write("											enctype=\"multipart/form-data\">\r\n");
      out.write("											<button id=\"photo_edit_button\"\r\n");
      out.write("												type=\"button\" onclick=\"selectFile()\">Edit</button>\r\n");
      out.write("											<input type=\"submit\" id=\"edit_input\" value=\"edit\"\r\n");
      out.write("												style=\"display: none;\"> <input type=\"file\"\r\n");
      out.write("												id=\"fileinput\" name=\"fileinput\" style=\"display: none;\">\r\n");
      out.write("										</form>\r\n");
      out.write("\r\n");
      out.write("										<script>\r\n");
      out.write("											// 파일 선택 창 열기 및 자동 전환\r\n");
      out.write("											function selectFile() {\r\n");
      out.write("												document.getElementById(\r\n");
      out.write("														'fileinput').click();\r\n");
      out.write("											}\r\n");
      out.write("\r\n");
      out.write("											// 파일이 선택되었을 때 자동으로 페이지 전환\r\n");
      out.write("											document\r\n");
      out.write("													.getElementById('fileinput')\r\n");
      out.write("													.addEventListener(\r\n");
      out.write("			\r\n");
      out.write("															'change',\r\n");
      out.write("															function() {\r\n");
      out.write("																document\r\n");
      out.write("																		.getElementById(\r\n");
      out.write("																				'edit_input')\r\n");
      out.write("																		.click();\r\n");
      out.write("															});\r\n");
      out.write("										</script>\r\n");
      out.write("									</div>\r\n");
      out.write("									");

									}
									
      out.write("\r\n");
      out.write("<hr style=\"width:95%; position:absolute; top:31%;border:1px solid black;\" >\r\n");
      out.write("<div id=\"today_feeling\">\r\n");
      out.write("\r\n");
      out.write("		오늘의 날씨는??\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("										<label id=\"feel_state\"></label><Br>\r\n");
      out.write("										<button id=\"feel_edit_button\"\r\n");
      out.write("											type=\"button\" onclick=\"showRadioButton()\"\r\n");
      out.write("											style=\"float: right;\">Edit</button>\r\n");
      out.write("<br>\r\n");
      out.write("										<input type=\"radio\" id=\"happy\" class=\"radiofeel\" name=\"radio2\"\r\n");
      out.write("											onclick=\"feeling('행복해')\" style=\"display: none;\" value=\"행복해\">\r\n");
      out.write("										<input type=\"radio\" id=\"gloomy\" class=\"radiofeel\"\r\n");
      out.write("											name=\"radio2\" onclick=\"feeling('우울해')\" style=\"display: none;\"\r\n");
      out.write("											value=\"우울해\"> <input type=\"radio\" id=\"sad\"\r\n");
      out.write("											class=\"radiofeel\" name=\"radio2\" onclick=\"feeling('슬퍼')\"\r\n");
      out.write("											style=\"display: none;\" value=\"슬퍼\">\r\n");
      out.write("									</div>\r\n");
      out.write("\r\n");
      out.write("									<script>\r\n");
      out.write("										function showRadioButton() {\r\n");
      out.write("											var feelings = [ '행복해', '우울해', '슬퍼' ];\r\n");
      out.write("											var radioButtons = document\r\n");
      out.write("													.querySelectorAll('.radiofeel');\r\n");
      out.write("											var feelState = document\r\n");
      out.write("													.getElementById('feel_state');\r\n");
      out.write("											feelState.textContent = ''; // feel_state의 내용을 초기화\r\n");
      out.write("\r\n");
      out.write("											for (var i = 0; i < radioButtons.length; i++) {\r\n");
      out.write("												radioButtons[i].style.display = 'inline';\r\n");
      out.write("												radioButtons[i].nextSibling.textContent = feelings[i]; // 각 라디오 버튼의 텍스트 설정\r\n");
      out.write("											}\r\n");
      out.write("											document\r\n");
      out.write("													.getElementById('feel_edit_button').style.display = 'none';\r\n");
      out.write("										}\r\n");
      out.write("\r\n");
      out.write("										function feeling(feeling) {\r\n");
      out.write("											var feelingText = document\r\n");
      out.write("													.createElement('span');\r\n");
      out.write("											feelingText.textContent = feeling;\r\n");
      out.write("											document.getElementById(\r\n");
      out.write("													'feel_state').appendChild(\r\n");
      out.write("													feelingText);\r\n");
      out.write("\r\n");
      out.write("											var radioButtons = document\r\n");
      out.write("													.querySelectorAll('.radiofeel');\r\n");
      out.write("											for (var i = 0; i < radioButtons.length; i++) {\r\n");
      out.write("												radioButtons[i].style.display = 'none';\r\n");
      out.write("												radioButtons[i].nextSibling.textContent = ''; // 라디오 버튼의 텍스트 제거\r\n");
      out.write("											}\r\n");
      out.write("											document\r\n");
      out.write("													.getElementById('feel_edit_button').style.display = 'block';\r\n");
      out.write("										}\r\n");
      out.write("									</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("									<div class=\"myself_introduce\" id=\"myself_introduce\">\r\n");
      out.write("										");

										if (user_hello_word == null) {
										
      out.write("\r\n");
      out.write("										자기 소개를 입력해봅시다\r\n");
      out.write("										");

										} else {
										
      out.write("\r\n");
      out.write("										");
      out.print(user_hello_word);
      out.write("\r\n");
      out.write("										");

										}
										
      out.write("\r\n");
      out.write("										\r\n");
      out.write("										\r\n");
      out.write("										<button id=\"introduce_edit_button\" \r\n");
      out.write("											type=\"button\" onclick=\"showTextArea()\">Edit</button>\r\n");
      out.write("									</div>\r\n");
      out.write("\r\n");
      out.write("									<div class=\"myself_introduce\" id=\"textarea\"\r\n");
      out.write("										style=\"display: none\">\r\n");
      out.write("										<form action=\"add_introduce.jsp\" method=\"post\">\r\n");
      out.write("											<textarea name=\"introduceText\"\r\n");
      out.write("												style=\"width: 100%; height: 88%\"></textarea>\r\n");
      out.write("											<div class=\"edit_button\">\r\n");
      out.write("												<button type=\"submit\" onclick=\"saveText()\">저장</button>\r\n");
      out.write("												<button onclick=\"cancelEdit()\">취소</button>\r\n");
      out.write("											</div>\r\n");
      out.write("										</form>\r\n");
      out.write("									</div>\r\n");
      out.write("\r\n");
      out.write("									<script>\r\n");
      out.write("										function showTextArea() {\r\n");
      out.write("											document\r\n");
      out.write("													.getElementById('myself_introduce').style.display = 'none';\r\n");
      out.write("											document.getElementById('textarea').style.display = 'block';\r\n");
      out.write("										}\r\n");
      out.write("\r\n");
      out.write("										function saveText() {\r\n");
      out.write("											// 텍스트 저장 처리 및 다음 페이지로 이동\r\n");
      out.write("											// ...\r\n");
      out.write("											document.getElementById('textarea').style.display = 'none';\r\n");
      out.write("											document\r\n");
      out.write("													.getElementById('myself_introduce').style.display = 'block';\r\n");
      out.write("										}\r\n");
      out.write("\r\n");
      out.write("										function cancelEdit() {\r\n");
      out.write("											document.getElementById('textarea').style.display = 'none';\r\n");
      out.write("											document\r\n");
      out.write("													.getElementById('myself_introduce').style.display = 'block';\r\n");
      out.write("										}\r\n");
      out.write("									</script>\r\n");
      out.write("\r\n");
      out.write("						<div id=\"user_name_email\">\r\n");
      out.write("										");
      out.print(user_name);
      out.write("\r\n");
      out.write("										<br>");
      out.print(email);
      out.write("</div>\r\n");
      out.write("								<div id=\"cousin_select\">\r\n");
      out.write("										일촌파도타기 <select name=\"ilchon\">\r\n");
      out.write("											<option value=\"\"><a>슈퍼맨 </a></option>\r\n");
      out.write("											<option value=\"\">1</option>\r\n");
      out.write("											<option value=\"\"><a>슈퍼맨 </a></option>\r\n");
      out.write("											<option value=\"\">1</option>\r\n");
      out.write("											<option value=\"\"><a>슈퍼맨 </a></option>\r\n");
      out.write("											<option value=\"\">1</option>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("										</select>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("									</div>\r\n");
      out.write("\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div id=\"center_contentsdiv\">\r\n");
      out.write("						<div id=\"center_subject\">\r\n");
      out.write("							<div id=\"user_mini_subject\">\r\n");
      out.write("			\r\n");
      out.write("							<div id = \"user_mini_subject1\">\r\n");
      out.write("								");

								if (user_mini_subject == null || user_mini_subject.equals("")) {
								
      out.write("\r\n");
      out.write("								미니홈페이지 제목을 입력해주세요");

								} else {
								
      out.print(user_mini_subject);
      out.write("\r\n");
      out.write("								");

								}
								
      out.write("\r\n");
      out.write("								<button  class=\"subject_edit_button\"\r\n");
      out.write("									type=\"button\" onclick=\"showTextArea1()\">Edit</button></div>\r\n");
      out.write("								<div class=\"user_mini_subject\" id=\"subjectarea\"\r\n");
      out.write("									style=\"display: none;\">\r\n");
      out.write("									<form action=\"add_subject.jsp\" method=\"post\">\r\n");
      out.write("										<textarea name=\"subjectText\"\r\n");
      out.write("											style=\"width: 85%; height: 50%\"></textarea>\r\n");
      out.write("										<div class=\"subject_edit_button\" style=\"float:right\">\r\n");
      out.write("											<button type=\"submit\" onclick=\"saveText()\">저장</button>\r\n");
      out.write("											<button onclick=\"cancelEdit()\">취소</button>\r\n");
      out.write("										</div>\r\n");
      out.write("									</form>\r\n");
      out.write("								</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("							<script>\r\n");
      out.write("								function showTextArea1() {\r\n");
      out.write("									document\r\n");
      out.write("											.getElementById('user_mini_subject1').style.display = 'none';\r\n");
      out.write("									document.getElementById('subjectarea').style.display = 'block';\r\n");
      out.write("								}\r\n");
      out.write("\r\n");
      out.write("								function saveText1() {\r\n");
      out.write("									// 텍스트 저장 처리 및 다음 페이지로 이동\r\n");
      out.write("									// ...\r\n");
      out.write("									document.getElementById('subjectarea').style.display = 'none';\r\n");
      out.write("									document\r\n");
      out.write("											.getElementById('user_mini_subject1').style.display = 'block';\r\n");
      out.write("								}\r\n");
      out.write("\r\n");
      out.write("								function cancelEdit1() {\r\n");
      out.write("									document.getElementById('subjectarea').style.display = 'none';\r\n");
      out.write("									document\r\n");
      out.write("											.getElementById('user_mini_subject1').style.display = 'block';\r\n");
      out.write("								}\r\n");
      out.write("							</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("							<div id=\"cyworld_url\">\r\n");
      out.write("								");
      out.print(cyworld_url);
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<div id=\"center_contentsdiv1\">\r\n");
      out.write("\r\n");
      out.write("							<div id=\"center_contents\">\r\n");
      out.write("								<div id=\"center_innerdiv1\">\r\n");
      out.write("									<div id=\"center_newupdate\">\r\n");
      out.write("										<div>Update News</div>\r\n");
      out.write("										<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("									</div>\r\n");
      out.write("									<div id=\"center_contents_atag\">\r\n");
      out.write("										<table>\r\n");
      out.write("											<tr>\r\n");
      out.write("												<td><a href=\"diary.jsp\">다이어리</a></td>\r\n");
      out.write("												<td>주크박스</td>\r\n");
      out.write("											</tr>\r\n");
      out.write("											<tr>\r\n");
      out.write("												<td>사진첩</td>\r\n");
      out.write("												<td>갤러리</td>\r\n");
      out.write("											</tr>\r\n");
      out.write("											<tr>\r\n");
      out.write("												<td>게시판</td>\r\n");
      out.write("												<td>방명록</td>\r\n");
      out.write("											</tr>\r\n");
      out.write("										</table>\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("\r\n");
      out.write("								<div id=\"center_miniroom\" style=\"position:relative\">\r\n");
      out.write("						\r\n");
      out.write("									<img alt=\"\" src=\"userprofileimg/\r\n");
      out.write("									");
if(user_miniroom_file==null||user_miniroom_file.equals("")){
										
      out.write("		miniroom1.png\"");

									} else{
      out.print(user_miniroom_file);
};
      out.write("\r\n");
      out.write("							\r\n");
      out.write("							\r\n");
      out.write("										style=\"width: 100%; height: 100%; background-position: center; background-repeat: no-repeat; background-size: cover;\">\r\n");
      out.write("										\r\n");
      out.write("										<div id=\"miniroom_img_edit\"><form action=\"having_img.jsp\" ><button >Edit</button></form></div>\r\n");
      out.write("												\r\n");
      out.write("								</div>\r\n");
      out.write("								<div id=\"center_comment\">DB에 평가란 만들어서 날짜 별로 가장 상위 3개만 뿌리는?\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div id=\"right_contentsdiv_border\">\r\n");
      out.write("						<div id=\"right_contentsdiv\">\r\n");
      out.write("							<div id=\"right_music\"></div>\r\n");
      out.write("							<div id=\"right_menu\">\r\n");
      out.write("								<div>\r\n");
      out.write("									<input type=\"radio\" id=\"home\" class=\"radioG\" name=\"radio1\"\r\n");
      out.write("										style=\"display: none;\"> <a href=\"index.jsp\"\r\n");
      out.write("										target=\"_parent\">홈</a>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div>\r\n");
      out.write("									<input type=\"radio\" id=\"profile\" class=\"radioG\" name=\"radio1\"\r\n");
      out.write("										style=\"display: none;\"> <a href=\"profile.jsp\"\r\n");
      out.write("										target=\"_parent\">프로필</a>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div>\r\n");
      out.write("									<input type=\"radio\" id=\"diary\" class=\"radioG\" name=\"radio1\"\r\n");
      out.write("										style=\"display: none;\"> <a href=\"diary.jsp\"\r\n");
      out.write("										target=\"_parent\">다이어리</a>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div>\r\n");
      out.write("									<input type=\"radio\" id=\"musicbox\" class=\"radioG\" name=\"radio1\"\r\n");
      out.write("										style=\"display: none;\"> <a href=\"jukebox.jsp\"\r\n");
      out.write("										target=\"_parent\">주크박스</a>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div>\r\n");
      out.write("									<input type=\"radio\" id=\"photo\" class=\"radioG\" name=\"radio1\"\r\n");
      out.write("										style=\"display: none;\"> <a target=\"_parent\"\r\n");
      out.write("										href=\"photo.jsp\">사진첩</a>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div>\r\n");
      out.write("									<input type=\"radio\" id=\"board\" class=\"radioG\" name=\"radio1\"\r\n");
      out.write("										style=\"display: none;\"> <a target=\"_parent\"\r\n");
      out.write("										href=\"index.html\">게시판</a>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div>\r\n");
      out.write("									<input type=\"radio\" id=\"visitboard\" class=\"radioG\"\r\n");
      out.write("										name=\"radio1\" style=\"display: none;\"> <a\r\n");
      out.write("										target=\"_parent\" href=\"visit_board.jsp\">방명록</a>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div>\r\n");
      out.write("									<input type=\"radio\" id=\"settion\" class=\"radioG\" name=\"radio1\"\r\n");
      out.write("										style=\"display: none;\"> <a target=\"_parent\"\r\n");
      out.write("										href=\"index.html\">설정</a>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
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
