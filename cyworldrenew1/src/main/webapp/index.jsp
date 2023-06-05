
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%@ page import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ include file="dbconn.jsp"%>



<%
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
%>
<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
<link href="index.css" rel="stylesheet" type="text/css" />


</head>
<body>
</head>

<body>
	<div id="mini_container">
		<div id="mini_background1">
			<div id="mini_background2">
				<div id="all_contentsdiv">
					<div id="left_contentsborderdiv">
						<div id="left_contents_visitrate">
							<label>Today <%=user_today_visit %> || Total <%=user_total_visit %></label>
						</div>

						<div id="left_contentsdiv">
							<div id="left_contentsdiv1">

								<div id="left_contents_userinfo">

									<%
									if (gender.equals("남") && user_profile_photo == null) {
									%>
									<div id="user_profileimg"
										style="background: url(userprofileimg/maledefault.jpg) no-repeat center; background-size: cover;">
										<form id="formtag" action="add_profileimg.jsp" method="post"
											enctype="multipart/form-data">
											<button id="photo_edit_button" type="button"
												onclick="selectFile()">Edit</button>
											<input type="submit" id="edit_input" value="edit"
												style="display: none;"> <input type="file"
												id="fileinput" name="fileinput" style="display: none;">
										</form>

										<script>
											// 파일 선택 창 열기 및 자동 전환
											function selectFile() {
												document.getElementById(
														'fileinput').click();
											}

											// 파일이 선택되었을 때 자동으로 페이지 전환
											document
													.getElementById('fileinput')
													.addEventListener(
															'change',
															function() {
																document
																		.getElementById(
																				'edit_input')
																		.click();
															});
										</script>


									</div>
									<%
									} else if (gender.equals("여") && user_profile_photo.equals("") || user_profile_photo.equals(null)) {
									%>

									<div id="user_profileimg"
										style="background: url(userprofileimg/femaledefaultimg.jpg) no-repeat center; background-size: cover;">
										<form id="formtag" action="add_profileimg.jsp" method="post"
											enctype="multipart/form-data">
											<button id="photo_edit_button" 
												type="button" onclick="selectFile()">Edit</button>
											<input type="submit" id="edit_input" value="edit"
												style="display: none;"> <input type="file"
												id="fileinput" name="fileinput" style="display: none;">
										</form>

										<script>
											// 파일 선택 창 열기 및 자동 전환
											function selectFile() {
												document.getElementById(
														'fileinput').click();
											}

											// 파일이 선택되었을 때 자동으로 페이지 전환
											document
													.getElementById('fileinput')
													.addEventListener(
															'change',
															function() {
																document
																		.getElementById(
																				'edit_input')
																		.click();
															});
										</script>
									</div>
									<%
									} else {
									%>
									<div id="user_profileimg"
										style="background: url(userprofileimg/<%=user_profile_photo%>) no-repeat center; background-size: cover">
										<form id="formtag" action="add_profileimg.jsp" method="post"
											enctype="multipart/form-data">
											<button id="photo_edit_button"
												type="button" onclick="selectFile()">Edit</button>
											<input type="submit" id="edit_input" value="edit"
												style="display: none;"> <input type="file"
												id="fileinput" name="fileinput" style="display: none;">
										</form>

										<script>
											// 파일 선택 창 열기 및 자동 전환
											function selectFile() {
												document.getElementById(
														'fileinput').click();
											}

											// 파일이 선택되었을 때 자동으로 페이지 전환
											document
													.getElementById('fileinput')
													.addEventListener(
			
															'change',
															function() {
																document
																		.getElementById(
																				'edit_input')
																		.click();
															});
										</script>
									</div>
									<%
									}
									%>
<hr style="width:95%; position:absolute; top:31%;border:1px solid black;" >
<div id="today_feeling">

		오늘의 날씨는??





										<label id="feel_state"></label><Br>
										<button id="feel_edit_button"
											type="button" onclick="showRadioButton()"
											style="float: right;">Edit</button>
<br>
										<input type="radio" id="happy" class="radiofeel" name="radio2"
											onclick="feeling('행복해')" style="display: none;" value="행복해">
										<input type="radio" id="gloomy" class="radiofeel"
											name="radio2" onclick="feeling('우울해')" style="display: none;"
											value="우울해"> <input type="radio" id="sad"
											class="radiofeel" name="radio2" onclick="feeling('슬퍼')"
											style="display: none;" value="슬퍼">
									</div>

									<script>
										function showRadioButton() {
											var feelings = [ '행복해', '우울해', '슬퍼' ];
											var radioButtons = document
													.querySelectorAll('.radiofeel');
											var feelState = document
													.getElementById('feel_state');
											feelState.textContent = ''; // feel_state의 내용을 초기화

											for (var i = 0; i < radioButtons.length; i++) {
												radioButtons[i].style.display = 'inline';
												radioButtons[i].nextSibling.textContent = feelings[i]; // 각 라디오 버튼의 텍스트 설정
											}
											document
													.getElementById('feel_edit_button').style.display = 'none';
										}

										function feeling(feeling) {
											var feelingText = document
													.createElement('span');
											feelingText.textContent = feeling;
											document.getElementById(
													'feel_state').appendChild(
													feelingText);

											var radioButtons = document
													.querySelectorAll('.radiofeel');
											for (var i = 0; i < radioButtons.length; i++) {
												radioButtons[i].style.display = 'none';
												radioButtons[i].nextSibling.textContent = ''; // 라디오 버튼의 텍스트 제거
											}
											document
													.getElementById('feel_edit_button').style.display = 'block';
										}
									</script>



									<div class="myself_introduce" id="myself_introduce">
										<%
										if (user_hello_word == null) {
										%>
										자기 소개를 입력해봅시다
										<%
										} else {
										%>
										<%=user_hello_word%>
										<%
										}
										%>
										
										
										<button id="introduce_edit_button" 
											type="button" onclick="showTextArea()">Edit</button>
									</div>

									<div class="myself_introduce" id="textarea"
										style="display: none">
										<form action="add_introduce.jsp" method="post">
											<textarea name="introduceText"
												style="width: 100%; height: 88%"></textarea>
											<div class="edit_button">
												<button type="submit" onclick="saveText()">저장</button>
												<button onclick="cancelEdit()">취소</button>
											</div>
										</form>
									</div>

									<script>
										function showTextArea() {
											document
													.getElementById('myself_introduce').style.display = 'none';
											document.getElementById('textarea').style.display = 'block';
										}

										function saveText() {
											// 텍스트 저장 처리 및 다음 페이지로 이동
											// ...
											document.getElementById('textarea').style.display = 'none';
											document
													.getElementById('myself_introduce').style.display = 'block';
										}

										function cancelEdit() {
											document.getElementById('textarea').style.display = 'none';
											document
													.getElementById('myself_introduce').style.display = 'block';
										}
									</script>

						<div id="user_name_email">
										<%=user_name%>
										<br><%=email%></div>
								<div id="cousin_select">
										일촌파도타기 <select name="ilchon">
											<option value=""><a>슈퍼맨 </a></option>
											<option value="">1</option>
											<option value=""><a>슈퍼맨 </a></option>
											<option value="">1</option>
											<option value=""><a>슈퍼맨 </a></option>
											<option value="">1</option>


										</select>


									</div>

								</div>
							</div>


						</div>


					</div>

					<div id="center_contentsdiv">
						<div id="center_subject">
							<div id="user_mini_subject">
			
							<div id = "user_mini_subject1">
								<%
								if (user_mini_subject == null || user_mini_subject.equals("")) {
								%>
								미니홈페이지 제목을 입력해주세요<%
								} else {
								%><%=user_mini_subject%>
								<%
								}
								%>
								<button  class="subject_edit_button"
									type="button" onclick="showTextArea1()">Edit</button></div>
								<div class="user_mini_subject" id="subjectarea"
									style="display: none;">
									<form action="add_subject.jsp" method="post">
										<textarea name="subjectText"
											style="width: 85%; height: 50%"></textarea>
										<div class="subject_edit_button" style="float:right">
											<button type="submit" onclick="saveText()">저장</button>
											<button onclick="cancelEdit()">취소</button>
										</div>
									</form>
								</div>


							</div>

							<script>
								function showTextArea1() {
									document
											.getElementById('user_mini_subject1').style.display = 'none';
									document.getElementById('subjectarea').style.display = 'block';
								}

								function saveText1() {
									// 텍스트 저장 처리 및 다음 페이지로 이동
									// ...
									document.getElementById('subjectarea').style.display = 'none';
									document
											.getElementById('user_mini_subject1').style.display = 'block';
								}

								function cancelEdit1() {
									document.getElementById('subjectarea').style.display = 'none';
									document
											.getElementById('user_mini_subject1').style.display = 'block';
								}
							</script>



							<div id="cyworld_url">
								<%=cyworld_url%></div>

						</div>

						<div id="center_contentsdiv1">

							<div id="center_contents">
								<div id="center_innerdiv1">
									<div id="center_newupdate">
										<div>Update News</div>
										<br>


									</div>
									<div id="center_contents_atag">
										<table>
											<tr>
												<td><a href="diary.jsp">다이어리</a></td>
												<td>주크박스</td>
											</tr>
											<tr>
												<td>사진첩</td>
												<td>갤러리</td>
											</tr>
											<tr>
												<td>게시판</td>
												<td>방명록</td>
											</tr>
										</table>
									</div>
								</div>

								<div id="center_miniroom" style="position:relative">
						
									<img alt="" src="userprofileimg/
									<%if(user_miniroom_file==null||user_miniroom_file.equals("")){
										%>		miniroom1.png"<%
									} else{%><%=user_miniroom_file%><%};%>
							
							
										style="width: 100%; height: 100%; background-position: center; background-repeat: no-repeat; background-size: cover;">
										
										<div id="miniroom_img_edit"><form action="having_img.jsp" ><button >Edit</button></form></div>
												
								</div>
								<div id="center_comment">DB에 평가란 만들어서 날짜 별로 가장 상위 3개만 뿌리는?
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