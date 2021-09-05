
import java.util.*;
public class MinNode {
    TreeMap<Integer, String> myMap = new TreeMap<Integer, String>();

    public String locate(TreeNode root) {
        if (root == null) {
            return null;
        }
        doWork(root, "");
        myMap.put(root.info,"");

        return myMap.get(Collections.min(myMap.keySet()));


    }

    public void doWork(TreeNode root, String path) {
        if (root == null) {
            return;
        }
        if(root.left!=null && root.right!=null){
            doWork(root.left,path+"1");
            doWork(root.left,path+"1");
            myMap.put(root.info,path);
        }
        if(root.left==null || root.right==null){
            doWork(root.left,path+"1");
            doWork(root.left,path+"1");
            myMap.put(root.info,path);
        }
        if (root.left == null && root.right == null) {
            myMap.put(root.info, path);
        } else {
            doWork(root.left, path + "0");
            doWork(root.right, path + "1");

        }
    }
}





