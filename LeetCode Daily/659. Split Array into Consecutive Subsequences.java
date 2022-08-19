class Solution {
    public boolean isPossible(int[] nums) {
        var hm = new HashMap<Integer,Integer>();
        var start = new ArrayList<Integer>();
        var end = new ArrayList<Integer>();
        
        for(int num:nums)
            hm.put(num,hm.getOrDefault(num,0)+1);
        
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1])
                continue;
            int x = nums[i];
            int curr = hm.get(x);
            int prev = hm.containsKey(x-1)?hm.get(x-1):0;
            int next = hm.containsKey(x+1)?hm.get(x+1):0;
            
            for(int j=0;j<curr-prev;j++)
                start.add(x);
            
            for(int j=0;j<curr-next;j++)
                end.add(x);
        }
        
        for(int i=0;i<start.size();i++){
            if(end.get(i)-start.get(i)<2)
                return false;
        }
        
        return true;
    }
}
