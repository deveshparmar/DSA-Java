class NumArray {
    int[]nums;
    int sum=0;
    public NumArray(int[] nums) {
        this.nums = nums;
        int n = nums.length;
        doPrefixSum(nums);
    }
    
    public void update(int index, int val) {
       sum = sum-nums[index]+val;
        nums[index] = val;
    }
    
    public int sumRange(int left, int right) {
        int i=0;
        int temp = sum;
        while(i<left){
            temp-=nums[i];
            i++;
        }
        i= nums.length-1;
        
        while(i>right){
            temp-=nums[i];
            i--;
        }
        return temp;
    }
    
    private void doPrefixSum(int[] nums){
         for(int i=0;i<nums.length;i++)
             sum+=nums[i];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */
