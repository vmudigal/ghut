<!-- @author: Vijayendra Mudigal -->

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
	int count = 0;
%>
<c:if test="${size == 0 }">
	<h4>Oooops!!</h4> No valid words found from the Words board!! <a
		href="<c:url value="/wwf" />">RETRY?</a>
</c:if>
<c:if test="${size > 0 }">
	<h5 style="letter-spacing: 2px;">Whoooo !! You got the result. [
		${size} words in ${time} Millis ]</h5>
	<c:if test="${words7s > 0 }">
		<h5 style="letter-spacing: 3px; padding-top: 15px;">7 Letter
			Words { ${words7s} }</h5>
		<table class="table table-striped">
			<tr>
				<c:forEach items="${words7}" var="word">
					<td style="text-align: center;">${word}</td>
					<%
						if (count++ == 5) {
										count = 0;
					%>
				
			</tr>
			<tr>
				<%
					}
				%>
				</c:forEach>
			</tr>
		</table>
	</c:if>

	<%
		count = 0;
	%>

	<c:if test="${words6s > 0 }">
		<h5 style="letter-spacing: 3px; padding-top: 15px;">6 Letter
			Words { ${words6s} }</h5>
		<table class="table table-striped">
			<tr>
				<c:forEach items="${words6}" var="word">
					<td style="text-align: center;">${word}</td>
					<%
						if (count++ == 5) {
										count = 0;
					%>
				
			</tr>
			<tr>
				<%
					}
				%>
				</c:forEach>
			</tr>
		</table>
	</c:if>

	<%
		count = 0;
	%>

	<c:if test="${words5s > 0 }">
		<h5 style="letter-spacing: 3px; padding-top: 15px;">5 Letter
			Words { ${words5s} }</h5>
		<table class="table table-striped">
			<tr>
				<c:forEach items="${words5}" var="word">
					<td style="text-align: center;">${word}</td>
					<%
						if (count++ == 5) {
										count = 0;
					%>
				
			</tr>
			<tr>
				<%
					}
				%>
				</c:forEach>
			</tr>
		</table>
	</c:if>

	<%
		count = 0;
	%>

	<c:if test="${words4s > 0 }">
		<h5 style="letter-spacing: 3px; padding-top: 15px;">4 Letter
			Words { ${words4s} }</h5>
		<table class="table table-striped">
			<tr>
				<c:forEach items="${words4}" var="word">
					<td style="text-align: center;">${word}</td>
					<%
						if (count++ == 5) {
										count = 0;
					%>
				
			</tr>
			<tr>
				<%
					}
				%>
				</c:forEach>
			</tr>
		</table>
	</c:if>

	<%
		count = 0;
	%>

	<c:if test="${words3s > 0 }">
		<h5 style="letter-spacing: 3px; padding-top: 15px;">3 Letter
			Words { ${words3s} }</h5>
		<table class="table table-striped">
			<tr>
				<c:forEach items="${words3}" var="word">
					<td style="text-align: center;">${word}</td>
					<%
						if (count++ == 5) {
										count = 0;
					%>
				
			</tr>
			<tr>
				<%
					}
				%>
				</c:forEach>
			</tr>
		</table>
	</c:if>
</c:if>