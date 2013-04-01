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
	href="<c:url value="/resources/css/main.css" />" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/docs.css" />" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/bootstrap.css" />" />
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
				<a class="brand" style="color: black" href="<c:url value="/" />">{
					G.H.U.T }</a>
				<div id="fb-root"></div>
				<script>
					(function(d, s, id) {
						var js, fjs = d.getElementsByTagName(s)[0];
						if (d.getElementById(id))
							return;
						js = d.createElement(s);
						js.id = id;
						js.src = "//connect.facebook.net/en_IN/all.js#xfbml=1&appId=145937782247974";
						fjs.parentNode.insertBefore(js, fjs);
					}(document, 'script', 'facebook-jssdk'));
				</script>
				<h2 style="float: right;">
					<!-- Place this tag where you want the +1 button to render. -->
					<div class="g-plusone" data-size="medium"
						data-href="https://game-hut.appspot.com/"></div>

					<!-- Place this tag after the last +1 button tag. -->
					<script type="text/javascript">
						(function() {
							var po = document.createElement('script');
							po.type = 'text/javascript';
							po.async = true;
							po.src = 'https://apis.google.com/js/plusone.js';
							var s = document.getElementsByTagName('script')[0];
							s.parentNode.insertBefore(po, s);
						})();
					</script>
				</h2>
				<h2 style="float: right; margin-right: 10px">
					<div class="fb-like" data-href="https://www.facebook.com/m.ghut"
						data-send="false" data-layout="button_count" data-width="450"
						data-show-faces="true" data-colorscheme="dark"></div>
				</h2>
			</div>
		</div>
	</div>

	<!-- /header -->
	<div class="jumbotron masthead">
		<div class="container">
			<div class="row">
				<div class="span5">
					<h1>GHUT</h1>
				</div>
				<div class="span">
					<p style="margin-top: 20px;">
						{ Game Helper Utility Tools } <br /> Tools that lets you win
						easily
					</p>
				</div>
			</div>
		</div>
	</div>
	<div class="container">
		<div class="marketing">
			<h2 style="margin-bottom: 40px; font-weight: bolder;">Current
				Game Helpers</h2>
			<div class="row-fluid">
				<div class="container">
					<a style="color: #333333;" href="<c:url value="/swf" /> ">
						<div class="span4">
							<img class="marketing-img"
								src="https://lh3.ggpht.com/1RtzlIx0zfsp9nw96jsB5Lt_Z4ZCc7spQlRMV5SbVrcjvlUCzVl_I6tlsBWke-DHi9WN=w124" />
							<h4>Scramble with Friends</h4>
						</div>
					</a> <a style="color: #333333;" href="<c:url value="/wwf" /> ">
						<div class="span4">
							<img class="marketing-img"
								src="https://lh6.ggpht.com/ZfBziaopT1QLPF1Ajf_RkYQns4dHGh2iKK7xo3TN_b7-4I8P2HNC8YFHETDDLLYbgx8o=w124" />
							<h4>Words with Friends</h4>
						</div>
					</a> <a style="color: #333333;" href="<c:url value="/hwf" /> ">
						<div class="span4">
							<img class="marketing-img"
								src="https://lh5.ggpht.com/d1wGiWgLfWRacryVQp1jIBSaEOmiltFbvleNCTROWTBd39z_IOj6ioVGG1qQLhXgXXWP=w124" />
							<h4>Hanging with Friends</h4>
						</div>
					</a>
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
	<!-- <script
		src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script> -->
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