

import java.util.ArrayList;
import java.util.*;
public class CounterAttack {
    public int[] analyze(String str, String[] words) {
        int[] ret= new int[words.length];
        String [] letterlist=str.split(" ");
        ArrayList<String> letterlist2= new ArrayList<>(Arrays.asList(letterlist));

        for(int k=0;k<words.length;k++){
            ret[k]=Collections.frequency(letterlist2,words[k]);
        }

        return ret;
    }
}
