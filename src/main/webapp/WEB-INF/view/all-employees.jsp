<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>


<html>

<body>

<h2>All employees</h2>
<br>
<br>

<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>LastName</th>
        <th>Department</th>

    </tr>

    <c:forEach var="emp" items="${allEmps}">
        <tr>
        <td>${emp.id}</td>
        <td>${emp.name}</td>
        <td>${emp.lastName}</td>
        <td>${emp.department}</td>
        </tr>
    </c:forEach>

</table>
<br>
<input type="button" value="add"
    onclick="window.location.href = 'addNewEmployee'"/>

</body>

</html>