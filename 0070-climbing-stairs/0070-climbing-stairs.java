class Solution {
    public int climbStairs(int n) {
        int [] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return stairs(n,dp);
    }
    public int stairs(int n , int []dp){
        if(n==1||n==2){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int a = stairs(n-1,dp);
        int b = stairs(n-2,dp);
        dp[n]= a+b;
        return a+b; 
    }
}