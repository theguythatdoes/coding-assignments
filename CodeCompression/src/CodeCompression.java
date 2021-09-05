
import java.util.*;
import java.util.ArrayList;
public class CodeCompression {
    public String compress(String message) {
        ArrayList<String> aList = new ArrayList<String>(Arrays.asList(message.split("")));
        ArrayList<Integer> blist = new ArrayList<Integer>();
        ArrayList<String> clist = new ArrayList<String>();
        HashSet<Integer> h = new HashSet<Integer>();

        for (int i = 0; i < aList.size(); i++) {
            int p = Collections.frequency(aList, aList.get(i));
            String z = aList.get(i) + Integer.toString(p);
            clist.add(z);
            HashSet<String> a=new HashSet<String>(clist);

        String g=String.join("",a);

        return z ;

    }
}

