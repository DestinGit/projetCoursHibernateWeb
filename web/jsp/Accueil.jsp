<%-- 
    Document   : Accueil
    Created on : 19 oct. 2017, 11:44:12
    Author     : formation
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Accueil</title>
    </head>
    <body>
        <h1>Hello World ! - Accueil</h1>
        <c:forEach items="${results}" var="item">
            <h2>${item.cp}</h2>
        </c:forEach>
    </body>
</html>
