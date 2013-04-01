<!-- @author: Vijayendra Mudigal -->

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<a class="brand" href="<c:url value="/" />">{ G.H.U.T }</a>
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