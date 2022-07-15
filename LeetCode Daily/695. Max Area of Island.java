class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans = 0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    ans = Math.max(ans,getMaxArea(i,j,grid));
                }
            }
        }
        return ans;
    }
    
    private int getMaxArea(int i,int j,int[][] grid){
        if(i<0 || j<0 || i>= grid.length || j>=grid[0].length || grid[i][j]<=0)
            return 0;
        
        // marking visisted
        grid[i][j]=-1;
        
        int leftArea = getMaxArea(i,j-1,grid);
        int rightArea = getMaxArea(i,j+1,grid);
        int topArea = getMaxArea(i-1,j,grid);
        int bottomArea = getMaxArea(i+1,j,grid);
        
        int ans = 1 + leftArea + rightArea + bottomArea + topArea;
        
        return ans;
    }
}
