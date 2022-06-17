<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: tamyk
  Date: 17.06.2022
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add employee</title>
</head>
<body>

  <h2>Employee info</h2>
  <br>
    <form:form action="saveEmployee" modelAttribute="employee">
        <p>Name <form:input path="name"/></p>
        <p>Surname <form:input path="surname"/></p>
        <p>Department <form:input path="department"/></p>
        <p>Salary <form:input path="salary"/></p>
        <br>
        <input type="submit" value="Ok">

    </form:form>



</body>
</html>
