<!-- @author: Vijayendra Mudigal -->

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<h4 style="letter-spacing:2px;">Scramble with Friends</h4>
<div style="font-size: 13px; letter-spacing: 1px;">"Scramble With Friends" is the fast, fun game of finding words in a
jumbled grid. Quickly slide your finger over adjacent letters to form
words forwards, backwards, sideways... any way you can!
<br />
<br />
To generate the set of possible words, please do fill in the scramble
board with the data you have when you start the game. Just take a
screenshot, pause the game and get this help.
<br />
<br />
</div>
<div class="container-fluid">
	<div class="row-fluid">
		<div class="span6">
			<div id="sample" align="center">
				<img src="<c:url value="/resources/img/swf.jpg"/>" />
			</div>
		</div>
		<div class="span6" align="center">
			<div id="board" style="border: 2px solid grey; padding: 5% 5% 0 5%; max-width:310px;">
				<div class="mainPara"><b>Note:</b> The result would contain words containing maximum of 6
				letters and minimum of 3 letters in the decreasing order of their
				length.</div>
				<c:url var="swf" value="/swf" />
				<form:form id="scrambleForm" method="POST" action="${swf}"
					modelAttribute="swfTO">
					<table>
						<tbody>
							<tr>
								<td><form:input id="i00" type="textarea" maxlength="1"
										path="i00" class="scrambleBox" onkeypress="clearError('i00');"
										autocomplete="off" /></td>
								<td><form:input id="i01" type="textarea" maxlength="1"
										path="i01" class="scrambleBox" onkeypress="clearError('i01');"
										autocomplete="off" /></td>
								<td><form:input id="i02" type="textarea" maxlength="1"
										path="i02" class="scrambleBox" onkeypress="clearError('i02');"
										autocomplete="off" /></td>
								<td><form:input id="i03" type="textarea" maxlength="1"
										path="i03" class="scrambleBox" onkeypress="clearError('i03');"
										autocomplete="off" /></td>
							</tr>
							<tr>
								<td><form:input id="i10" type="textarea" maxlength="1"
										path="i10" class="scrambleBox" onkeypress="clearError('i10');"
										autocomplete="off" /></td>
								<td><form:input id="i11" type="textarea" maxlength="1"
										path="i11" class="scrambleBox" onkeypress="clearError('i11');"
										autocomplete="off" /></td>
								<td><form:input id="i12" type="textarea" maxlength="1"
										path="i12" class="scrambleBox" onkeypress="clearError('i12');"
										autocomplete="off" /></td>
								<td><form:input id="i13" type="textarea" maxlength="1"
										path="i13" class="scrambleBox" onkeypress="clearError('i13');"
										autocomplete="off" /></td>
							</tr>
							<tr>
								<td><form:input id="i20" type="textarea" maxlength="1"
										path="i20" class="scrambleBox" onkeypress="clearError('i20');"
										autocomplete="off" /></td>
								<td><form:input id="i21" type="textarea" maxlength="1"
										path="i21" class="scrambleBox" onkeypress="clearError('i21');"
										autocomplete="off" /></td>
								<td><form:input id="i22" type="textarea" maxlength="1"
										path="i22" class="scrambleBox" onkeypress="clearError('i22');"
										autocomplete="off" /></td>
								<td><form:input id="i23" type="textarea" maxlength="1"
										path="i23" class="scrambleBox" onkeypress="clearError('i23');"
										autocomplete="off" /></td>
							</tr>
							<tr>
								<td><form:input id="i30" type="textarea" maxlength="1"
										path="i30" class="scrambleBox" onkeypress="clearError('i30');"
										autocomplete="off" /></td>
								<td><form:input id="i31" type="textarea" maxlength="1"
										path="i31" class="scrambleBox" onkeypress="clearError('i31');"
										autocomplete="off" /></td>
								<td><form:input id="i32" type="textarea" maxlength="1"
										path="i32" class="scrambleBox" onkeypress="clearError('i32');"
										autocomplete="off" /></td>
								<td><form:input id="i33" type="textarea" maxlength="1"
										path="i33" class="scrambleBox" onkeypress="clearError('i33');"
										autocomplete="off" /></td>
							</tr>
							<tr>
								<td colspan="4"><table width="100%">
										<tr>
											<td id="errorblock" colspan=2 class="error"
												style="width: 70%;" align="left">${error}</td>

											<td align="right" style="padding-top: 5px;"><button
													id="generate" class="btn-small btn-inverse">Generate</button></td>
										</tr>
									</table></td>
							</tr>
						</tbody>
					</table>
				</form:form>
			</div>
		</div>
	</div>
</div>
<script type="text/javascript">
	function clearError(block) {
		document.getElementById('errorblock').innerHTML = '';
		var input = document.getElementById(block);
		input.value = input.value.toUpperCase();
		if (block == 'i00' && document.getElementById('i00').value == "") {
			document.getElementById('i01').focus();
		} else if (block == 'i01' && document.getElementById('i01').value == "") {
			document.getElementById('i02').focus();
		} else if (block == 'i02' && document.getElementById('i02').value == "") {
			document.getElementById('i03').focus();
		} else if (block == 'i03' && document.getElementById('i03').value == "") {
			document.getElementById('i10').focus();
		}

		else if (block == 'i10' && document.getElementById('i10').value == "") {
			document.getElementById('i11').focus();
		} else if (block == 'i11' && document.getElementById('i11').value == "") {
			document.getElementById('i12').focus();
		} else if (block == 'i12' && document.getElementById('i12').value == "") {
			document.getElementById('i13').focus();
		} else if (block == 'i13' && document.getElementById('i13').value == "") {
			document.getElementById('i20').focus();
		}

		else if (block == 'i20' && document.getElementById('i20').value == "") {
			document.getElementById('i21').focus();
		} else if (block == 'i21' && document.getElementById('i21').value == "") {
			document.getElementById('i22').focus();
		} else if (block == 'i22' && document.getElementById('i22').value == "") {
			document.getElementById('i23').focus();
		} else if (block == 'i23' && document.getElementById('i23').value == "") {
			document.getElementById('i30').focus();
		}

		else if (block == 'i30' && document.getElementById('i30').value == "") {
			document.getElementById('i31').focus();
		} else if (block == 'i31' && document.getElementById('i31').value == "") {
			document.getElementById('i32').focus();
		} else if (block == 'i32' && document.getElementById('i32').value == "") {
			document.getElementById('i33').focus();
		} else if (block == 'i33' && document.getElementById('i33').value == "") {
			document.getElementById('generate').focus();
		}
	}
</script>