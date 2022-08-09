class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        if(arr.length==0 || arr==null)
            return 0;
        Arrays.sort(arr);
        var map = new HashMap<Integer,Long>();
        long ans = 0l;
        
        for(int i=0;i<arr.length;i++){
             long count = 1l;
            for(int j=0;j<i;j++){
                if(arr[i]%arr[j]==0 && map.containsKey(arr[i]/arr[j])){
                    count+=map.get(arr[j])*map.get(arr[i]/arr[j]);
                }
            }
            map.put(arr[i],count);
        }
        
        for(Map.Entry<Integer,Long> entry: map.entrySet()){
            ans += entry.getValue();
        }
        
        return (int)(ans % (1000000000 + 7));
    }
}
