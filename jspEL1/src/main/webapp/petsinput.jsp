<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action=petsresult.jsp method="post">
		아이디:<input type=text name=ID><br>
		<br>다음 중 회원님이 키우고 있는 애완동물을 선택하십시오<br>
		<br>개<input type=checkbox name=animal value="개">
		고양이<input type = checkbox name=animal value="고양이">
		쥐<input type = checkbox name =animal value = "쥐">
		<br><br>
		<input type="submit" value="확인">
		<input type ="reset" value="취소">
	
	
	</form>
</body>
</html>