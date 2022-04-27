<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<body>

<h2>Add department</h2>
<br>

<form:form action="saveDepartment" modelAttribute="department" >


    Department name <form:input path="name"/>
    <br>


    <input type="submit" value="OK">

</form:form>


</body>

</html>