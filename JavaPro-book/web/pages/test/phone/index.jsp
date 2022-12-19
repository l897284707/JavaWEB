<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>书城首页</title>

	<%-- 静态包含 base标签、css样式、jQuery文件 --%>
	<%@ include file="/pages/common/head.jsp"%>
    <script type="text/javascript">
		$(function(){
		    $("button#btn").click(function(){
		        //获取Jquery对象的指定的属性名称的值
		        var bookId = $(this).attr("bid");
		        location.href = "http://localhost:8081/cartServlet?action=addCartItem&id=" + bookId;
			})
		})
	</script>

</head>
<body>
<div class="book_add">
	<button id="btn" bid="4">加入购物车</button>
</div>
	


	<%--静态包含页脚内容--%>
	<%@include file="/pages/common/footer.jsp"%>

</body>
</html>