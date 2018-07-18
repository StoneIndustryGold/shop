<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<html>
	<head>
		
	</head>
	<body>
		<div class="header">
			<ul>
				<li><a href="${contextPath }/Cellpones/list">手机列表</a></li>
				<li><a href="${contextPath }/cellpones/add">手机添加</a></li>
				<li><a href="http://localhost:8080/shop-in/users/list">当前用户</a></li>
			</ul>
		</div>		
		<div class="content">
			<!-- 把t:layout标签的内容插入此处 -->
    		<jsp:doBody />
		</div>		
		<div class="footer">
			版权归石大仙出版社所有
    		
		</div>		
	</body>
</html>

