package Day1.P704;

class Solution {
    public int search(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while (left<=right){
            int middle=(left+right)/2;
            if(nums[middle]>target){
                right=middle-1;
            }
            if(nums[middle]<target){
                left=middle+1;
            }
            if(nums[middle]==target){
                return middle;
            }
        }
        return -1;
    }
}