<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="/jsp/head.jsp" %>



<form action="StudentController" method="post">

	<input type="text" name="id" value="${student.id}"  >
	<input type="text" name="name" value="${student.name}"  >
	<input type="text" name="age" value="${student.age}"" >
	
	<input type="hidden" name="edit" value="1">
	
	<input type="submit"  value="Изменить">
</form>





<%@include file="/jsp/footer.jsp" %>