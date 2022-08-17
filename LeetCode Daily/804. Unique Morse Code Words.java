class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        var map = new HashMap<Character,String>();
        int ans = 0;
        var set = new HashSet<String>();
        map.put('a', ".-");
        map.put('b', "-...");
        map.put('c', "-.-.");
        map.put('d', "-..");
        map.put('e', ".");
        map.put('f', "..-.");
        map.put('g', "--.");
        map.put('h', "....");
        map.put('i', "..");
        map.put('j', ".---");         
        map.put('k', "-.-"); 
        map.put('l', ".-.."); 
        map.put('m', "--"); 
        map.put('n', "-."); 
        map.put('o', "---");
        map.put('p', ".--."); 
        map.put('q', "--.-"); 
        map.put('r', ".-."); 
        map.put('s', "..."); 
        map.put('t', "-");
        map.put('u', "..-");
        map.put('v', "...-"); 
        map.put('w', ".--"); 
        map.put('x', "-..-");
        map.put('y', "-.--"); 
        map.put('z', "--..");
    
        for(String s:words){
            String str = "";
            
            for(char c : s.toCharArray()){
                str+=map.get(c);
            }
            
            if(!set.contains(str)){
                set.add(str);
                ans++;
            }
        }
        return ans;
    }
}
