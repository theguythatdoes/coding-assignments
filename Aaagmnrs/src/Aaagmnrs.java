import java.util.*;
public class Aaagmnrs {
    public String[] anagrams(String[] phrases) {
        ArrayList<String> phrase=new ArrayList<String>(Arrays.asList(phrases));
        ArrayList<String> stores=new ArrayList<>();  //normal
        ArrayList<String> stores2=new ArrayList<>(); //sorted words



        for(int i=0;i<phrase.size();i++){
           String bean= phrase.get(i).replaceAll(" ","");
            char[] tempArray = bean.toLowerCase().toCharArray();
            Arrays.sort(tempArray);
            String sorted=new String(tempArray);
            if(!stores2.contains(sorted)){
                stores2.add(sorted);
                stores.add(phrase.get(i));


            }



        }
        return stores.toArray(new String [0]);
    }

}
