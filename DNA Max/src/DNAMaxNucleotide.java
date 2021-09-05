
import java.util.*;
public class DNAMaxNucleotide {
    public String max(String[] strands, String nuc) {
        ArrayList<String> newStrands = new ArrayList<>(Arrays.asList(strands));
        ArrayList<String> newnewStrands = new ArrayList<>();
        String max = "";
        int maxFrequency = 0;
        for (String strand : strands) {
            char[] arr = strand.toCharArray();
            ArrayList<Character> characterList = new ArrayList<>();
            for (char let : arr) {
                characterList.add(let);
            }


            if (maxFrequency < Collections.frequency(characterList, nuc.charAt(0))) {
                maxFrequency = Collections.frequency(characterList, nuc.charAt(0));
                max = strand;


            }
            else if (maxFrequency == Collections.frequency(characterList, nuc.charAt(0))&& maxFrequency!=0) {
                if(max.length()<strand.length()) {
                    max = strand;
                }
            }

        }
        return max;

    }

}





