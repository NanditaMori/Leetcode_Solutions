class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int n = x;
        int sum = 0;

        while(n!=0)
        {
            int rem = n % 10;
            sum = sum*10 + rem;
            n = n/10;
        }
        if(x==sum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}