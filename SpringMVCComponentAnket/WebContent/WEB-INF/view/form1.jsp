<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<f:form action="form2" method="get" modelAttribute="anket">
		Ad: <f:input path="ad" />
		<br />
		<br />
		Soyad: <f:input path="soyad" />
		<br />
		<br />
		Yaş: <f:input path="yas" />
		<br />
		<br />
		Mezuniyet Yılı: <f:select path="mezuniyetYili">
			<f:options items="${anket.yillar}" />
		</f:select>
		<br />
		<br />
		Okul: <f:input path="okul" />
		<br />
		<br />
		<input name="Sayfa2" type="Submit" value="İlerle"/>
	</f:form>
</body>
</html>