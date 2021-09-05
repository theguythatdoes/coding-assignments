import java.util.*;
public class StringCuts {
    public String[] filter(String[] list, int minLength) {
        ArrayList<String> newList=new ArrayList<String>();
        for(int i=0;i<list.length;i++){
            if(list[i].length()>= minLength && !newList.contains(list[i])){
                newList.add(list[i]);
            }

        }


        return newList.toArray(new String[0]);
    }
}
