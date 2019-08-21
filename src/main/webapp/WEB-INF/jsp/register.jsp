<%@ page language ="java" conntentType="text/html; charset=UTF-8" pagEncoding="UTF-8"%>
<%@ taglib prefix="s"  uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="/resources/css/style.css" />
        <link rel="stylesheet" type="text/css" href="/resources/css/style.css" />
        <title><s:message code="menu.register"/></title>
    </head>
    <body>
        <div class="container">
        <from:from method ="POST" action="/addUser" modelAttribute="userDto">
        <from:input class="form-control" path="id" hidden="true"/>

        <div class="from-group">
        <from:label path="Name">Name</from:label>
        <from:input class="form-control" path="Name" required="true"/>
        </div>

            <from:button class="" type="submit" value="submit">Submit</from:button>
        </from:form>
        </div>
    </body>
</html>