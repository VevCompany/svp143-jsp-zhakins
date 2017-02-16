<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="/jsp/head.jsp" %>
<h1>${title }</h1>


<form action="StudentServlet" method="post">
<label>Login</label>
<input type="text" name="name" >

<input type="submit" value="Submit">
</form> 

<c:forEach var="student" items="${students}">
	<tr>
		<td> <c:out value="${student.name }"></c:out></td>
		<td> <c:out value="${student.group }"></c:out></td>
	 </tr>
</c:forEach>


<%@include file="/jsp/footer.jsp" %>