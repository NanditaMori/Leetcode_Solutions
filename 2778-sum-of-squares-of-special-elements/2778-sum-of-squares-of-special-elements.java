class Solution {
    public int sumOfSquares(int[] nums) {
        int length = nums.length;
        int ans = 0;
        for(int i=0 ; i<length ; i++)
        {
            if(length % (i+1) == 0)
            {
                ans += nums[i]*nums[i];
            }
        }
        return ans;
    }
}