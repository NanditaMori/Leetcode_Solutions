class Solution {
    public void moveZeroes(int[] nums) {
        
        for(int l=0,r=0; l<nums.length && r<nums.length ; )
        {
            if(nums[r]==0)
                r++;
            else{
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;

                l++;
                r++;
            }
        }
        
    }
}