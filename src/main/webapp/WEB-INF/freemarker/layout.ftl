<#import "/spring.ftl" as spring />

<#macro css>
</#macro>

<#macro js>
</#macro>

<#macro layout title>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">	
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>${title}</title>
  <@css /><#-- 插入css样式 -->
</head>
<body>
		<div class="header">
			<#--  <ul>
				<li><a href="${contextPath }/Cellpones/list">手机列表</a></li>
				<li><a href="${contextPath }/cellpones/add">手机添加</a></li>
			</ul>
		</div>		-->
		<div class="content">
			
    		<#nested>
		</div>		
		<div class="footer">
			版权归石大仙出版社所有
    		<@js />
		</div>		
</body>

</html>
</#macro>