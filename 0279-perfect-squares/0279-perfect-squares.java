class Solution {
    public int numSquares(int n) {

        /*if(n==0||n==1){
            return n ;
        }
        int smallest = Integer.MAX_VALUE;


        for(int i =1;i*i<=n;i++){

            int temp = numSquares(n-i*i);
            smallest = Math.min(smallest,temp);
        }
        return smallest+1;*/



        /*
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1); 
        return helper(n, dp);
    }

    private int helper(int n, int[] dp) {
        if (n == 0 || n == 1) {
            return n;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        int smallest = Integer.MAX_VALUE;

        for (int i = 1; i * i <= n; i++) {
            int temp = helper(n - i * i, dp);
            smallest = Math.min(smallest, temp);
        }

        dp[n] = smallest + 1;
        return dp[n];
        */

        
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            int min=Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++){
                int rem=i-j*j;
                if(dp[rem]<min){
                    min=dp[rem];
                }
            }
            dp[i]=min+1;
        }
        return dp[n];
    


        
    }
}