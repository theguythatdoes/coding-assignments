public class TreeTighten {
    public TreeNode tighten(TreeNode t) {
        if(t==null){
            return null;
        }
        if(t.left==null && t.right==null){
            return t;
        }
        // if it only has a right child
        if(t.left==null && t.right!=null){

            return tighten(t.right);
        }
        // if it only has a left child
        if(t.right==null && t.left!=null){
           return tighten(t.left);
        }

        t.left= tighten(t.left);
       t.right= tighten(t.right);
        return t;
    }

}
