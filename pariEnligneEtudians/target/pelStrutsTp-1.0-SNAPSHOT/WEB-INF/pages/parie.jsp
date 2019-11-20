<%@taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: scien
  Date: 26/02/2019
  Time: 08:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><s:text name="connexion.Parie"></s:text></title>
</head>
<body>
<ul>
    Utilisateur: <s:property value="utilisateur.login"></s:property></br>


        <s:form action="validerPari">
            <s:hidden name="idMatch" value="%{match.idMatch}" key="pari.idMatch"></s:hidden>
            <s:textfield name="mise" key="pari.mise"></s:textfield><mise/>
            <s:select label="vainqueur" name="vainqueur" key="pari.vainqueur"
                      list="{'nul',match.equipe1, match.equipe2}"></s:select>
        <s:submit name="Pariez"></s:submit>

    </s:form>

</ul>
<s:a action="menu"><s:text name="menu.retour"/></s:a>
</body>
</html>
