
class Solution {
    public int maximumSaleItems(int[][] items, int budget) {

        int n = items.length;

        int[] dp = new int[budget + 1];

        int minPrice = Integer.MAX_VALUE;

        // Step 1: Find the cheapest item
        for (int i = 0; i < n; i++) {
            minPrice = Math.min(minPrice, items[i][1]);
        }

        // Step 2: 0/1 Knapsack
        for (int i = 0; i < n; i++) {

            int factor = items[i][0];
            int price = items[i][1];

            int freeCount = 0;

            // Count free items
            for (int j = 0; j < n; j++) {

                if (i != j && items[j][0] % factor == 0) {
                    freeCount++;
                }
            }

            // First purchase gives purchased + free items
            int benefit = freeCount + 1;

            // Backward iteration for 0/1 Knapsack
            for (int j = budget; j >= price; j--) {

                dp[j] = Math.max(
                    dp[j],
                    dp[j - price] + benefit
                );
            }
        }

        // Step 3: Use remaining budget on cheapest items
        int answer = 0;

        for (int j = 0; j <= budget; j++) {

            int remainingItems = (budget - j) / minPrice;

            answer = Math.max(
                answer,
                dp[j] + remainingItems
            );
        }

        return answer;
    }
}
