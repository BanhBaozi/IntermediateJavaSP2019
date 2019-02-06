import java.util.ArrayList;

public class MinorTest {

    public static void main(String[] args){


        Util oUtil = new Util();

        System.out.println("Hash of 'test': " + oUtil.generateHash("test"));

        ArrayList<String> lstWords = new ArrayList<>();
        lstWords.add("word1");
        lstWords.add("word2");
        lstWords.add("word3");
        lstWords.add("word4");

        String oMerkleRoot = oUtil.getMerkleRoot(lstWords);






    }
}
