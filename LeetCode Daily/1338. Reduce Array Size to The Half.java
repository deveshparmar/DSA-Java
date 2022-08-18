class Solution {
    public int minSetSize(int[] arr) {
        int ans = 0;
        int n = arr.length;
        var map = new HashMap<Integer,Integer>();
        
        for(int i=0;i<n;i++)
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        
        List<Integer>list = new ArrayList(map.values());
        Collections.sort(list,Collections.reverseOrder());
        
        int tot = n;
        int i = 0;
        
        while(tot>n/2){
            tot-=list.get(i);
            i++;
            ans++;
        }
        
        return ans;
    }
}
