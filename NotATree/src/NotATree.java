public class NotATree {
    public String check(TreeNode root) {
        if (root == null) {
            return "not a tree";
        }
        if (root.left == null && root.right == null) {
            return "not a tree";
        }

        if(root.left!=null && root.right!=null){
            return "is a tree";
        }
        if (check(root.left) == null || check(root.right) == null) {
            return "not a tree";

        }
        if (check(root.left) != null || check(root.right) != null) {
        return "is a tree";
        }

        return "not a tree";

    }

}
