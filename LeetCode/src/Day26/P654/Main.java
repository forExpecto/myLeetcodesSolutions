package Day26.P654;

public class Main {
    public static void main(String[] args) {
        int[] nums=new int[]{3,2,1,6,0,5};
        Solution s=new Solution();
        TreeActiton t=new TreeActiton();
        t.treetravel(s.constructMaximumBinaryTree(nums));
    }
}
