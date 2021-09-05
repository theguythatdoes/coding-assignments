
import java.util.*;
public class LeafCollector {
    ArrayList<String> b=new ArrayList<String>();
    public String[] getLeaves(TreeNode tree) {
        if(tree==null){
            return new String[0];
        }
        while(!isLeaf(tree)) {
            ArrayList<String> a=new ArrayList<String>();
            collectAndRemove(tree, a);
           String d= String.join(" ",a);
           b.add(d);
        }
        b.add(Integer.toString(tree.info));
       String[] lists=b.toArray(new String[0]);
       return lists;
    }
    public void collectAndRemove(TreeNode root, List<String>list){
        if(root==null){
            return ;
        }
       if(isLeaf(root.left)){
           list.add(Integer.toString(root.left.info));
           root.left=null;

       }
       else{
           collectAndRemove(root.left,list);
       }
       if (isLeaf(root.right)){
           list.add(Integer.toString(root.right.info));
           root.right=null;
       }
       else{
          collectAndRemove (root.right,list);
       }



    }
    public boolean isLeaf(TreeNode twig){
        if(twig==null){
            return false;
        }
        if(twig.left==null && twig.right==null){
            return true;
        }
        else{
            return false;
        }
    }

}
