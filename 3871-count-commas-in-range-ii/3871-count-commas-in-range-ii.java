class Solution {
    public long countCommas(long n) {
        long commas = 0;
        long start = 1000;

        while (start <= n) {
            commas += n - start + 1;

            if (start > n / 1000)
                break;

            start *= 1000;
        }

        return commas;
    }
}