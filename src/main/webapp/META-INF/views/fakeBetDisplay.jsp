<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="default/header.jsp"%>

<h2>Teams</h2>

<table id="table_template">
    <tr>
        <th>Sport</th>
        <th>First team</th>
        <th>First score</th>
        <th>Second score</th>
        <th>Second team</th>
    </tr>
    <c:forEach items="${betsDtos}" var="bet">
        <tr>
            <td>${bet.sport}</td>
            <td>${bet.firstTeam}</td>
            <td>${bet.firstPoints}</td>
            <td>${bet.secondPoints}</td>
            <td>${bet.secondTeam}</td>
        </tr>
    </c:forEach>
</table>

<%@include file="default/footer.jsp"%>