<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>


<html>

<body>

<h2>Departments</h2>
<br>
<br>

<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
    </tr>

    <c:forEach var="dep" items="${allDepartments}">
        <tr>
        <td>${dep.id}</td>
        <td>${dep.name}</td>
        </tr>
    </c:forEach>


</table>

<input type="button" value="add"
       onclick="window.location.href = 'addNewDepartment'"/>

</body>

</html>