class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        var map = new HashMap<String,Integer>();
        
        for(String word:words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        
        int eachWord = words[0].length();
        int totalWord = words.length;
        List<Integer>ans = new ArrayList();
        
        for(int i=0;i<=s.length()-eachWord*totalWord;i++){
            var seen = new HashMap<String,Integer>();
            
            for(int j=0;j<totalWord;j++){
                int idx = i+j*eachWord;
                String word = s.substring(idx,idx+eachWord);
                
                if(!map.containsKey(word))
                    break;
                seen.put(word,seen.getOrDefault(word,0)+1);
                
                if(seen.get(word)>map.getOrDefault(word,0))
                    break;
                
                if(j+1==totalWord)
                    ans.add(i);
            }
        }
        
        return ans;
    }
}
