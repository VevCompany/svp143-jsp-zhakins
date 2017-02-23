<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="/jsp/head.jsp" %>
<h1>${title }</h1>


<form action="StudentController" method="post">
<a class="MyButton" href="StudentController?new=1">Add</a>
<label>Login</label>
<input type="text" name="name" >

<input type="submit" value="Submit">
</form> 


    
    


<br>
<table>
<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Age</th>
		<th>Action</th>
	<tr>
<c:forEach var="student" items="${students}">	
	<tr>
		<td> <c:out value="${student.id }"></c:out></td>
		<td> <c:out value="${student.name }"></c:out></td>
		<td> <c:out value="${student.age }"></c:out></td>
		<td> <a href="#">Edit</a><a href="#">Delete</a> </td>
	 </tr>
</c:forEach>
</table>

<%@include file="/jsp/footer.jsp" %>