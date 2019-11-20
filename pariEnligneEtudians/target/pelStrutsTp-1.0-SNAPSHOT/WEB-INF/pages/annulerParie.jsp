<%@taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: scien
  Date: 01/03/2019
  Time: 00:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><s:text name="connexion.annulerParie"></s:text></title>
</head>
<body>
    <ul>
        Utilisateur: <s:property value="utilisateur.login"></s:property> </br>
        Vous venez d'annuler votre pari sur la mise de
        <s:property value="mise"/> Euro sur
        <s:property value="vainqueur"/> </br>
        Merci de consulter la liste de vos paris !!!
    </ul>
    <s:a action="menu"><s:text name="menu.retour"/></s:a>
</body>
</html>
