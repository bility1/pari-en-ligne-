<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: scien
  Date: 12/02/2019
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><s:text name="accueil.connexion"></s:text></title>
</head>
<body>
<s:form action="connexion">
    <s:textfield name="login" key="connexion.login"></s:textfield>
    <s:password name="mdp" key="connexion.mdp"></s:password>
    <s:submit></s:submit>
</s:form>

<s:a action="accueil"></s:a>
</body>
</html>
