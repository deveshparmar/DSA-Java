class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        
        for(int i=0;i<col;i++){
            sort(mat,0,i,row,col);
        }
        
        for(int j=1;j<row;j++){
            sort(mat,j,0,row,col);
        }
        
        return mat;
    }
    
    private void sort(int[][]mat, int row,int col,int m,int n){
        int[]val = new int[101];
        int r = row;
        int c = col;
        
        while(r<m && c<n){
            val[mat[r][c]]++;
            r++;
            c++;
        }
        
        r= row;
        c = col;
        
        for(int i=1;i<101;i++){
            if(val[i]>0){
                int count = val[i];
                while(count-->0){
                    mat[r][c] = i;
                    r++;
                    c++;
                }
            }
        }
    }
}
