package com.grossmont.ws;

// Classes for reading web service.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

// Classes for JSON conversion to java objects using Google's gson.
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class WeatherServiceManager{

    private Weather m_oWeather = null;

    private String m_sWeatherJson;



    // Gets the overall weather JSON string from the 3rd party web service.
    public void callWeatherWebService(String sCity){

        String sServiceReturnJson = "";

        try {

            // Call weather API.
            URL url = new URL("http://api.openweathermap.org/data/2.5/weather?q=" + sCity + "&appid=1868f2463a960613c0a78b66a99b5e5f&units=imperial");
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String strTemp = "";
            while (null != (strTemp = br.readLine())) {
                sServiceReturnJson += strTemp;
            }

            // *****************
            // UNCOMMENT THIS if you wish to print out raw json that came back from web service during testing.
            System.out.println("Returned json:");
            System.out.println(sServiceReturnJson);
            // *****************


        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("An error occurred in callWeatherWebService() in WeatherServiceManager: " + ex.toString());
        }

        m_sWeatherJson = sServiceReturnJson;

        // Turn raw json into java object heirarchy using Google's gson.
        convertJsonToJavaObject();
    }




    // Uses Google's gson library to convert json into filled java objects
    // using the java object heirarchy that you already created.
    private void convertJsonToJavaObject(){

        Gson gson = new GsonBuilder().create();

        m_oWeather = gson.fromJson(m_sWeatherJson, Weather.class);
    }


    // This uses Google's gson library for parsing json.
    public float getCurrentTemp(){

        return m_oWeather.main.temp;
    }
    // Add three methods: getCityName,getHighTemp, getLowTemp

    public String getCityname(){
        return m_oWeather.name;
    }
    public float getHightemp(){

        return m_oWeather.main.temp_max;
    }
    public float getLowTemp() {
        return m_oWeather.main.temp_min;
    }

    // ###### END: YOUR CODE HERE ######
    // #################################




    // If you are running this in Tomcat, then this main method
    // can be used when developing if you want to test the functions directly
    // in your IDE to make sure these classes work first before calling from JSP...
    // which is quicker than restarting Tomcat every time
    // you make an adjustment to your class.
    // Also, it's handy to use the System.out.println tool to print out values
    // to the console when testing or use break points and run in debug mode.
    public static void main(String[] args){




        //**********CODE FOR COMPARING 2 CITY'S WEATHER CONDITIONS**********************
        Scanner input = new Scanner(System.in);
        String sCity1 = "";
        String sCity2 = "";
        WeatherServiceManager runCity1 = new WeatherServiceManager();
        WeatherServiceManager runCity2 = new WeatherServiceManager();



        // 2. Get user input two different times to get 2 cities.
        // 3. IMPORTANT: Take any space in the city of user input with %20 (e.g. "san diego, california" becomes "san%20diego,california").
        // 3. Call callWeatherWebService on each WeatherServiceManager instance passing in each city.




        System.out.println("Enter the first city: ");
        sCity1= input.nextLine();
        sCity1 = sCity1.replaceAll(" ","%20");
        runCity1.callWeatherWebService(sCity1);


        System.out.println("Enter the second city: ");
        sCity2 = input.nextLine();
        sCity2 = sCity2.replaceAll(" ","%20");
        runCity2.callWeatherWebService(sCity2);



        if (runCity1.getCurrentTemp() > runCity2.getCurrentTemp()) {

            System.out.println("The city with the highest Temperature is " + runCity1.getCityname() + " which is: " + runCity1.getHightemp() + " degrees F");

        } else {

            System.out.println("The city with the highest Temperature is " + runCity2.getCityname() + " which is:" + runCity2.getHightemp() + " degrees F");
        }

        if (runCity1.getHightemp() - runCity1.getLowTemp() > runCity2.getHightemp() - runCity2.getLowTemp()) {

            System.out.println("The city with the greatest range is : " + runCity1.getCityname() + " with a temperature of " + runCity1.getHightemp() + " degrees F");
        } else {

            System.out.println("The city with the greatest range is : " + runCity2.getCityname() + " with a temperature of " + runCity2.getHightemp() + " degrees F");
        }
    //*******************************CODE FOR COMPARING 2 CITY'S WEATHER CONDITIONS ENDS HERE*********************************

    }






    // ------------------------------------------------------------------------------------------------------------

    // ***********************************
    // *** BEGIN: NOT PART OF THIS LAB ***
    // Only included here just as an example of how the raw json
    // could be parsed directly w/o using 3rd party library like gson.
    public float getTempManualParse(){

        String sTemp = "";
        float fTemp;

        // Parse "temp" out of JSON reply.
        int iTempIndex = m_sWeatherJson.indexOf("\"temp\":") + 7;
        sTemp = m_sWeatherJson.substring(iTempIndex);
        sTemp = sTemp.substring(0, sTemp.indexOf(","));
        fTemp = Float.parseFloat(sTemp);

        return fTemp;
    }
    // *** END: NOT part of lab ***

}
