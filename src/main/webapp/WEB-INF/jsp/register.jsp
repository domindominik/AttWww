<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s"  uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

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