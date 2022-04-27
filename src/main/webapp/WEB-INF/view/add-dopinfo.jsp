<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<body>


<h2>Add Dopinfo</h2>

<form:form action="saveDopinfo" modelAttribute="dopinfo">

    Salary <form:input path="salary"/>
    <br>
    Phone number <form:input path="phoneNumber"/>
    <br>
    City <form:input path="city"/>
    <br>
    Email <form:input path="email"/>
    <br>
    <input type="submit" value="OK">

</form:form>

</body>

</html>