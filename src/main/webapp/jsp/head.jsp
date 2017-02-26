<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="shortcut icon" href="static/images/logo.png" type="image/png" > 
<link type="text/css" rel="stylesheet" href="static/style/main.css" />
<link type="text/css" rel="stylesheet" href="static/style/home.css" />
<title>${title }</title>
</head>
<body>
<c:url var="home" value="StudentController"/>
<a class="MyButton" href="${home}">Home</a>
<div class="d1">