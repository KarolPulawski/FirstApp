<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="default/header.jsp"%>

<h1>Hello leagues</h1>

<table id="table_template">
    <tr>
        <th>Country Id</th>
        <th>COuntry name</th>
    </tr>
    <c:forEach items="${countries}" var="country">
        <tr>
            <td>${country.apiCountryId}</td>
            <td>${country.name}</td>

        </tr>
    </c:forEach>
</table>


<%@include file="default/footer.jsp"%>