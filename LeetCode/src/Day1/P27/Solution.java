package Day1.P27;

class Solution {
    public int removeElement(int[] nums, int val) {
        int slowPoint=0;
        for(int fastPoint=0;fastPoint<nums.length;fastPoint++){
            if(nums[fastPoint]!=val){
                nums[slowPoint]=nums[fastPoint];
                slowPoint++;
            }
        }
        return slowPoint;
    }
}