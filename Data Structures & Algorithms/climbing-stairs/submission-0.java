class Solution {

  static int ans(int n, int [] dp){
    if( n <=1)
    return 1;
    if( dp[n] != -1)
    return dp[n];

    return dp[n]=ans(n-1,dp)+ans(n-2,dp);
  }
    public int climbStairs(int n) {
  
       int dp []=new int[n+1];
       Arrays.fill(dp,-1);
       return ans(n, dp);
    }
}
