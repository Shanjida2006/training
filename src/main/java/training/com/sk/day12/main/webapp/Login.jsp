<html>
<body>
	<form action="../Login" method="POST">
		<table>
			<tr>
				<td>Username : <input type="text" name="username" />
				</td>
			</tr>
			<tr>
				<td>Password : <input type="password" name="password" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Login" /></td>
			</tr>
		</table>
	</form>
	<% 
	   out.println("Password suggestion: ");
	   out.println("<BR>You can use upercase, lowercase, spcial characters and  numbers."); 
	   out.println("<BR>Date: ");
	%>
	<%=new java.util.Date() %>
</body>
</html>