public class LevelCount {
    public int count(TreeNode t, int level) {
        if(t==null){
        return 0;
        }
        if(t.left==null &&t.right==null){
            return 1;
        }
        return 1+count(t.left,level)+count(t.right,level);
    }
}
