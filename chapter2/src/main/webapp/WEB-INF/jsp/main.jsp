<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>昊的个人页</title>
    </head>
    <body>
        ${user.userName},欢迎，您当前积分是${user.credits};
    </body>
</html>