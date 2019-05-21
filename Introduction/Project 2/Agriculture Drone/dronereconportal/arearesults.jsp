<%@ page import="com.dronerecon.ws.AreaGridTile"%>
<%@ page import="com.dronerecon.ws.DBManager" %>
<%@ page import="java.util.ArrayList" %>

<html>
	<form>
		<table>
		

<%
	String sAreaID = request.getParameter("area_id");
	
	DBManager oDBManager = new DBManager();
	
	oDBManager.DBLocation = System.getProperty("catalina.base") + "\\webapps\\dronereconportal\\db\\" + oDBManager.DBLocation;
	
	oDBManager.readAreaGridTiles(request.getParameter("area_id"));
	
	ArrayList<AreaGridTile> areaTiles = new ArrayList<>();
	

	
	
%>	

<% 
	//loop
	
	int r_xHigh = 0;
	int r_yHigh = 0;
	int tempMaxr = 0;

	for(int counter1 = 0; counter1 < areaTiles.size(); counter1++) {
		
		if (areaTiles.get(counter).r > tempMaxr ){
			r_xHigh = areaTiles.x;
			r_yHigh = areaTiles.y;
			}
			
		}
	
	out.println("The highest r values are x:" + r_xHigh + " y:" + r_yHigh);
%>

<%	

	int g_xHigh = 0;
	int g_yHigh = 0;
	int tempMaxg = 0;
	
	for(int counter2 = 0; counter2 < areaTiles.size(); counter2++) {
		
		if (areaTiles.get(counter).g > tempMaxg ){
			g_xHigh = areaTiles.x;
			g_yHigh = areaTiles.y;
			}
			
		}
	
	out.println("The highest g values are x:" + g_xHigh + " y:" + g_yHigh);
	
	
%>

		</table>
	</form>
</html>

	
	
