<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="/jsp/head.jsp" %>
<h1>${title}</h1>


<form action="StudentController" method="post">
	
	<input type="text" name="name" >
	<input type="text" name="age" >
	
	<input type="hidden" name="new" value="1" >
	<input type="submit" value="Submit">
</form>





<%@include file="/jsp/footer.jsp" %>