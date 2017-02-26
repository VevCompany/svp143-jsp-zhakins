<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="/jsp/head.jsp" %>

<c:url var="newStud" value="StudentController?new=1"/>
<c:url var="editStud" value="StudentController?edit=1"/>

<a class="MyButton" href="${newStud}">Add</a>




<form action="StudentController" method="post">

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
		<td > <a  href="${editStud}" >Edit</a><a href="#">Delete</a> </td>
	 </tr>
</c:forEach>
</table>

<%@include file="/jsp/footer.jsp" %>