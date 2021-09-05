
import java.util.*;

public class SortedFreqs {
    public int[] freqs(String[] data) {
        // we are given an array of string and are asked to sort them by frequency
        ArrayList<String>datanew=new ArrayList<String>(Arrays.asList(data));
        // for ease of use , we change the data to and array list
        ArrayList<Integer>datanew1=new ArrayList<Integer>();
        //this arraylist is there just in case we need it

        TreeSet<String> data1=new TreeSet<String>(Arrays.asList(data));
        // a tree set is like a hash set but it also puts things in alphabetical order
        ArrayList<String> data2=new ArrayList<String>(data1);
        //
        int[] numData=new int[data1.size()];
        for(int i=0;i<data2.size();i++){
          datanew1.add( Collections.frequency(datanew,data2.get(i))) ;

        }
        Integer[]a=datanew1.toArray(new Integer[0]);
        int[]b=new int[a.length];
        for(int j=0;j<a.length;j++){
            b[j]=a[j];

        }


     return b;
    }
}
