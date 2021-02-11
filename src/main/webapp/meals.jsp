<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html lang="ru">
<head>
    <title>Meal List</title>
</head>
<body>
<h3><a href="index.html">Home</a></h3>
<hr>
<h2>Meals</h2>
<p><a href="editmeal.jsp">Add Meal</a></p>
<table border="1" cellpadding="0" cellspacing="0" width="600">
    <tr height="40">
        <th>Date</th>
        <th>Description</th>
        <th>Calories</th>
        <th colspan=2></th>
    </tr>
    <%--@elvariable id="mealsTo" type="java.util.List"--%>
    <c:forEach var="meal" items="${mealsTo}" varStatus="status">
        <tr style="<c:out value="${meal.excess == true ? 'color:red' : 'color:green'}"/>" height="35">
            <td>
                <fmt:parseDate value="${meal.dateTime}" pattern="yyyy-MM-dd'T'HH:mm" var="parsedDateTime"
                               type="both"/>
                <fmt:formatDate pattern="dd-MM-yyyy HH:mm" value="${ parsedDateTime }"/>
            </td>
            <td>
                    ${meal.description}
            </td>
            <td>
                    ${meal.calories}
            </td>
            <td>
                <a href="meals?action=update&index=${status.getIndex()}"/>Update</a>
            </td>
            <td>
                <a href="meals?action=delete&index=${status.getIndex()}"/>Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>