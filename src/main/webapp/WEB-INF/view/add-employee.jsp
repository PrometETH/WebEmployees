<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<body>

<h2>add employee</h2>
<br>

<form:form action="saveEmployee" modelAttribute="employee" >

    First name <form:input path="name"/>
    <br>
    SurName <form:input path="lastName"/>
    <br>


    <input type="submit" value="OK">

</form:form>


</body>

</html>