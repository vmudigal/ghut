<!-- @author: Vijayendra Mudigal -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="google-site-verification"
	content="Or4F6jMp0KKxTYdnDGgi21GhUPvnL7ivzaVPR4EKjjU" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:insertAttribute name="title" ignore="true" /></title>
<!-- CSS Includes -->
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/docs.css" />" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/main.css" />" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/bootstrap.min.css" />" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/bootstrap-responsive.min.css" />" />
<link rel="shortcut icon"
	href="<c:url value="/resources/img/favicon.ico" />" />
</head>
<body style="font-family: Roboto">
	<!-- header -->
	<div class="navbar navbar-fixed-top">
		<div class="fill">
			<div class="container">
				<tiles:insertAttribute name="header" />
			</div>
		</div>
	</div>
	<!-- /header -->
	<div class="subhead">
		<div class="container">
			<div class="container-fluid">
				<div class="row-fluid">
					<div class="span2">
						<!-- menu -->
						<div id="menu" align="center">
							<tiles:insertAttribute name="menu" />
						</div>
						<!-- /menu -->
					</div>
					<div class="span8">
						<!-- content -->
						<div id="content">
							<tiles:insertAttribute name="content" />
						</div>
						<!-- /content -->
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- footer -->
	<div class="footer">
		<div class="container">
			<tiles:insertAttribute name="footer" />
		</div>
	</div>
	<!-- /footer -->
	<!-- Java-script Includes-->
	<script
		src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
	<script type="text/javascript"
		src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
	<script>
		(function(i, s, o, g, r, a, m) {
			i['GoogleAnalyticsObject'] = r;
			i[r] = i[r] || function() {
				(i[r].q = i[r].q || []).push(arguments)
			}, i[r].l = 1 * new Date();
			a = s.createElement(o), m = s.getElementsByTagName(o)[0];
			a.async = 1;
			a.src = g;
			m.parentNode.insertBefore(a, m)
		})(window, document, 'script',
				'//www.google-analytics.com/analytics.js', 'ga');

		ga('create', 'UA-39711380-1', 'game-hut.appspot.com');
		ga('send', 'pageview');
	</script>
</body>
</html>
