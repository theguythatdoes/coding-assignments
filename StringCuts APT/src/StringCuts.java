

import java.util.ArrayList;
import java.util.Arrays;

public class StringCuts {
    public ArrayList<String> filter(String[] list, int minLength) {
        ArrayList<String> newList=new ArrayList<>(Arrays.asList(list));
        ArrayList<String>newnewList =new ArrayList<>();
        for(String k:newList){
            if(newList[k].size()>=minLength){
                newnewList.add(newList[k]);


            }
        }
        // replace this with your code
        return newnewList;
    }
}

