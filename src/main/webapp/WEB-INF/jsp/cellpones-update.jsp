<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>   
    <c:set var="title" value="${publishers.id == 0 ? '出版社' : '删除出版社'}"></c:set>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	更新手机页面
		<form action="" method="post">
			<div>
				<label for="brand">牌子</label>
				<input type="text" name="brand" id="brand" value="${cellpones.brand }">
			</div>
			<div>
				<label for="model">型号</label>
				<input type="text" name="model" id="model" value="${cellpones.model }">
			</div>
			<div>
				<label for="os">系统</label>
				<input type="text" name="os" id="os" value="${cellpones.os }">
			</div>
			<div>
				<label for="cpubrand">平牌</label>
				<input type="text" name="cpubrand" id="cpubrand" value="${cellpones.cpubrand }">
			</div>
			<div>
				<label for="ram">内存</label>
				<input type="text" name="ram" id="ram" value="${cellpones.ram }">
			</div>
			<div>
				<label for="color">颜色</label>
				<input type="text" name="color" id="color" value="${cellpones.brand }">
			</div>
			<div>
				<label for="description">描述</label>
				<input type="text" name="description" id="description" value="${cellpones.color }">
			</div>
			<div>
				<label for="price">价格</label>
				<input type="text" name="price" id="price" value="${cellpones.price }">
			</div>
			<div>
				<label for="images">图片</label>
				<input type="text" name="images" id="images" value="${cellpones.images }">
			</div>
			<div>
				<button type="submit">提交</button>
			</div>
		</form>
</body>
</html>