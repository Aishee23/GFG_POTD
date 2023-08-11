class Solution {
    public long count(int coins[], int n, int sum) {
        // code here.
        
        long dp[] = new long[sum+1];
        dp[0] =1;
        
        for(int i=0; i<n ;i++ ) //for every coins
        {
            for(int j=coins[i] ;j<=sum; j++){ // itr in sum
                dp[j] = dp[j] + dp[j-coins[i]];
            }
        }
        
        return dp[sum];
    }
}
