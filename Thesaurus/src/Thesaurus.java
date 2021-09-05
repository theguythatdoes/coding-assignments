
import java.util.*;
public class Thesaurus {
    public String[] edit(String[] entry) {
        ArrayList<String>d=new ArrayList<String>(Arrays.asList(entry));
        int u=d.size();
        ArrayList<String>newHelper=helper(d);
        int diff=u-newHelper.size();
        d=newHelper;
        while(diff>0){
            u=d.size();
            newHelper=helper(d);
            diff=u-newHelper.size();
            d=newHelper;

        }

        for(int r=0;r<d.size();r++){
            ArrayList<String>y=new ArrayList<String>(Arrays.asList(d.get(r).split(" ")));

            Collections.sort(y);
            d.set(r, String.join( " ",y));
        }

        Collections.sort(d);
        return d.toArray(new String[0]);
    }

    public ArrayList<String> helper(ArrayList<String>entries){
        ArrayList<String>d=new ArrayList<String>();

        for(int i=0;i<entries.size();i++){
            for(int j=i+1;j<entries.size();j++){
                ArrayList<String>a=new ArrayList<String>(Arrays.asList(entries.get(i).split(" ")) );
                ArrayList<String>b=new ArrayList<String>(Arrays.asList(entries.get(j).split(" ")) );
                Set<String>c=new TreeSet<>();
                c.addAll(a);
                c.addAll(b);
                a.retainAll(b);
                if(a.size()>=2){
                    d.add(String.join(" ",c));
                    entries.remove(i);
                    j=j>i ? j-1 : j;//condensed if stamtent
                    entries.remove(j);
                    d.addAll(entries);
                    return d;
                }
            }
        }
        return entries;
    }



    }


