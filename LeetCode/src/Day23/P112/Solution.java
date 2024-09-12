package Day23.P112;

import java.util.List;

public class Solution {
    public boolean haspath(TreeNode root, int targetSum) {
        if (root.left == null && root.right == null) return targetSum == root.val;
        if (root.left == null) return haspath(root.right, targetSum - root.val);
        if (root.right == null) return haspath(root.left, targetSum - root.val);
        return haspath(root.left, targetSum-root.val)|| haspath(root.right, targetSum-root.val);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        return haspath(root,targetSum);
    }
}
