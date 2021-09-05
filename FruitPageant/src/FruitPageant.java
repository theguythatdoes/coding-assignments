
import java.util.*;
public class FruitPageant {
    public String[] theBest(String[] votes) {
        ArrayList<String> a = new ArrayList<String>(Arrays.asList(votes));
        ArrayList<String> w = new ArrayList<String>(Arrays.asList(votes));
        ArrayList<String> p = new ArrayList<String>();
        ArrayList<String> e = new ArrayList<String>();
        ArrayList<String> b = new ArrayList<String>();
        for (String str : w){
            for (String s : str.split(":")) {
                e.add(s);
            }
        }
        int c = Collections.frequency(e, e.get(0));

        for (int i = 0; i < e.size(); i++) {
            if (Collections.frequency(e, e.get(i)) >= c) {
                c = Collections.frequency(e, e.get(i));
            }
        }
        for (int j = 0; j < a.size(); j++) {
            if (Collections.frequency(e, e.get(j)) == c) {
                b.add(e.get(j));
            }
        }
        //Collections.sort(b, Comparator.naturalOrder());
         Set<String>n=new HashSet<String>(b);

        return n.toArray(new String[0]);
    }
}





