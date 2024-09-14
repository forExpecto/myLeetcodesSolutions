package Day32.P538;

public class Solution {

    int temp;
    public TreeNode convertBST(TreeNode root) {
        if (root == null) return null;
        temp = 0;
        walk(root);
        return root;
    }

    private void walk(TreeNode root){
        if (root == null) return;
        walk(root.right);
        temp += root.val;
        root.val = temp;
        walk(root.left);
    }

}
