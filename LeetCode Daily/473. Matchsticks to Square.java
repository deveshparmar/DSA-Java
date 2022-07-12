class Solution {
    public boolean makesquare(int[] matchsticks) {
        int n = matchsticks.length;
        int sum = 0;
        
        // calculating perimeter of square 
        for(int num : matchsticks){
            sum+=num;
        }
        // checking if it is not multiple of 4
        if(sum%4!=0)
            return false;
        
        int side = sum/4;
        int[] sides = new int[]{side,side,side,side};
        
        Arrays.sort(matchsticks);
        return checkSquare(matchsticks,matchsticks.length-1,sides);
    }
    
    public boolean checkSquare(int[] matchsticks,int i,int[] sides){
        if(i==-1){
            return allZeros(sides);
        }
        for(int j=0;j<sides.length;j++){
            if(matchsticks[i]<=sides[j]){
                sides[j]-=matchsticks[i];
            if(checkSquare(matchsticks,i-1,sides))
                return true;
            sides[j]+=matchsticks[i]; 
            }
        }
               return false;
    }
    public boolean allZeros(int[]sides){
        for(int i=0;i<sides.length;i++){
            if(sides[i]>0){
                return false;
            }
        }
        return true;
    }
}
