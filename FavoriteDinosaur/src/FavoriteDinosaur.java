
import java.util.*;
public class FavoriteDinosaur {
    public String theBest(String[] dinos) {
        HashMap<String,String> dinomap=new HashMap<String,String>();
        ArrayList<String>dinoList= new ArrayList<String>(Arrays.asList(dinos));
        for (int i=0;i<dinoList.size();i++){
            ArrayList<String>dino1=new ArrayList<String>(Arrays.asList(dinoList.get(i).split(":")));
            dinomap.putIfAbsent(dino1.get(0),dino1.get(1));
            ArrayList<String>t=new ArrayList<String>();
            ArrayList<String>p=new ArrayList<String>();
            t.add(dino1.get(0));
            p.add(dino1.get(0));
            for(int u=0;u<t.size();u++) {
                if (Collections.frequency(t, t.get(u)) > 1) {
                    String z = p.get(u) + t.get(u);
                }

        }
        return z;
    }

}
