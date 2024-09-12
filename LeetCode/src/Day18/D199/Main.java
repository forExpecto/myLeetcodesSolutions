package Day18.D199;

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        root.left = node1;
        root.right = node2;
        TreeNode node3 = new TreeNode(4);
        node1.left = node3;
        TreeNode node4 = new TreeNode(5);
        node1.right = node4;
        TreeNode node5 = new TreeNode(6);
        node2.left = node5;
        TreeNode node6 = new TreeNode(7);
        node2.right = node6;
        TreeNode node7 = new TreeNode(8);
        node3.left = node7;
        Solution solution = new Solution();
        System.out.println(solution.rightSideView(root));

    }
}
