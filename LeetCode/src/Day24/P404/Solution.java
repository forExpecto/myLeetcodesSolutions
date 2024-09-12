package Day24.P404;

public class Solution {
    public boolean isLeaf(TreeNode root) {
        if(root.left == null && root.right == null){
            return true;
        }
        return false;
    }

    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null){return 0;}
        if(root.left!=null&&isLeaf(root.left)==true)return root.left.val+sumOfLeftLeaves(root.right);
        return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
    }
}
