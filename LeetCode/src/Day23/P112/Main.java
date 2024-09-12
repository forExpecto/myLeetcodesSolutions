package Day23.P112;

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        Solution solution = new Solution();
        System.out.println(solution.hasPathSum(root,1));
    }
}
