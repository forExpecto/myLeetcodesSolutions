package Day24.P106;

public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        TreeNode root=null;
        if(postorder.length==0) return root;
        root.val=postorder[postorder.length-1];

        return root;
    }
}
