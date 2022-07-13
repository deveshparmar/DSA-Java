class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> b[1]-a[1]);
        int ans=0;
        
        for(int[]box : boxTypes){
            int boxes = box[0];
            int units = box[1];
            
            if(boxes<=truckSize){
                ans+= boxes*units;
                truckSize-= boxes;
            }else{
                ans+= truckSize*units;
                return ans;
            }
        }
        return ans;
    }
}
