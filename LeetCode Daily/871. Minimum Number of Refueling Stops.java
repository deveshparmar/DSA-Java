class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<int[]>q = new PriorityQueue<>((a,b)-> b[1]-a[1]);
        int n = stations.length;
        int ans =0,i=0,distance=startFuel;
        
        while(distance<target){
            while(i<n && distance>=stations[i][0]){
                q.offer(stations[i]);
                i++;
            }
             if(q.isEmpty())return -1;
        
        distance+=q.remove()[1];
            ans++;
        }
         return ans;
    }
}
