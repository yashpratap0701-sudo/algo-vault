class Solution {
    public int maxProfit(int[] prices) {
        int p = 0;
        int sell = 0;

        for (int i = 1; i < prices.length; i++) {
            sell = prices[i] - prices[i - 1];

            if (sell > 0) {
                p += sell;
            }
        }

        return p;
    }
}