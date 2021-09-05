 import java.util.HashSet;
  import java.util.Arrays;
 import java.util.Objects;


 public class Starter {
    public int begins(String[] words, String first) {
        HashSet<String> word= new HashSet<>(Arrays.asList(words));
       int t=0;
               for(String a:word){
                   if (a.startsWith(first)){
                       t+=1;
                   }
               }




        return t;
    }
}
