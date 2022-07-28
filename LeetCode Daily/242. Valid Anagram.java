class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length()!=t.length())
           return false;
        
        var temp = new int[26];
        
        for(int i=0;i<s.length();i++){
            var c = s.charAt(i);
            var d = t.charAt(i);
            
            temp[c-'a']++;
            temp[d-'a']--;
        }
        
        for(int i:temp){
            if(i!=0)
                return false;
        }
        return true;
    }
}
