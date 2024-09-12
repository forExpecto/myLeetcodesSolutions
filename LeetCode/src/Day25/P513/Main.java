package Day25.P513;

public class Main {
    public static void main(String[] args) {
        Solution_2 solution = new Solution_2();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.right.right = new TreeNode(8);
        root.right.right.right.right = new TreeNode(9);
        System.out.println(solution.findBottomLeftValue(root));
    }
}
