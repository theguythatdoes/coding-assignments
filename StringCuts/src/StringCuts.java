import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class StringCuts {
    public String[] filter(String[] list, int minLength) {
        ArrayList<String> newList=new ArrayList<>(Arrays.asList(list)); 
        //we change the list into an array list to do operations on it
        ArrayList<String>newnewList =new ArrayList<String>(); 
        //we make a new arraylist for purposes down the line
        for(String k:newList){
            if(k.length()>=minLength && ! newnewList.contains(k)){ 
                /*if the string in the new list is greater than or equal to the min length 
                and it is not in the newest list, add it to the newest list
                 */
                newnewList.add(k);
                // adding it to the newest list


            }
        }
        HashSet<String> filtered=new HashSet<String>(newnewList); 
        //we are checking for duplicates even though we expect to not have any
        ArrayList<String> blueList=new ArrayList<>(newnewList);
        
        return newnewList.toArray(new String[0]); 
        // this is how you change and array list back to an array 
    }
}
