class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int[] dp = new int[amount+1];
        
        for(int i = 1; i <= amount; i++){
            if(dp[i] == 0){
                dp[i] = amount + 1;
            }
            for(int j = 0; j < coins.length; j++){
                if(i - coins[j] >= 0){

                    dp[i] = Math.min(dp[i - coins[j]] + 1, dp[i]);
                }       
            }
        }
        
        return dp[amount] > amount ? -1 : dp[amount];
    }
}