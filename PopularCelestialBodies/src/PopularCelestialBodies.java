
import java.util.*;

public class PopularCelestialBodies {
    public String[] superStars(String[] favs){
        ArrayList<String> a=new ArrayList<String>(Arrays.asList(favs[0].split(" ")));
        if(favs.length==1){
            return favs;
        }
        for(int i=1;i<favs.length;i++){
            ArrayList<String> e= new ArrayList<String>(Arrays.asList(favs[i].split(" ")));
            a.retainAll(e);
            Collections.sort(a);
        }
        String[] z= a.toArray(new String[0]);
        return z;
    }
}
