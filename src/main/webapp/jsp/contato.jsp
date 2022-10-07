<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="a" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.css">
	<script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
<title>Contato</title>
</head>
<body>
<%@ include file="menu.jsp"%>
<main role="main" class="container">
	<div style="padding-top: 20px; align-items: center"><h4>Contato</h4></div>
	<s:form action="salvarcontato">
		<s:hidden name="id" label="Id"></s:hidden>
		<s:textfield name="nome" label="Nome"></s:textfield>
		<s:textfield name="email" label="Email"></s:textfield>
		<tr>
			<td colspan="2"><div align="right">
				<s:a class="btn btn-primary" href="contato">Cancelar</s:a>
				<input type="submit" value="Salvar" class="btn btn-primary" />
			</div></td>
		</tr>
	</s:form>
</main>
</body>
</html>