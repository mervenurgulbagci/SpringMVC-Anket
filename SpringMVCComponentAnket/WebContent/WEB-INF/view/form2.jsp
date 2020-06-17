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
	<f:form action="saveform" method="get" modelAttribute="anket">
		Doğum Yeri: <f:input path="dogumYeri" />
		<br />
		<br />
		Meslek: <f:input path="meslek" />
		<br />
		<br />
		Hobiler: 
		<f:checkbox path="hobiler" value="Kitap Okumak" /> Kitap Okumak
		<f:checkbox path="hobiler" value="Film Izlemek" /> Film Izlemek
		<f:checkbox path="hobiler" value="Kosmak" /> Kosmak
		<f:checkbox path="hobiler" value="Yuzmek" /> Yuzmek
		<f:checkbox path="hobiler" value="At Binmek" /> At Binmek
		<br />
		<br />
		Yabancı Dil: 
		<f:checkbox path="yabanciDil" value="Ingilizce" /> Ingilizce
		<f:checkbox path="yabanciDil" value="Almanca" /> Almanca
		<f:checkbox path="yabanciDil" value="Italyanca" /> Italyanca
			<br />
		<br />
		Ehliyet:
		<f:radiobutton path="ehliyet" value="Var" /> Var
		<f:radiobutton path="ehliyet" value="Yok" /> Yok
		<br />
		<br />
		<input name="Sayfa2" type="Submit" value="Gönder"/>
	</f:form>
</body>
</html>