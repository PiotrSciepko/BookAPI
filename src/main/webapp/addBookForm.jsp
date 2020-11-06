<%--
  Created by IntelliJ IDEA.
  User: piotrs
  Date: 06.11.2020
  Time: 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/books">
    <label>
        isbn
        <input name="isbn" type="text">
        <br />
    </label>
    <label>
        title
        <input name="title" type="text">
        <br />
    </label>
    <label>
        author
        <input name="author" type="text">
        <br />
    </label>
    <label>
        publisher
        <input name="publisher" type="text">
        <br />
    </label>
    <label>
        type
        <input name="type" type="text">
        <br />
    </label>
    <label>
        <input  type="submit" value="Zatwierdź">
        <br />
    </label>
</form>
</body>
</html>
