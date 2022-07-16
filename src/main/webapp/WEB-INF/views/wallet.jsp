<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

	Wallet Spring!
	<br>
	Visualizza un wallet preciso nella chain!
	<br>
	<form:form action="walletForm" modelAttribute="wallet">
	
		publicKey : <form:input path="publicKey" />

		<input type="submit" value="Submit"/>
	
	</form:form>
	
	<br>
	
	Visualizza un wallet preciso nella chain!
	<br>
	<form:form action="walletGenerator" modelAttribute="wallet">
	
		Seed : <form:input path="seed" />

		<input type="submit" value="Submit"/>
	
	</form:form>


</body>

</html>