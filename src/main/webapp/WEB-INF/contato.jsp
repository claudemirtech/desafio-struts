<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Contato</title>
</head>
<body>

	<s:form action="contato">
		
		<s:textfield name="c.id" label="Id"></s:textfield>
		<s:textfield name="c.nome" label="Nome"></s:textfield>
		<s:textfield name="c.email" label="Email"></s:textfield>
		<s:submit value="Salvar"></s:submit>
	</s:form>

</body>
</html>