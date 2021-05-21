<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--@include会将两个页面合二为一--%>
<%@include file="common/header.jsp"%>
<h1>网页主体</h1>
<%@include file="common/footer.jsp"%>

<%--jsp标签
jps：include：拼接页面，本质还是三个
--%>
<jsp:include page="common/header.jsp"/>
<jsp:include page="common/footer.jsp"/>
</body>
</html>
