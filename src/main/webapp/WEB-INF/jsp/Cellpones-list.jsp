<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>


<t:layout>

	<h3>手机商城</h3>
										<!-- 取得路劲下的图片，于jsp同级目录下开始                                    限制图片宽                    高度     -->
	<img src="${pageContext.request.contextPath}/assets/images/cellpone/cellpone_01.png"width="190" height="300" align="middle" >
	<div>
		<ul>
			<c:forEach items="${cellpones }" var="cellpones">
				<li>${cellpones.id }</li>
				<li>
				<a href="${contextPath }/cellpones/${cellpones.id }/details">
					<!--图片路径--获得当前的父文件的--同级文件 /下/下/下/${数据库取值文件名}-->
				 <img  src="${contextPath}/assets/images/cellpone/${cellpones.images }"></a></li>
				<li><a href="${contextPath }/cellpones/${cellpones.id }/details">${cellpones.brand }</a>
				
				<form action="${contextPath }/cellpones/${cellpones.id }/detele" method="post">
					<button type="submit">删除商品</button>
				</form>
				</li>			
				<a href="${contextPath }/cellpones/${cellpones.id }/update">编辑商品</a><br>										
			</c:forEach>			
		</ul>
	</div>
	<div>
		<a href="${contextPath }/cellpones/add">添加商品</a>
	</div>
	</t:layout>



