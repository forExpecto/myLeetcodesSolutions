package Day26.P654;

public class Solution {
    public TreeNode constructMaximumBinaryTree1(int []nums,int begin,int end) {
        if(nums==null || nums.length==0) return null;
        if(begin<=end) return null;
        if(begin+1==end) return new TreeNode(nums[begin]);
        int maxvalueIndex=begin;
        for(int i=begin;i<end;i++) {
            if(nums[i]>nums[maxvalueIndex]) maxvalueIndex=i;
        }
        TreeNode root = new TreeNode(nums[maxvalueIndex]);
        root.left = constructMaximumBinaryTree1(nums,begin,maxvalueIndex);
        root.right = constructMaximumBinaryTree1(nums,maxvalueIndex+1,end);
        return root;
    }


    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTree1(nums,0,nums.length-1);
    }
}
