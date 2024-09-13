package Day32.P108;

class Solution {
    public TreeNode createTree(int []nums,int left,int right){
        if(left>right) return null;
        if(left==right) return new TreeNode(nums[left]);
        int index = (left+right)/2;
        TreeNode root = new TreeNode(nums[index]);
        root.left = createTree(nums,left,index-1);
        root.right = createTree(nums,index+1,right);
        return root;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = createTree(nums,0,nums.length-1);
        return root;
    }
}