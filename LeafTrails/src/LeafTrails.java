import java.util.*;
public class LeafTrails {
    TreeMap<Integer,String>myMap=new TreeMap<Integer,String>();
    public String[] trails(TreeNode tree) {
        if(tree==null){
            return new String[0];
        }
        doWork(tree,"");
        int i=0;
        String[]a =new String[myMap.keySet().size()];
        for(Integer key :myMap.keySet()){
            a[i]=myMap.get(key);
            i++;
        }

        return a;
    }
  public void doWork(TreeNode tree,String path){
        if(tree==null){
        return;
        }
        if(tree.left==null && tree.right==null){
            myMap.put(tree.info,path);
        }
        else{
            doWork(tree.left,path+"0");
            doWork(tree.right,path+"1");

        }
  }
}
