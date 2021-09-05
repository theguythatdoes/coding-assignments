
import java.util.*;
public class UniqueTreeValues {
    Set<Integer>stores=new TreeSet<Integer>();
    public int[] unique(TreeNode root) {
        ArrayList<Integer>c=new ArrayList<Integer>();
       if(root==null){
           return null;
       }
       recursive(root);

       c.addAll(stores);
        int[] a=new int[c.size()];
        for(int i=0;i<c.size();i++){
            a[i]=c.get(i);

       }

        return a;
    }
    public void recursive (TreeNode root){
        if(root==null){
            return ;
        }
        recursive(root.left);
        stores.add(root.info);
        recursive(root.right);

    }

}
