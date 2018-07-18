<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	手机详情页
	<div>
		<ul>
			
			<li><img  src="${contextPath}/assets/images/cellpone/${cellpones.images}"> </li>
			<li>${cellpones.brand }</li>
			<li>${cellpones.model }</li>
			<li>${cellpones.os }</li>
			<li>${cellpones.cpubrand }</li>
			<li>${cellpones.ram }</li>
			<li>${cellpones.color }</li>
			<li>${cellpones.description }</li>
			<li>${cellpones.price }</li>
					
		</ul>
	</div>
</body>
</html>