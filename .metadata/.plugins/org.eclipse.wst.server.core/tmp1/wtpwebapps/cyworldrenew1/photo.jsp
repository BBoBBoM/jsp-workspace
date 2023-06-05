<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ include file="dbconn.jsp"%>

<%
request.setCharacterEncoding("UTF-8");
String user_id = (String) session.getAttribute("sessionId");

String user_name = "";
String email = "";
String user_profile_photo = "";
String user_hello_word = "";
String cyworld_url = "";
String user_mini_subject = "";
String user_miniroom_file = "";
PreparedStatement pstmt;
List<String> photo_url = new ArrayList<>();
List<String> photo_contents = new ArrayList<>();
List<String> photo_date = new ArrayList<>();
try {
	String sql = "select * from photo where user_id=? order by photo_date DESC; ";
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, user_id);
	ResultSet rs = pstmt.executeQuery();
	while (rs.next()) {
		String photo_url1 = rs.getString("photo_url");
		String photo_contents1 = rs.getString("photo_contents");
		String photo_date1 = rs.getString("photo_date");
		photo_url.add(photo_url1);
		photo_contents.add(photo_contents1);
		photo_date.add(photo_date1);
	}

} catch (SQLException e) {
	e.printStackTrace();
}

try {
	String sql = "select * from user where user_id=?";
	String sql1 = "select * from profile where user_id=?";
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, user_id);
	ResultSet rs = pstmt.executeQuery();
	while (rs.next()) {
		cyworld_url = rs.getString("cyworld_url");
		user_name = rs.getString("user_name");
		email = rs.getString("email");
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

} catch (SQLException e) {
	e.printStackTrace();
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
* {
	margin: 0 auto;
	box-sizing: border-box;
	list-style: none;
	border: 1px solid black;
}

#mini_container {
	width: 1400px;
	height: 850px;
	border: 1px solid;
	position: relative;
}

#mini_background1 {
	width: 100%;
	height: 100%;
	background: url(background/background.png) no-repeat center;
	background-size: cover;
	position: absolute;
}

#mini_background2 {
	width: 95%;
	height: 95%;
	margin-top: 25px;
	border: 1px solid blue;
	background: url(background/outer.png) no-repeat center;
	background-size: cover;
	background-size: 100% 100%;
}

#all_contentsdiv {
	width: 1300px;
	height: 800px;
	border: 1px solid red;
}

#left_contentsborderdiv {
	float: left;
	margin-top: 10px;
	width: 375px;
	border: 1px solid;
	height: 760px;
}

#center_contentsdiv {
	margin-top: 10px;
	box-sizing: border-box;
	margin-right: 0px;
	width: 700px;
	float: left;
	height: 760px;
	border: 1px solid rgb(63, 231, 236);
}

#center_subject {
	margin-left: 23px;
	height: 6%;
	border: 1px solid;
	margin-top: 30px;
}

#left_contents_visitrate {
	margin-left: 45px;
	margin-top: 35px;
	margin-bottom: 0px;
	width: 80%;
	height: 5%;
	border: 1px solid rgb(6, 243, 38);
}

#right_contentsdiv_border {
	width: 180px;
	height: 760px;
	float: left;
	margin: 10px 0px;
	padding: 0px;
	position: relative;
	border: 1px solid brown;
}

#right_contentsdiv {
	width: 180px;
	height: 613px;
	float: left;
	border: 1px solid red;
}

#right_menu {
	width: 100px;
	height: 320px;
	border: 1px solid salmon;
	margin-top: 180px;
	float: left;
}

#right_menu>div {
	padding: 5px;
	height: 40px;
	border-radius: 15px;
}

#right_menu>div>a {
	margin-left: 5px;
	line-height: 30px;
}

#right_music {
	position: absolute;
	margin-left: 10px;
	top: 36px;
	width: 82%;
	height: 17%;
	border: 1px solid rebeccapurple;
}

#profile_contents_div {
	margin-right: 0px;
	padding: 0px;
	width: 320px;
	margin-left: 35px;
	height: 680px;
	border: 1px solid rgb(219, 34, 34);
}

#profile_tag_subject, #profile_tag_div1, #profile_tag_div2 {
	margin-top: 35px;
	margin-bottom: 0px;
	width: 90%;
	height: 5%;
	border: 1px solid rgb(6, 243, 38);
}

#center_contentsdiv1 {
	width: 685px;
	float: left;
	height: 680px;
	border: 1px solid rgb(109, 30, 255);
	margin-left: 13px;
}

#center_photocontentsdiv {
	box-sizing: border-box;
	width: 685px;
	float: left;
	height: 680px;
	border: 1px solid rgb(109, 30, 255);
	margin-left: 13px;
}

#center_photocontentsdiv1 {
	box-sizing: border-box;
	width: 650px;
	float: right;
	height: 660px;
	border: 1px solid rgb(70, 144, 241);
	margin-left: 13px;
	word-wrap: break-word;
	overflow-y: scroll;
}

#center_photo_contents {
	width: 550px;
	height: 300px;
	border: 1px solid red;
	margin-left: 45px;
	margin-top: 30px;
}

#wrap {
	width: 550px;
	height: 100px;
}

.center_photo_box {
	width: 550px;
	height: 300px;
}


#left_contentsdiv {
	margin-right: 0px;
	padding: 0px;
	width: 320px;
	margin-left: 35px;
	float: left;
	height: 680px;
	border: 1px solid rgb(219, 34, 34);
}

#left_contentsdiv1 {
	width: 100%;
	height: 99%;
	border: 1px solid rgb(31, 250, 250);
}
 
#left_contents_userinfo {
	height: 100%;
	border-radius: 15px;
	padding: 5px;
	position: relative;
	border: 1px solid rgb(6, 243, 38);
}

#left_contents_userinfo>div {
	position: absolute;
	width: 94%;
}

#user_profileimg {
	width: 100%;
	height: 30%;
	border: 1px solid rgb(6, 243, 38);
}

#today_feeling {
	height: 5%;
	top: 32%;
	border: 1px solid pink;
}

#myself_introduce {
	height: 32%;
	border: 1px solid green;
	top: 38%;
}

#user_name_email {
	height: 10%;
	top: 72%;
	border: 1px solid saddlebrown;
}

#cousin_select {
	height: 15%;
	top: 84%;
	border: 1px solid salmon;
}
</style>


</head>

<body>
	<div id="mini_container">
		<div id="mini_background1">
			<div id="mini_background2">
				<div id="all_contentsdiv">
					<div id="left_contentsborderdiv">
						<div id="left_contents_visitrate">
							<label>Today 38 || Total 1000</label>
						</div>

						<div id="left_contentsdiv">
							<div id="left_contentsdiv1">

								<div id="left_contents_userinfo">
									<div id="user_profileimg"
										style="background:url(userprofileimg/<%=user_profile_photo%>) no-repeat center;background-size: contain;">

									</div>
									<div id="today_feeling">오늘의 기분은 우울</div>
									<div id="myself_introduce"><%=user_hello_word%></div>
									<div id="user_name_email">
										<%=user_name%>
										<br><%=email%></div>
									<div id="cousin_select"></div>

								</div>
							</div>


						</div>

					</div>

					<div id="center_contentsdiv">
						<div id="center_subject">
							<p>
								<%=user_mini_subject%>
							</p>
							<p>
								<%=cyworld_url%>
							</p>
						</div>
						<div id="center_contents">
							<div id="center_photocontentsdiv">
								<div id="center_photocontentsdiv1">
									<div id="center_photo_subject">사진첩</div>
									<div id="center_photo_contents">

										<%
										if (!user_id.isEmpty()&&!photo_date.isEmpty()) {
											for (int i = 0; i < photo_date.size(); i++) {
										%>
										<div class="center_photo_box">
											<%=photo_date.get(i)%>
											<img src="userprofileimg/<%=photo_url.get(i)%>" style="width:100%;height:85%; background-position: center; background-repeat: no-repeat;background-size: cover;">
											<%=photo_contents.get(i)%>
										</div>
										<br>
										<br>
										<%
										}
										} else {
										%>
										<div class="center_photo_box">사진이 없네요 업로드 해봐요</div>
										<%
										}
										%>
									</div>




								</div>

							</div>
						</div>
					</div>
					<div id="right_contentsdiv_border">
						<div id="right_contentsdiv">
							<div id="right_music"></div>
							<div id="right_menu">
								<div>
									<input type="radio" id="home" class="radioG" name="radio1"
										style="display: none;"> <a href="index.jsp"
										target="_parent">홈</a>
								</div>
								<div>
									<input type="radio" id="profile" class="radioG" name="radio1"
										style="display: none;"> <a href="profile.jsp"
										target="_parent">프로필</a>
								</div>
								<div>
									<input type="radio" id="diary" class="radioG" name="radio1"
										style="display: none;"> <a href="diary.jsp"
										target="_parent">다이어리</a>
								</div>
								<div>
									<input type="radio" id="musicbox" class="radioG" name="radio1"
										style="display: none;"> <a href="jukebox.jsp"
										target="_parent">주크박스</a>
								</div>
								<div>
									<input type="radio" id="photo" class="radioG" name="radio1"
										style="display: none;"> <a target="_parent"
										href="photo.jsp">사진첩</a>
								</div>
								<div>
									<input type="radio" id="board" class="radioG" name="radio1"
										style="display: none;"> <a target="_parent"
										href="index.html">게시판</a>
								</div>
								<div>
									<input type="radio" id="visitboard" class="radioG"
										name="radio1" style="display: none;"> <a
										target="_parent" href="visit_board.jsp">방명록</a>
								</div>
								<div>
									<input type="radio" id="settion" class="radioG" name="radio1"
										style="display: none;"> <a target="_parent"
										href="index.html">설정</a>
								</div>
							</div>
						</div>
					</div>


				</div>
			</div>
		</div>

	</div>
</body>
</html>