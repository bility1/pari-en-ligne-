<%@taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: scien
  Date: 12/02/2019
  Time: 11:43
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title><s:text name="menu"></s:text></title>
</head>
<body>

<p>Menu</p>
<li><s:a action="goMatchsOuvert"><s:text name="connexion.goMatchsOuvert"/></s:a> </li>
<li><s:a action="goMesParis"><s:text name="connexion.goMesParis"/></s:a></li>
<li><s:a action="goLogout"><s:text name="connexion.goLogout"/></s:a></li>

</body>
</html>
