import java.util.*;
import java.util.Map.Entry;

public class SortByFreqs {
    public String[] sort(String[] data) {
        ArrayList<String> copy = new ArrayList<String>(Arrays.asList(data));
        ArrayList<Integer> copy1 = new ArrayList<Integer>();
        ArrayList<String> copy2 = new ArrayList<String>();
        copy.sort(Comparator.naturalOrder());
        TreeMap<String, Integer> b = new TreeMap<String, Integer>();
        for (int j = 0; j < copy.size(); j++) {
            b.putIfAbsent(copy.get(j), Collections.frequency(copy, copy.get(j)));


        }
        ArrayList<String> p= new ArrayList<String>(b.keySet());
        Comparator<String> c= Comparator.comparingInt(s ->b.get(s));//inside the array creates our own method//
        Collections.sort(p,c.reversed());
        String[] o= p.toArray(new String[0]);
        return null;
       /* ArrayList<Entry<String, Integer>> a = new ArrayList<Entry<String, Integer>>(b.entrySet());
        Collections.sort(a, Collections.reverseOrder(Comparator.comparing(Entry::getValue)));
        for (Entry e : a) {
            copy2.add(e.getKey().toString());
        }
        String[] o = copy2.toArray(new String[0]);

        return o;*/

    }
}