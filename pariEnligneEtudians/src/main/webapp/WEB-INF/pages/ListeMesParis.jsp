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
    <title><s:text name="connexion.goMesParis"></s:text></title>
</head>
<body>
    <ul>
        Utilisateur: <s:property value="utilisateur.login"></s:property>

        <s:iterator value="%{mesParis}" var="pari">
            <s:url var="url" action="annulerPari">
                <s:param name="idPari" value="#pari.idPari"></s:param>
            </s:url>
            <li>
               Sport: <s:property value="#pari.match.sport"></s:property>,
                <s:property value="#pari.match.equipe1"/> vs
                <s:property value="#pari.match.equipe2"/> le
                <s:property value="#pari.match.quand"/> pour une mise de :
                <s:property value="#pari.montant"/> sur
                <s:property value="#pari.vainqueur"/>
                <s:a href="%{url}">Annuler Pari</s:a>
            </li>

        </s:iterator>

    </ul>
<s:a action="menu"><s:text name="menu.retour"/></s:a>
</body>
</html>
