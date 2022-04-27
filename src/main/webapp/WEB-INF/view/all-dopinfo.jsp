<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>


<html>

<body>

<h2>All information bout employees</h2>
<br>
<br>

<table>
    <tr>
        <th>Id</th>
        <th>Salary</th>
        <th>Phone number</th>
        <th>City</th>
        <th>Email</th>
        <th>Employee_id</th>
    </tr>

    <c:forEach var="info" items="${allDopinfo}">

        <tr>
        <td>${info.id}</td>
        <td>${info.salary}</td>
        <td>${info.phoneNumber}</td>
        <td>${info.city}</td>
        <td>${info.email}</td>
        <td>${info.employees.id}</td>
        </tr>
    </c:forEach>
    <br>




</table>
<input type="button" value="add"
       onclick="window.location.href = 'addNewDopinfo'"/>

</body>

</html>