<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
   <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>百度</title>
<link rel="stylesheet" href="css/common.css"/>
<script src="/js/jquery-1.8.3.min.js"></script>
<style>#wimoban_p,#wimoban_p a{color:#fff; font-family:"微软雅黑";}
#wimoban_p{text-align:center; font-size:14px; clear:both;}
</style>
  </head>
 <body oncontextmenu='return false' ondragstart='return false'>
<div id="wrapper">
	<div class="skinBg" style="background-image: url('images/65.jpg');"></div>
	<header id="header">
		<div class="weather fl">
			<span class="cityW">
				<span>合肥：</span>
				<span>
					<span class="weatherIcon wI1"></span>
					<span>23 ~ 31℃</span>
				</span>
			</span>
			<span class="sp">|</span>
			<span class="pollution">
				<span>空气质量：83</span>
				<span class="polutionLevel">良</span>
			</span>
			<div class="cityWeather">
				
			</div>
		</div>
		<nav class="headNavs fr tr">
			<a href="#"><span class="s-icon s-icon-treasure"></span><span>宝箱</span></a>
			<a href="#"><span class="s-icon s-icon-skin"></span><span>换肤</span></a>
			<a href="#"><span class="s-icon s-icon-msg"></span><span>消息</span></a>
			<a><span class="s-icon s-icon-line"></span></a>
			<a href="#"><span>设为首页</span></a>
			<div class="topMenus dn">
				<span class="arrowTop"></span>
				<a href="#">个人中心</a>
				<a href="#">帐号设置</a>
				<a href="#">搜索设置</a>
				<a href="#">意见反馈</a>
				<a href="#">首页教程</a>
				<a href="#">安全退出</a>
			</div>
		</nav>
	</header>
	<div class="content tc">
		<p class="logo"><img width="270" height="129" src="images/logo_white.png" alt="logo" /></p>
		<nav class="mainNavs">
			<a href="#">新闻</a>
			<a href="#">网页</a>
			<a href="#">贴吧</a>
			<a href="#">知道</a>
			<a href="#">音乐</a>
			<a href="#">图片</a>
			<a href="#">视频</a>
			<a href="#">地图</a>
			<a href="#">百科</a>
			<a href="#">文库</a>
			<a href="#">更多&gt;&gt;</a>
		</nav>
		<div class="searchBox">
			<form action="searchSevelt" method="get">
				<input type="text" class="searchIpt f14" name="wd" maxlength="100" autocomplete="off"/>
				<input type="submit" class="btn cp" value="百度一下" />
			</form>
		</div>
	
	</div>
</div>
<script src="js/jquery.min.js"></script>
<script src="js/jquery.autocomplete.min.js"></script>

<!-- 代码结束 -->
</body>
</html>