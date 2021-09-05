import java.util.*;
public class Thesaurus {
    public String[] edit(String[] entry) {
        ArrayList<String> initEntry=new ArrayList<String>(Arrays.asList(entry[0].split(" ")));
        TreeSet<String> initEntryo= new TreeSet<String>(initEntry);
        ArrayList<String> a=new ArrayList<>();
        for(int i=1;i<entry.length;i++){
            ArrayList<String> newb=new ArrayList<String>(Arrays.asList(entry[i].split("")));
            TreeSet<String> newbo= new TreeSet<String>(newb);
            initEntryo.retainAll(newbo);
            if(initEntryo.size()<2){
               ArrayList<String>temp=new ArrayList<String>(Arrays.asList(entry[i].split(" ")));
               Collections.sort(temp);
              String p=String.join(" ",temp);
              a.add(p);

            }
            if(initEntryo.size()>=2){
                ArrayList<String>temp=new ArrayList<String>(Arrays.asList(entry[i].split(" ")+" "+entry[0]));
                Collections.sort(temp);
                String p=String.join(" ",temp);
                a.add(p);


            }
            ArrayList<String> temp1=new ArrayList<String>(Arrays.asList(entry[0].split(" ")));
            Collections.sort(temp1);
            String q=String.join(" ",temp1);
            a.add(0,q);





        }
        ArrayList<String> temp1=new ArrayList<String>(Arrays.asList(entry[0].split(" ")));
        Collections.sort(temp1);
        String q=String.join(" ",temp1);
        a.add(0,q);
        Set<String> newEntry=new TreeSet<String>(a);
        return newEntry.toArray(new String[0]);
    }
}
