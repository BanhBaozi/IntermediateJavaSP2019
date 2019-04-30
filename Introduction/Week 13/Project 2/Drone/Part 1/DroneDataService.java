package com.dronerecon.ws;

import com.sun.javafx.scene.traversal.Direction;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.security.SecureRandom;


/**
 *
 * @author Jenny Nguyen
 */
public class DroneDataService extends HttpServlet{


    public void doGet(HttpServletRequest request, HttpServletResponse response)


            throws ServletException, IOException {

        response.setContentType("application/json;charset=utf-8");
        response.addHeader("Access-Control-Allow-Origin", "*");

        PrintWriter out = response.getWriter();



        // ##############################
        // 1. Get params passed in.
        String sArea_id = request.getParameter("area_id");
        int iTileX = Integer.parseInt("tilex");
        int iTileY = Integer.parseInt("tiley");
        int iTotalCols = Integer.parseInt("totalcols");
        int iTotalRows = Integer.parseInt("totalrows");





        //2. Default value of beginning direction
        String sDirection = "right";





        // 3. Calculate next drone move.

        if(iTileY % 2 == 0)
        {
            if(iTileX == iTotalCols - 1) {

                iTileY--;
                sDirection = "left";

            }
            else {
                iTileX++;
                sDirection = "right";
            }
        }
        else {
            if(iTileX == 0) {
                iTileY++;
                sDirection = "right";
            }

            else {
                iTileX--;
                sDirection = "left";

            }
        }



        if(iTileY == iTotalRows)
        {
            sDirection = "stop";
        }




        // 4. Format & Return JSON string to caller.
        out.println("{area_id: " + sArea_id +  " " + ",nextTileX: " + iTileX + " " + "nextTileY: " + iTileY + " " + ",direction: " + sDirection + " " + "}");

    }
}

