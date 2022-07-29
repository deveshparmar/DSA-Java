class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String>list = new ArrayList();
        
        for(int i=0;i<words.length;i++){
            if(matches(words[i],pattern))
                list.add(words[i]);
        }
        
        return list;
    }
    
    private boolean matches(String word,String pattern){
        char[] wordToPattern = new char[26];
        char[] patternToWord = new char[26];
        
        for(int i=0;i<word.length();i++){
            char x = word.charAt(i);
            char y = pattern.charAt(i);
            
            if(patternToWord[y-'a']==0)
                patternToWord[y-'a'] = x;
            
            if(wordToPattern[x-'a']==0)
                wordToPattern[x-'a']=y;
            
            if(patternToWord[y-'a']!=x || wordToPattern[x-'a']!=y)
                return false;
        }
        return true;
    }
}
