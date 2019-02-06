//Imports required for hash function:
import java.security.SecureRandom;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class Util {

    public String getMerkleRoot(ArrayList<String> lstItems){

        MerkleNode oNode1 = new MerkleNode();
        MerkleNode oNode2 = new MerkleNode();
        MerkleNode oNode3 = new MerkleNode();
        MerkleNode oNode4 = new MerkleNode();

        //Filling in Hash values for leaf nodes
        oNode1.sHash = generateHash(lstItems.get(0));
        oNode2.sHash = generateHash(lstItems.get(1));
        oNode3.sHash = generateHash(lstItems.get(2));
        oNode4.sHash = generateHash(lstItems.get(3));

        MerkleNode oNode5 = new MerkleNode();
        oNode5.oLeft = oNode1;
        oNode5.oRight = oNode2;
        oNode5.sHash = generateHash(oNode5.oLeft.sHash + oNode5.oRight.sHash);

        MerkleNode oNode6 = new MerkleNode();
        oNode6.oLeft = oNode3;
        oNode6.oRight = oNode4;
        oNode6.sHash = generateHash(oNode6.oLeft.sHash + oNode6.oRight.sHash);

        MerkleNode oNode7 = new MerkleNode();
        oNode7.oLeft = oNode5;
        oNode7.oRight = oNode6;
        oNode7.sHash = generateHash(oNode7.oLeft.sHash + oNode7.oRight.sHash);

        return oNode7.sHash;

    }

    public synchronized String generateHash(String sOriginal){

        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] btEncodedhash = digest.digest(
                    sOriginal.getBytes(StandardCharsets.UTF_8));

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < btEncodedhash.length; i++) {
                sb.append(Integer.toString((btEncodedhash[i] & 0xff) + 0x100, 16).substring(1));
            }
            return sb.toString();
        }
        catch(Exception ex){

            System.out.println("Error generating hash: " + ex.getMessage());
            return null;
        }
    }

    public void sleepRandomTime(String sThreadName){

        // Gets random number between 0 and 5 and then adds 3, meaning between 3 and 8 now.
        int iSleepTime = new SecureRandom().nextInt(5) + 3;


        //passes and prints the sleeping time
        System.out.println(sThreadName + " sleeping for " + iSleepTime + " seconds.");
        sleep(iSleepTime);
    }

    private void sleep(int iSeconds){
        try{
            Thread.sleep(iSeconds * 1000);
        }
        catch(Exception ex){

        }
    }
}
