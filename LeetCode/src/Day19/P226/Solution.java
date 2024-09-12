package Day19.P226;

public class Solution {
    public void swap(TreeNode root,TreeNode left, TreeNode right) {
        if (root == null) return;
        else if (root.left == null && root.right == null) return;
        else if (root.left == null&&root.right != null) {
            root.left=root.right;
            root.right=null;
        }else if (root.right == null&&root.left != null) {
            root.left=root.right;
            root.right=null;
        }else if (left != null && right != null) {
            TreeNode temp = left.right;
            root.right = right.left;
            right.left = temp;
        }

    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        swap(root,root.left, root.right);
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
