class Solution {
    public int[] searchRange(int[] arr, int target) {
       int[] ans={-1,-1};
       var idx1 = search(arr,target,true); 
       var idx2 = search(arr,target,false);
       ans[0] = idx1;
       ans[1] = idx2;
        
        return ans;
    }
    private int search(int[] arr, int target,boolean idx){
        var l = 0;
        var ans=-1;
        var h = arr.length-1;
        int mid;
        
        while(l<=h){
            mid = (l+h)/2;
            
            if(arr[mid]>target)
                h = mid-1;
            
            else if(arr[mid]<target)
                l = mid+1;
            
            else{
                    ans = mid;
                    if(idx)
                        h = mid-1;
                    else
                        l = mid+1;
            }
        }
        return ans;
    }
}
