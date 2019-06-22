<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<jsp:useBean id="user" scope="request" class="javachukyu7.UserBean" />
<!-- ↑「class=～」は使うクラスを指定。「id=～」は使うクラスに仮の名前をつける。この名前を元にuser.getIdとかを実行している -->

<!DOCTYPE html>
<html>
	<head>
		<title>Java入門</title>
	</head>
	<body>
		<p>リクエスト結果</p>
		<p>ID:<%=user.getId() %></p>
		<p>名前:<%=user.getName() %></p>
		<p>年齢:<%=user.getAge() %></p>
		<form>
			<input type="button" onclick="location.href='./WEB-JavaChukyu7/userRequest.jsp'" value="戻る">
		</form>
	</body>
</html>