<%--
  Created by IntelliJ IDEA.
  User: Chris
  Date: 2021/5/21
  Time: 8:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="common/header.jsp"%>
<h1>网页主体</h1>
<%@include file="common/footer.jsp"%>

<%--jsp标签--%>
<jsp:include page="common/header.jsp"/>
<jsp:include page="common/footer.jsp"/>
</body>
</html>
