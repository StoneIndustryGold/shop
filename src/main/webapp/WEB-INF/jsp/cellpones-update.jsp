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
<style type="text/css">
	.field-error{
		color: red;
	}
</style>
</head>
<body>
	更新手机页面
		<form:form action="" method="post" commandName="cellpones">
			<div>  
				<label for="brand">牌子</label>
				<form:input  path="brand" id="brand" value="${cellpones.brand }"/>
				<form:errors path="brand" cssClass="field-error"></form:errors>
			</div>
			<div>
				<label for="model">型号</label>
				<form:input type="text" path="model" id="model" value="${cellpones.model }" />
				<form:errors path="model" cssClass="field-error"></form:errors>
			</div>
			<div>
				<label for="os">系统</label>
				<form:input type="text" path="os" id="os" value="${cellpones.os }"/>
				<form:errors path="os" cssClass="field-error"></form:errors>
			</div>
			<div>
				<label for="cpubrand">平牌</label>
				<form:input type="text" path="cpubrand" id="cpubrand" value="${cellpones.cpubrand }"/>
				<form:errors path="cpubrand" cssClass="field-error"></form:errors>
			</div>
			<div>
				<label for="ram">内存</label>
				<form:input type="text" path="ram" id="ram" value="${cellpones.ram }"/>
				<form:errors path="ram" cssClass="field-error"></form:errors>
			</div>
			<div>
				<label for="color">颜色</label>
				<form:input type="text" path="color" id="color" value="${cellpones.color }"/>
				<form:errors path="color" cssClass="field-error"></form:errors>
			</div>
			<div>
				<label for="description">描述</label>
				<form:input type="text" path="description" id="description" value="${cellpones.description }"/>
				<form:errors path="description" cssClass="field-error"></form:errors>
			</div>
			<div>
				<label for="price">价格</label>
				<form:input type="text" path="price" id="price" value="${cellpones.price }"/>
				<form:errors path="price" cssClass="field-error"></form:errors>
			</div>
			<div>
				<label for="images">图片</label>
				<form:input type="text" path="images" id="images" value="${cellpones.images }"/>
				<form:errors path="images" cssClass="field-error"></form:errors>
			</div>
			<div>
				<button type="submit">提交</button>
			</div>
		</form:form>
</body>
</html>