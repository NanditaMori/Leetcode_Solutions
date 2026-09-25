class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i=0 ; i<s.length() ; i++)
        {
            int value = 'z' - s.charAt(i) + 1;
            sum = sum + (i+1)*value;
        }
        return sum;
    }
}