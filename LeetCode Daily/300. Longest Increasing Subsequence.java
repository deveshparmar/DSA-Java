class Solution {
    public int lengthOfLIS(int[] nums) {
        TreeSet<Integer>bst = new TreeSet(); 
        for(int num: nums){
            Integer x = bst.ceiling(num);
            if(x==null)
                bst.add(num);
            else{
                bst.remove(x);
                bst.add(num);
            }
        }
        return bst.size();
    }  
}
