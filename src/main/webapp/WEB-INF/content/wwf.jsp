<!-- @author: Vijayendra Mudigal -->

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<h4 style="letter-spacing: 2px;">Words with Friends</h4>

<div class="mainPara">
	"Words With Friends" challenges you to create words and earn points on
	a virtual game board. Play with your friends either online or offline,
	or request to compete against an anonymous opponent. Either way, the
	person who combines the most letter tiles to make words and earns the
	most points ultimately wins. <br /> <br />
</div>
<div class="container-fluid">
	<div class="row-fluid">
		<div class="span5">
			<div id="sample" align="center">
				<img src="<c:url value="/resources/img/wwf.jpg"/>" />
			</div>
		</div>
		<div class="span7">
			<div class="mainPara" style="margin-bottom: 10px;">
				<b>How-To : </b>Enter the characters found in the "Words with
				Friends" game into the board below. In the example image (left), the
				available characters are Q, E, Y, R, N and E. You can enter maximum
				of 7 characters.<br /> <br /> Advanced options category is
				optional where we can specify words starting from, wording ending
				with, words containing the character in the index etc.<br />
				<br />Example for Index and Character: Say index = 2 and character =
				h and the board characters = a,j,u,g,a,t,h would result as "ghaut",
				"thuja", "ghat", "thug", "aha".
			</div>
			<c:url var="wwf" value="/wwf" />
			<form:form id="wordForm" method="POST" action="${wwf}"
				modelAttribute="wwfTO">
				<table>
					<tbody>
						<tr>
							<td><form:input id="i00" type="textarea" maxlength="1"
									path="i00" class="wordBox" onkeypress="clearError('i00');"
									autocomplete="off" /></td>
							<td><form:input id="i01" type="textarea" maxlength="1"
									path="i01" class="wordBox" onkeypress="clearError('i01');"
									autocomplete="off" /></td>
							<td><form:input id="i02" type="textarea" maxlength="1"
									path="i02" class="wordBox" onkeypress="clearError('i02');"
									autocomplete="off" /></td>
							<td><form:input id="i03" type="textarea" maxlength="1"
									path="i03" class="wordBox" onkeypress="clearError('i03');"
									autocomplete="off" /></td>
							<td><form:input id="i04" type="textarea" maxlength="1"
									path="i04" class="wordBox" onkeypress="clearError('i04');"
									autocomplete="off" /></td>
							<td><form:input id="i05" type="textarea" maxlength="1"
									path="i05" class="wordBox" onkeypress="clearError('i05');"
									autocomplete="off" /></td>
							<td><form:input id="i06" type="textarea" maxlength="1"
									path="i06" class="wordBox" onkeypress="clearError('i06');"
									autocomplete="off" /></td>
						</tr>
					</tbody>
				</table>
				<div id="errorblock" class="error" align="left">${error}</div>
				<div style="margin-top: 10px; font-size: 12px; letter-spacing: 1px;">Advanced
					Options (Optional)</div>
				<table style="margin-top: 5px; width: 100%;">
					<tr>
						<td><form:input type="text" path="startsWith" value=""
								maxlength="6" placeholder="Starts with" style="width: 80%;"
								autocomplete="off" onclick="clearAError('startsWithError'); " /></td>
						<td><form:input type="text" path="endsWith" value=""
								maxlength="6" placeholder="Ends with" style="width: 80%;"
								autocomplete="off" onclick="clearAError('endsWithError');" /></td>
						<td><form:input type="text" path="indexKey" maxlength="1"
								placeholder="Index" style="width: 80%;" value=""
								autocomplete="off" onclick="clearAError('indexKeyError');" /></td>
						<td><form:input type="text" path="indexValue" maxlength="1"
								placeholder="Character" style="width: 80%;" value=""
								autocomplete="off" onclick="clearAError('indexValueError');" /></td>
					</tr>
					<tr>
						<td><form:errors id="startsWithError" path="startsWith"
								class="error" /></td>
						<td><form:errors id="endsWithError" path="endsWith"
								class="error" /></td>
						<td><form:errors id="indexKeyError" path="indexKey"
								class="error" /></td>
						<td><form:errors id="indexValueError" path="indexValue"
								class="error" /></td>
					</tr>
				</table>
				<div align="right">
					<button id="generate" class="btn-small btn-inverse"
						style="margin-top: 5px">Generate</button>
				</div>

			</form:form>

			<script type="text/javascript">
				function clearError(block) {
					document.getElementById('errorblock').innerHTML = '';
					var input = document.getElementById(block);
					input.value = input.value.toUpperCase();
					if (block == 'i00'
							&& document.getElementById('i00').value == "") {
						document.getElementById('i01').focus();
					} else if (block == 'i01'
							&& document.getElementById('i01').value == "") {
						document.getElementById('i02').focus();
					} else if (block == 'i02'
							&& document.getElementById('i02').value == "") {
						document.getElementById('i03').focus();
					} else if (block == 'i03'
							&& document.getElementById('i03').value == "") {
						document.getElementById('i04').focus();
					} else if (block == 'i04'
							&& document.getElementById('i04').value == "") {
						document.getElementById('i05').focus();
					} else if (block == 'i05'
							&& document.getElementById('i05').value == "") {
						document.getElementById('i06').focus();
					}

				}

				function clearAError(id) {
					document.getElementById(id).innerHTML = '';
				}
			</script>
		</div>
	</div>
</div>