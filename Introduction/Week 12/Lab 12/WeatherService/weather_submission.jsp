<%@ page import="weatherservice.WeatherServiceManager"%>

<html>

<body>

<%
	
	WeatherServiceManager weatherservice = new WeatherServiceManager();
	
	
	
%>

	<a href="weather_entry.jsp">back to entry page</a>
	<br>
	<br>

	<table>
		
		<tr>
			<td>
				City (<%=request.getParameter("city1")%>)
				<%

					
					public float getCurrentTemp(){
						
						return m_oWeather.main.temp;
						
						}
						
					float fCurrentTemp = m_oWeather.main.temp;
						
					public float getHighTemp() {
						
						return m_oWeather.main.temp_max;
						
					}
					
					float fHighTemp = m_oWeather.temp_max;
					
					public float getLowTemp() {
						
						return m_oWeather.main.temp_min;
						
					}
					
					float fLowTemp = m_oWeather.main.temp_min;
					
					
					String sCity1 = request.getParameter("city1");
					
					
					out.println("City: " + sCity1);
					out.println("Current Temp: " + fCurrentTemp);
					out.println("High Temp: " + fHighTemp);
					out.println("Low Temp: " + fLowTemp);
					
					
				%>

			</td>
		</tr>
		
	</table>

</body>

</html>
