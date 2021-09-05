import java.util.*;
public class ListEveryK {
    public int sumTheKth(ListNode list, int k) {

        int sum = 0;
        ArrayList<Integer> a = new ArrayList<Integer>();
        if (list == null) {
            return 0;
        }
        while (list != null) {
            a.add(list.info);
            list = list.next;
        }
        if (a.size() % k != 0) {
            for (int i = k-1; i < a.size() -(a.size() % k); i += k) {
                sum = sum + a.get(i);
            }
            return sum;

            }
        if(a.size() % k == 0) {
            for (int j = k-1; j < a.size(); j += k) {
                sum = sum + a.get(j);
            }

        }
        return sum;
        }

    }


