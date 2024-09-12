package Day27.P98;

public class Solution {
    TreeNode max=null;
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        boolean left = isValidBST(root.left);

        if (max!=null&&root.val <= max.val) return false;
        max = root;

        boolean right = isValidBST(root.right);
        return left && right;
    }
}
