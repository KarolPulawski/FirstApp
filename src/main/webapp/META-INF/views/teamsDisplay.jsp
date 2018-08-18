<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="default/header.jsp"%>

<h2>Teams</h2>

<table id="table_template">
    <tr>
        <th>Team name</th>
        <th>Overall points</th>
    </tr>
    <c:forEach items="${teams}" var="team">
        <tr>
            <td>${team.team_name}</td>
            <td>${team.overall_league_position}</td>

            <%--<td>--%>
                <%--<form action="/panelEmployee" method="post">--%>
                    <%--<button type="submit" name="employeeId" value="${employee.id}" class="btn-link">Orders</button>--%>
                <%--</form>--%>
            <%--</td>--%>
            <%--<td>--%>
                <%--<form action="/panelEmployeeEdit" method="get">--%>
                    <%--<button type="submit" name="employeeId" value="${employee.id}" class="btn-link">Edit</button>--%>
                <%--</form>--%>
            <%--</td>--%>
            <%--<td>--%>
                <%--<form action="/panelEmployeeDelete" method="post">--%>
                    <%--<button type="submit" name="employeeId" value="${employee.id}" class="btn-link">Delete</button>--%>
                <%--</form>--%>
            <%--</td>--%>
                <%--<td>--%>
                <%--<form action="/userDelete" method="post">--%>
                <%--<button type="submit" name="userId" value="${user.id}" class="btn-link">Delete</button>--%>
                <%--</form>--%>

                <%--</td>--%>
        </tr>
    </c:forEach>
</table>

<%@include file="default/footer.jsp"%>