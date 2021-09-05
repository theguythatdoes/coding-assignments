import java.util.*;
public class SetAside {
    public String common(String[] list) {
        ArrayList<String> cleanList = new ArrayList<String>(Arrays.asList(list));
        TreeSet<String> common = new TreeSet<String>(Arrays.asList(cleanList.get(0).split(" ")));
        TreeSet<String> b = new TreeSet<String>();
        ArrayList<String> compList = new ArrayList<>();
        String[] a;
        String p = "";
        for (int k = 1; k < list.length; k++) {
            a = cleanList.get(k).split(" ");
            ArrayList<String> complist = new ArrayList<String>(Arrays.asList(a));
            common.retainAll(complist);


        }
        p = String.join(" ", common);
        // replace this with your code
        return p;//good
    }
}
