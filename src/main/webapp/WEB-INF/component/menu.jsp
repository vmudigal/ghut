<!-- @author: Vijayendra Mudigal -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="url" value="${url}" />
<div class="tabbable tabs-left" style="border-right:2px solid black;" >
	<ul class="nav nav-list">
		<li style="margin-bottom: 25px;margin-top: 12px;"><a href="<c:url value="/swf" /> "><img width="80%" style="max-width: 80px;" src="https://lh3.ggpht.com/1RtzlIx0zfsp9nw96jsB5Lt_Z4ZCc7spQlRMV5SbVrcjvlUCzVl_I6tlsBWke-DHi9WN=w124" /><br/>Scramble</a></li>
		<li style="margin-bottom: 25px;margin-top: 12px;"><a href="<c:url value="/wwf" /> "><img width="80%" style="max-width: 80px;" src="https://lh6.ggpht.com/ZfBziaopT1QLPF1Ajf_RkYQns4dHGh2iKK7xo3TN_b7-4I8P2HNC8YFHETDDLLYbgx8o=w124" /><br/>Words</a></li>
	</ul>
</div>