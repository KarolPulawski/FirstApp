<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="default/header.jsp"%>

<h1>API connection</h1>

Teams from API FOOTBALL:
<a href="/get-teams" >DISPLAY TEAMS</a></br>

Countries from API FOOTBALL:
<a href="/get-countries" >DISPLAY Coutnries</a></br>

Fake events from my application(localhost:8080):
<a href="/get-onlinebets-test" >DISPLAY fake bets</a></br>


<%@include file="default/footer.jsp"%>