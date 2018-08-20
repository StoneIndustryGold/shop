<#include 'layout.ftl'><#-- 拿到布局要的layout-->

<@layout title="商品集合页面"><#-- 传往布局-->
<#-- <div>
	  <ul>div一样的可以用
		  <#list cellpones as cellpone>
		  	<li>${cellpone.id}</li>
		  </#list>
	  </ul>
  </div> -->	
  	<table>
	    <tr>
		      <th>id是</th>
		      <th>牌子是</th>
		      <th>价钱是</th>
		      <th>图片是</th>		      
	    </tr>
	    <#-- 循环对象    as当作  命名少个s -->
    	<#list cellpones as cellpone>
		      <tr>
		      	<td>${cellpone.id}</td>
		      	<td>
		      		<a href="<@spring.url 
				      	'/cellpones/${cellpone.id}/details'/>">
				      	${cellpone.brand}
			      	</a>
			    </td>
		      	<td>${cellpone.price}</td>
		    	<td>
			    	<a href="<@spring.url
				    	 '/cellpones/${cellpone.id}/details'/>"><#--a标签点击  -->
				    	<img  src="<@spring.url
				    	 '/assets/images/beauty/${cellpone.images }'/>">
			    	 </a>
		    	 </td><#-- 显示图片 -->
		    	 <td>
			      <form action="<@spring.url '/cellpones/${cellpone.id}/detele'/>" method="post">
			      	<button type="submit">删除商品</button>
			      </form>
			      <a href="<@spring.url '/cellpones/${cellpone.id}/update'/>">编辑商品</a><br>
			     </td>
		 
		      </tr>
    	</#list>
  	</table>
</@layout>