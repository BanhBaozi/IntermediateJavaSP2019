import java.security.SecureRandom;
import java.util.Arrays;

public class BinarySearchTest
{

    public static void main(String[] args)
    {

        //instantiate a secure random object
        SecureRandom oRandom = new SecureRandom();

        //create an int array of 100 length
        int[] aiNums = new int[100000000];

        //loop through array and fill with random integers between 0 and 2,000,000,000(integer overflow)
        for(int i = 0; aiNums.length < i; i++ ){

            aiNums[i] = oRandom.nextInt(2000000000);
        }


        //Sort the array using the Arrays object
        Arrays.sort(aiNums);

        int iTargetNum = aiNums[oRandom.nextInt(aiNums.length)];



        //Checks if binary search works
//        int iIndexFound = findNumbersBinarySearch(aiNums, iTargetNum, 0,aiNums.length - 1);
//        System.out.println("Target num index: " + iIndexFound);
//        System.out.println("Number in array at this index: " + aiNums[iIndexFound]);
//        System.out.println("Target number that should equal above: " + iTargetNum);

        int iIndexFound;
        long startTime;
        long elapsedTime;

        /// *** BEGIN Binary Search timing ***
        //System.currentTimeMillis(); //gives you milliseconds since that time to up to this moment
        //System.nanoTime() is more accurate

        startTime = System.nanoTime();
        iIndexFound = findNumbersBinarySearch(aiNums, iTargetNum,0, aiNums.length - 1);
        elapsedTime = System.nanoTime() - startTime;

        System.out.println("Binary search time is : " + elapsedTime);

        /// *** END Binary Search timing *****
        /// **********************************


        /// *** BEGIN Linear Search timing ***
        startTime = System.nanoTime();
        iIndexFound = findNumberLinearSearch(aiNums, iTargetNum);
        elapsedTime = System.nanoTime() - startTime;
        System.out.println("Linear search time is : " + elapsedTime);

        /// *** END Linear Search timing *****
        /// **********************************


    }
    //Recursive binary of target numbers and returns the number index method
    private static int findNumbersBinarySearch(int[] aiNums, int iTarget, int iLow, int iHigh)
    {
        //find the middle index of the range
        int iMiddleIndex = (iHigh + iLow)/2;

        //Check if number at middle index is the target number
        if(aiNums[iMiddleIndex] == iTarget)
        {
            //return middle index
            return iMiddleIndex;
        }

        //Else if target number is greater than number at middle index
        else if(iTarget > aiNums[iMiddleIndex]){
            //Call this method recursively and pass in values for the array that haven't changed
            return findNumbersBinarySearch(aiNums, iTarget, iMiddleIndex + 1, iHigh);
        }
        //Else the target number is less than number at middle index
        else {
            return findNumbersBinarySearch(aiNums,iTarget, iLow, iMiddleIndex - 1);
        }

    }
    //Perform linear search to find index of target number
    private static int findNumberLinearSearch(int[] aiNums, int iTargetNum){

        //create a for loop and look for target num in array
        for(int i = 0; i < aiNums.length; i++)
        {
            if(iTargetNum == aiNums[i])
            {
                //returning index number
                return i;
            }
        }
        return -1;
    }
}
