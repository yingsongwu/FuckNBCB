public class NC7maxProfit {

    //暴力排序
    public static int maxProfit (int[] prices) {
        int result = 0;
        for (int i = 0; i < prices.length-1; i++) {
            for (int j = i+1; j < prices.length; j++) {
                int temp = prices[j] - prices[i];
                result = Math.max(temp,result);
            }
        }
        return result;
    }

    public static int maxProfit1 (int[] prices) {
        // write code here
        int len = prices.length;
        // 特殊判断
        if (len < 2) {
            return 0;
        }
        int[][] dp = new int[len][2];

        // dp[i][0] 下标为 i 这天结束的时候，不持股，手上拥有的现金数
        // dp[i][1] 下标为 i 这天结束的时候，持股，手上拥有的现金数

        // 初始化：不持股显然为 0，持股就需要减去第 1 天（下标为 0）的股价
        dp[0][0] = 0;
        dp[0][1] = -prices[0];

        // 从第 2 天开始遍历
        for (int i = 1; i < len; i++) {
            dp[i][0] = Math.max(dp[i - 1][0],   //历史最高利润
                    dp[i - 1][1] + prices[i]);  //今日价格-历史最低买入价
            dp[i][1] = Math.max(dp[i - 1][1],   //历史最低买入价
                    -prices[i]);                //当天买入价
        }
        return dp[len - 1][0];
    }


    public static void main(String[] args) {
        int[] prices = {8,9,2,5,4,7,1};
        System.out.println(maxProfit1(prices));
    }
}
