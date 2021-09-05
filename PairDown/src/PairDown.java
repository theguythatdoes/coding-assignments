import java.util.*;
public class PairDown {
    public int[] fold(int[] list) {

        ArrayList<Integer> sumList = new ArrayList<>();
        if (list.length % 2 == 0) {
            for (int k = 0; k < list.length; k += 2) {
                sumList.add(list[k] + list[k + 1]);
            }

        }
        if (list.length % 2 == 1) {
            for (int p = 0; p < list.length-1; p += 2) {
                sumList.add(list[p] + list[p + 1]);

            }
            sumList.add(list[list.length - 1]);

        }
         int[] list1 = sumList.stream().mapToInt(Integer::intValue).toArray();;
    return list1;
    }

}
