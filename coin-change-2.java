//https://leetcode.com/problems/coin-change-2/
class Solution {
    public int change(int amount, int[] coins) {
        int i,j,n=coins.length;
        int[][] dp=new int[n+1][amount+1];
        int[] dp1=new int[amount+1];
        for(i=0;i<=n;i++){
            for(j=0;j<=amount;j++){
                if(j==0){
                    dp[i][j]=1;
                }
                else if(i==0){
                    dp[i][j]=0;
                }
                else if(coins[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i][j-coins[i-1]]+dp[i-1][j];
                }
            }
        }
        dp1[0]=1;
        for(i=0;i<n;i++){
            for(j=coins[i];j<=amount;j++){
                dp1[j]=dp1[j]+dp1[j-coins[i]];
            }
        }
        for(j=0;j<=amount;j++){
            System.out.print(dp1[j]+" ");
        }
        return dp[n][amount];
    }
}