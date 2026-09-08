class Solution {
    public int countCommas(int n) {
        int commas = 0;

        for (int i = 1000; i <= n; i *= 1000) {
            commas += n - i + 1;
            
            if (i > n / 1000)
                break;
        }

        return commas;
    }
}