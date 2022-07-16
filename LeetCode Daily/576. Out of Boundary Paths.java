class Solution {
    private Long memo[][][] = null;
    private int mod = 1000000007;
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        memo = new Long[m+1][n+1][maxMove+1];
        return (int) findPath(m,n,maxMove,startRow,startColumn);
    }
    
    private long findPath(int m,int n,int maxMove,int row,int column){
        if(maxMove<0)
            return 0;
        
        if(row==m || row<0 || column==n || column<0)
            return 1;
        
        if (memo[row][column][maxMove] != null)
            return memo[row][column][maxMove];
        
        long ans = 0;
        
        long left = findPath(m,n,maxMove-1,row,column-1);
        long right = findPath(m,n,maxMove-1,row,column+1);
        long top = findPath(m,n,maxMove-1,row-1,column);
        long bottom = findPath(m,n,maxMove-1,row+1,column);
        
        ans = (left+right+top+bottom)%mod;
        memo[row][column][maxMove]= ans;
        return ans;
    }
}
