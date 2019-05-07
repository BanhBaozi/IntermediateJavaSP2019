<%@ page import="moviefan.FavoritesManager"%>

<html>

<body>

<%
	//#####################################################################################
	//###### Your java code here to declare and instantiate FavoritesManager object. ######
	//###### You will be using this variable in the "if" statements lower down.      ######
	
	FavoritesManager favorites = new FavoritesManager();
	
	
	
%>

	<a href="register.jsp">back to Registration page</a>
	<br>
	<br>

	<table>
		<tr>
			<td>
				Welcome, 
				
				<%//#################################################################
				  //###### Your java code here to combine first with last name.######
				  //###### Don't forget to put a space between first and last. ######
				  //###### I've given you the first part of the line...        ######
				  //###### (in other words, replace the three periods)         ######%>
				  
				
				<%= request.getParameter("firstname") + " " + request.getParameter("lastname") %>
				
			</td>
		</tr>
		<tr>
			<td>
				Your favorite movie (<%=request.getParameter("favoritemovie")%>)
				<%

					//#####################################################
					//###### Your java code here to call movie check ######

					//###step 1: create a String variable and fill it with the
					//request parameter called "movie" ...
					//Reference the last lab for the syntax on accessing the request object 
					//or just look above at how we're grabbing the firstname param.

					//###step 2: create an if statement.
					//Inside the parentheses, not brackets, of the if statement, call
					//the movie method on your external class you've created and instantiated
					//up towards the top of this file
					//You're passing the string you've created above that has the movie value
					//###if statement, only put this line of code:
					//Then do an else statement, and within the brackets, only put this line:
					//This space is just here for you to put the closing curly bracket of the else statement.
					
					String sFaveMovie = request.getParameter("favoritemovie");
					
					if(favorites.equals(sFaveMovie)) {
						%><b>is</b> my favorite movie!<%
					}
					
					else {
					     %>is <b>not</b> my favorite movie.<%

					}
					
					
				%>

			</td>
		</tr>
		<tr>
			<td>
				Your favorite actor (<%=request.getParameter("favoriteactor")%>)
				<%

					//#####################################################
					//###### Your java code here to call actor check ######

					//### For this section, follow the steps up above again, only you're
					//substituting actor now instead of movie.
					
					
					String sFaveActor = request.getParameter("favoriteactor");
					
					if(favorites.equals(sFaveActor)) {
						
						%><b>is</b> my favorite actor!<%
					}
					
					else {
					     %>is <b>not</b> my favorite actor.<%

					}
					
				%>

			</td>
		</tr>
	</table>

</body>

</html>
