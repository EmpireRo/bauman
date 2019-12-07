<%--
  Created by IntelliJ IDEA.
  User: tiger
  Date: 2019/11/12
  Time: 19:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>show</title>
</head>
<body>
<%--这一种是将vra  t_pro放入了context中，所以取值的话要加上#--%>
<%--<s:iterator value="t_proList" var="t_pro">
    <s:property value="#t_pro.t_name"/>
    <s:property value="#t_pro.t_job"/><br/>
</s:iterator>--%>
<%--这一种的话就是struts自动将t_proList中的值取出来放入栈中，所以不需要加#--%>
<%--这一种是将vra  t_pro放入了context中，所以取值的话要加上#--%>
<%--<s:iterator value="t_proList" var="t_pro">
    <s:property value="#t_pro.t_name"/>
    <s:property value="#t_pro.t_job"/><br/>
</s:iterator>--%>
<%--这一种的话就是struts自动将t_proList中的值取出来放入栈中，所以不需要加#--%>
<s:iterator value="u_proList">
    <s:property value="u_name"/>
    <s:property value="u_job"/><br>
</s:iterator>
</body>
</html>
