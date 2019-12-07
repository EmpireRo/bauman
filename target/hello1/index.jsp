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
    <title>index</title>
</head>
<body>

<table>
    <tr>
        <td>
            <h1>ADD</h1>
            <s:form action="op_add" namespace="/" method="post">
                <s:textfield label="name" name="u_name"/>
                <s:textfield label="job" name="u_job"/>
                <s:submit value="submit"/>
            </s:form>
        </td>
        <td>
            <h1>DELETE</h1>

            <s:form action="op_delete" namespace="/" method="post">
                <s:textfield label="name" name="u_name"/>
                <s:submit value="submit"/>
            </s:form>
        </td>
        <td>
            <h1>UPDATE</h1>
            <s:form action="op_update" namespace="/" method="post">
                <s:textfield label="name" name="u_name"/>
                <s:textfield label="job" name="u_job"/>
                <s:submit value="submit"/>
            </s:form>
        </td>
        <td>
            <h1>SELECT</h1>

            <s:form action="op_select" namespace="/" method="post">
                <s:textfield label="name" name="u_name"/>
                <s:submit value="submit"/>
            </s:form>
        </td>
    </tr>
</table>

</body>
</html>
