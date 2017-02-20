<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="/jsp/head.jsp" %>
<h1>${title }</h1>


<form action="StudentController" method="post">
<label>Login</label>
<input type="text" name="name" >

<input type="submit" value="Submit">
</form> 

<table>
<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Age</th>
	<tr>
<c:forEach var="student" items="${students}">	
	<tr>
		<td> <c:out value="${student.id }"></c:out></td>
		<td> <c:out value="${student.name }"></c:out></td>
		<td> <c:out value="${student.age }"></c:out></td>
	 </tr>
</c:forEach>
</table>

<%@include file="/jsp/footer.jsp" %>