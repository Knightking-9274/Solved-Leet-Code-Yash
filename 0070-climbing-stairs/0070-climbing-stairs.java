class Solution {
  
    public int climbStairs(int n) {
          /*
    RECURSIVE APPROACH
    int sum=0;
        
       if(n==1 || n==2 || n==3){
           return n;
       }
      sum= climbStairs(n-1)+climbStairs(n-2); 
       return sum; */
    if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    
    }
}