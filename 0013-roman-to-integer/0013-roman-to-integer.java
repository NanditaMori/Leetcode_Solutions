class Solution {
    public int romanToInt(String s) {
        int []nums = new int[128];
        nums['I'] = 1;
        nums['V'] = 5;
        nums['X'] = 10;
        nums['L'] = 50;
        nums['C'] = 100;
        nums['D'] = 500;
        nums['M'] = 1000;

        int ans = 0;

        for(int i=0 ; i<s.length() ; i++)
        {
            int current = nums[s.charAt(i)];

            if((i+1)<s.length() && current < nums[s.charAt(i+1)])
            {
                ans -= current;
            }
            else{
                ans += current;
            }
        }
        return ans;
    }
}