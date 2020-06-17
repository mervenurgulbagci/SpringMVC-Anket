<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
table {
	border: 1px solid black;
	margin: 30px;
}

td {
	border: 1px;
}
</style>
</head>
<body>

	<table>
		<tr>
			<td>Ad:</td>
			<td>${anket.ad}</td>
		</tr>
		<tr>
			<td>Soyad:</td>
			<td>${anket.soyad}</td>
		</tr>
		<tr>
			<td>Yaş:</td>
			<td>${anket.yas}</td>
		</tr>
		<tr>
			<td>Mezuniyet Yılı:</td>
			<td>${anket.mezuniyetYili}</td>
		</tr>
		<tr>
			<td>Okul:</td>
			<td>${anket.okul}</td>
		</tr>
		<tr>
			<td>Doğum Yeri:</td>
			<td>${anket.dogumYeri}</td>
		</tr>
		<tr>
			<td>Hobiler:</td>
			<td><ul>
					<c:forEach var="rec" items="${anket.hobiler}">
						<li>${rec}</li>
					</c:forEach>
				</ul></td>
		</tr>
		<tr>
			<td>Yabancı Dil:</td>
			<td><ul>
					<c:forEach var="rec" items="${anket.yabanciDil}">
						<li>${rec}</li>
					</c:forEach>
				</ul></td>
		</tr>
		<tr>
			<td>Ehliyet:</td>
			<td>${anket.ehliyet}</td>
		</tr>
	</table>

	<br />

	<br />

	<br />

	<br />
</body>
</html>