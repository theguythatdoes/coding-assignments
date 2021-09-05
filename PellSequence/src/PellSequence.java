
import java.util.*;
public class PellSequence {
    public String isPellLike(int[] seq) {
        Integer[] ints = new Integer[seq.length];
        for (int i = 0; i < seq.length; i++) {
            ints[i] = Integer.valueOf(seq[i]);
            // turns a string into an integer so that we can do operations on it
        }
        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(ints));
        // turns our int array of string into an arraylist of Integers
        for (int k = 2; k < a.size(); k++) {
            if (a.get(k).equals(2 * a.get(k - 1) + a.get(k - 2))) {
                /* if the number in the sequence is equal to 2 times the number before it + the number
                befor that , return yes , otherwise return no.
                .get(k)= allows you to access an element in the arraylist
                .equals()=is a boolean operator that checks to see if one number equals the other

                 */

            }
            return "Yes";

            }
            return "NO";


        }

    }
