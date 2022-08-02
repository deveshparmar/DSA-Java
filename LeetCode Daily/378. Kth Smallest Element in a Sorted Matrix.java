class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int low = matrix[0][0];
        int high = matrix[n-1][n-1];
        
        while(low<high){
            int mid  = low+(high-low)/2;
            int rank= doRank(matrix,mid);
            
            if(rank<k)
               low=mid+1;
            else
                high = mid;
        }
        return low;
    }
    
    private int doRank(int[][] matrix,int target){
        int j = 0;
        int i= matrix.length-1;
        int count=0;
        
        while(j<matrix.length && i>=0){
            if(matrix[i][j]>target)
                i--;
            else{
                count = count+i+1;
                j++;
            }
                
        }
        return count;
    }
}
