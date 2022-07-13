class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] temp = new int[n];
        int ans =0;
        for(int i=0;i<n;i++)temp[i]=1;
        
        for(int i=0;i<n-1;i++){
            if(ratings[i+1]>ratings[i])
                temp[i+1]= temp[i]+1;
        }
        
        for(int i= n-1;i>0;i--){
            if(ratings[i-1]>ratings[i]){
                if(temp[i-1]<=temp[i]){
                    temp[i-1] = temp[i]+1;
                }
            }
               
        }
        for(int i=0;i<n;i++){
            ans+=temp[i];
        }
        
        return ans;
    }
}
