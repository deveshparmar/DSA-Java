class Solution {
    int[][] memo;
    int mod = 1000000007;
    public int kInversePairs(int n, int k) {
        memo = new int[n+1][k+1];
        
        for(int[] x : memo)
            Arrays.fill(x,-1);
        
        return find(n,k)%mod;
    }
    
    private int find(int n,int k){
        if(n==0)
            return k==0 ? 1:0;
        if(k<0)
            return 0;
        
        if(memo[n][k]!=-1)
            return memo[n][k];
        
        int ans = (find(n-1,k)+find(n,k-1))%mod;
        memo[n][k] = (ans - (k-n >= 0 ? find(n-1, k-n) : 0) + mod) % mod ;
        
        return memo[n][k];
    }
}
