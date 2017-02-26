<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="/jsp/head.jsp" %>


<c:url var="newStud" value="StudentController?new=1"/>
<c:url var="editStud" value="StudentController?edit=1&id="/>
<c:url var="delStud" value="StudentController?del=1&id="/>

<a class="MyButton" href="${newStud}">Add</a>

<form action="StudentController" method="post">

<label>Login</label>
<input type="text" name="name" >

<input type="submit" value="Submit">
</form> 
<br>
<table id="t_price">
<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Age</th>
		<th>Action</th>
	<tr>
<c:forEach var="student" items="${students}">	
	<tr class="rowlink">
		<td class="item" type="id"> <c:out value="${student.id}"></c:out></td>
		<td class="item" type="name"> <c:out value="${student.name}"></c:out></td>
		<td class="item" type="age"> <c:out value="${student.age}"></c:out></td>
		<td > <a  href="${editStud}${student.id}&name=${student.name}&age=${student.age}" >Edit</a><a href="${delStud}${student.id}">Delete</a> </td>
	 </tr>
</c:forEach>
</table>

<%@include file="/jsp/footer.jsp" %>