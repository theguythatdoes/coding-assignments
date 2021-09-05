import java.util.*;
public class GraphWanderer {
    public int pathLength(String[] connections, int start){
        int counts=0;
        int p=0;
        ArrayList<String> connects=new ArrayList<String>(Arrays.asList(connections));
        ArrayList<String> b=new ArrayList<String>();
        for(int i=0;i<connects.size();i++){
            if(connects.get(i).length()>1){
                counts++;
            }


        }


        return counts;
    }


}
