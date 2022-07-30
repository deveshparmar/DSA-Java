class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String>ans = new ArrayList();
        int[] maxB = new int[26];
        
        for(String b:words2){
            int[] fb = new int[26];
            
            for(char c: b.toCharArray()){
                fb[c-'a']++;
                maxB[c-'a'] = Math.max(maxB[c-'a'],fb[c-'a']);
            }
        }
        
        for(String a:words1){
            int[] fa = new int[26];
            for(char c:a.toCharArray())
                fa[c-'a']++;
                
                if(isSubset(fa,maxB))
                    ans.add(a);
        }
        
        return ans;
        
    }
     private boolean isSubset(int[] fa, int[] maxB){
            for(int i=0;i<fa.length;i++){
                if(fa[i]<maxB[i])
                    return false;
            }
            return true;
        }
}
