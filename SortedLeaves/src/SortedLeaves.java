import java.util.*;
public class SortedLeaves {
    public String[] values(TreeNode tree) {
        if (tree == null) {
            return new String[0];
        }
           ArrayList<Integer>integral=HelpMe(tree);
            String[] blue = new String[integral.size()];
            for (int a = 0; a < blue.length; a++) {
                int b= integral.get(a);
                char c = (char) b;
                blue[a] = String.valueOf(c);

            }
            Arrays.sort(blue);
            return blue;

        }
    public ArrayList<Integer>HelpMe(TreeNode tree){
        ArrayList<Integer> sett = new ArrayList<>();
        if (tree.left == null && tree.right == null) {
            sett.add(HelpMe(tree.info));
        }
        if (tree.left != null) {
            sett.add(HelpMe(tree.left));

        }
        if (tree.right == null) {
            sett.add(HelpMe(tree.right));
        }
         return sett;
    }
    }




