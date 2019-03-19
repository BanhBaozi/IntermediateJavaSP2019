import java.util.ArrayList;

public class Generics_Test {

    public static void main(String[] args) {

        Triple<String, Integer, Integer>[] aoTriple = new Triple[5];

        aoTriple[0] = new Triple<> ("Philadelphia Freedoms", 12, 2);
        aoTriple[1] = new Triple<> ("Springfield Lasers", 8, 6);
        aoTriple[2] = new Triple<> ("Washington Kastles", 7, 7);
        aoTriple[3] = new Triple<> ("San Diego Aviators", 7, 7);
        aoTriple[4] = new Triple<> ("Orange County Breakers", 6, 8);



        Pair<String, Double>[] aoPair = new Pair[5];




        //Create a for loop and loop through the Triple array.
        for(int x = 0; x < aoTriple.length; x++) {

            String sTeam = aoTriple[x].getTeam();
            double dWon = aoTriple[x].getWon();
            double dLost = aoTriple[x].getLost();

            //Calculate winning percentage
            double dPctg = (dWon / (dWon + dLost)) * 100;

            aoPair[x] = new Pair<>(sTeam, dPctg);
        }



        //Create a for loop and loop through the Pair Array
        for(int x = 0; x < aoPair.length; x++){
            System.out.println("Team: " + aoPair[x].getTeamName());
            System.out.println("Winning Percentage: " + aoPair[x].getPctg() + "%");
            System.out.println("");
        }



        double dHighestWin = 0.0 ;
        String sHighestWin = "";

        for(int x = 0; x < aoPair.length; x++)
        {

            if(aoPair[x].getPctg() >  dHighestWin)
            {
                dHighestWin = aoPair[x].getPctg();
                sHighestWin = aoPair[x].getTeamName();
            }
        }



        System.out.println("Highest Tennis Team info: " + sHighestWin + ". Winning Percentage: " + dHighestWin + "%");


    }
}
