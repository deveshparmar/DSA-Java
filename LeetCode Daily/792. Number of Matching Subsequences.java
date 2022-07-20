class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int n = s.length();
        int ans= 0;
        var hm = new HashMap<Character,Queue<String>>();
        
        for(char c : s.toCharArray())
            hm.putIfAbsent(c,new LinkedList<>());
        
        for(String word : words){
            char c = word.charAt(0);
            if(hm.containsKey(c))
                hm.get(c).offer(word);
        }
        
        for(int i = 0;i<n;i++){
            char c = s.charAt(i);
            Queue<String>q = hm.get(c);
            int len = q.size();
            
            for(int j=0;j<len;j++){
                String str = q.poll();
                if(str.substring(1).length()==0)
                    ans++;
                else{
                    if(hm.containsKey(str.charAt(1)))
                        hm.get(str.charAt(1)).add(str.substring(1));
                }
            }
        }
        
        return ans;
    }
}
