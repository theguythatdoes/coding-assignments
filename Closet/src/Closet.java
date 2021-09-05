import java.util.*;
public class Closet {
    public String anywhere(String[] list) {
        ArrayList<String> sList= new ArrayList<String>(Arrays.asList(list));
        TreeSet<String> cList=new TreeSet<String>(Arrays.asList(sList.get(0).split(" ")));
        for(int i=0;i<list.length;i++){
            ArrayList<String> stores=new ArrayList<>(Arrays.asList(list[i].split(" ")));
            HashSet<String>OList=new HashSet<String>(stores);
            for(int k=0;k<stores.size();k++){
                cList.add(stores.get(k));

            }




        }
        return String.join(" ",cList) ;
    }
}
