package Day26.P654;

public class TreeActiton {
    public void treetravel(TreeNode root) {
        if (root == null) return;
        System.out.println(root.val);
        if(root.left!=null)treetravel(root.left);
        if(root.right!=null)treetravel(root.right);
    }
}
