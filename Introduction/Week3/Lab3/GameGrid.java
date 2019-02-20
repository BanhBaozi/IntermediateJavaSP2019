import java.security.SecureRandom;
import java.util.Scanner;

public class GameGrid {



    public void run() {

        Scanner input = new Scanner(System.in);

        int[][] iGameGrid = new int [10][10];


        int iWallChance = 0;
        int iUserRow = 0;
        int iUserCol = 0;
        boolean exitWhen = true;
        String uInput = "";

        while (exitWhen == true) {

            System.out.println("Please make a selection to move down(d) or to the right(r) >>");
            uInput = input.nextLine();

            if(uInput.equals("d")){
                iUserRow++;
            }
            else{
                iUserCol++;
            }

            if(iGameGrid[iUserRow][iUserCol] == 1) {
                System.out.println("You have failed the game grid");
                exitWhen = false;
            }
            else if(iUserRow == 9 || iUserCol == 9) {
                System.out.println("You have won the game grid!!!");
                exitWhen = false;

            }

        }
        //Printing Grid results
        for(int x = 0; x < iGameGrid.length; x++) {

            //prints by looping through columns
            for(int y = 0; y < iGameGrid[0].length; y++) {

                if( x == iUserRow && y == iUserCol) {
                    System.out.print(" X ");
                }
                else{
                    System.out.println(iGameGrid[x][y] + " ");
                }

            }
            System.out.println();
        }

    }

    private static void fillGameGrid(int[][] iGameGrid){
        SecureRandom oRandom = new SecureRandom();
        int iWallChance = 30;
        int iTempNum;

        //loops through rows
        for(int iUserRow = 0; iUserRow < iGameGrid.length; iUserRow++){

            //loops through columns
            for(int iUserCol = 0; iUserCol < iGameGrid[iUserRow].length; iUserCol++){
                iTempNum = oRandom.nextInt(10);

                if(iTempNum < iWallChance){
                    iGameGrid[iUserRow][iUserCol] = 1;
                }

                //else, place a path
                else{
                    iGameGrid[iUserRow][iUserCol] = 0;
                }
                iGameGrid[0][0] = 0;
            }
        }

    }

}
