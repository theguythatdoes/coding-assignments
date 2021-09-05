
import java.util.*;



public class AlphaLength {




        public ListNode create(String[] words) {
            ArrayList<String> wordList = new ArrayList<String>(Arrays.asList(words));
            Set<String> wordlist = new TreeSet<String>(wordList);
            String[] wordslen = wordlist.toArray(new String[0]);
            ListNode prev =null;

            for (int k = wordslen.length-1; k>=0; k--) {
                ListNode newList= new ListNode(wordslen[k].length());
               newList.next=prev;
               prev=newList;     // every time we iterate through we make newList move backward;
                // usually you can't use a for loop with linked list but since we know the size we can use
                // a for loop;
            }


            return prev;
        }

}


