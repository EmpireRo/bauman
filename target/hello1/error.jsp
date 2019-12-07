<%--
  Created by IntelliJ IDEA.
  User: tiger
  Date: 2019/11/12
  Time: 18:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>error</title>
    <style type="text/css">
        body{
            text-align:center
        }
        .div{
            margin:0 auto;
            width:400px;
            height:100px;
            border:1px solid #F00
        }
    </style>
</head>
<body>
<div><h1><font color="red"><s:property value="exception.message"/></font></h1></div>
</body>
</html>
