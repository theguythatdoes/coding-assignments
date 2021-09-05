 import java.util.HashSet;
import java.util.Arrays;
public class SandwichBar {
    public int whichOrder(String[] available, String[] orders) {
        for (int k = 0; k < orders.length; k++) {
            if (canMake(orders[k], available)) {
                return k;
            }

        }
      return -1;
    }


    public boolean canMake(String order, String[] available) {
        String[] oArray = order.split(" ");
        HashSet<String> oSet = new HashSet<String>(Arrays.asList(oArray));
        HashSet<String> aSet = new HashSet<String>(Arrays.asList(available));
        for(String ingredient:oSet){
            if(!aSet.contains(ingredient)){
                return false;

            }
        }
        return true;
    }

}