<%@taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: scien
  Date: 14/02/2019
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><s:text name="connexion.goMatchsOuverts"></s:text></title>
</head>
<body>
<ul>
    Utilisateur: <h1><s:property value="utilisateur.login"/> </h1>

    <s:iterator value="%{listeMatchsOuverts}" var="match">
        <s:url var="url" action="parie">
            <s:param name="idMatch" value="#match.idMatch"/>
        </s:url>
            <li>Sport : <s:property value="#match.sport"/>
                <s:property value="equipe1"/> vs <s:property value="equipe2"/>
                <s:a href="%{url}">Parier</s:a>
            </li>

    </s:iterator>
</ul>
    <s:a action="menu"><s:text name="menu.retour"/></s:a>
</body>
</html>
