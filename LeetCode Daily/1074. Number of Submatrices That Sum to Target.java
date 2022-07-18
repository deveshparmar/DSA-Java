class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int count = 0;
        
        for(int i=0;i<m;i++){
            for(int j=1;j<n;j++){
                matrix[i][j]+=matrix[i][j-1];
            }
        }
        for(int c1=0;c1<n;c1++){
            for(int c2=c1;c2<n;c2++){
                 var hm = new HashMap<Integer,Integer>();
                 hm.put(0,1);
                 int sum = 0;
                 for(int r = 0;r<m;r++){
                     sum+=matrix[r][c2] - (c1>0? matrix[r][c1-1]:0);
                     count+=hm.getOrDefault(sum-target,0);
                     hm.put(sum,hm.getOrDefault(sum,0)+1);
                 }
            }
        }
        return count;
    }
}
