<html>My favorite color is :<%="blue"%></html>
<html>
	<% 
		int x = 1;
		int y = x+x;
	%>
	
	<br /><br />
	The value of y is: <%=y%>
	
	<!-- *******************-->
	<!--This is an HTML method of commenting-->
	
<form>
	
	First Name:<input name ="firstname" type ="text">
	
	Your Age:<input name ="yourage" type ="text">
	
	
	
	<input type ="submit">

</form>

<%

if (request.getParameter("firstname") != null) {
	String userAge = request.getParameter("yourage");
                        out.println("Your first name is: " + request.getParameter("firstname") + " and your age is: " + userAge);
						%>
						<br><br>
						Sandwiching HTML into an "if" statement
						<br>
						This text is hidden until user has submitted the page once since it is located within the "if" statement
						<br>
						Testing, testing...
						<br>
						Close off this section now so that I can add the ending bracket to the "if" statement.
						<br>
						How many times can I end a sentence with these words the "if" statement.
						<br>
						<br>
						<%
					
}
                  

%>

