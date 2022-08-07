class Solution {
    HashMap<String,Long> map = new HashMap();
    int mod = 1000000007;
    public int countVowelPermutation(int n) {
        long ans = 0;
        char[] arr = new char[]{'a','e','i','o','u'};
        
        for(char c: arr){
            ans = (ans+helper(n-1,c))%mod;
        }
        return (int)ans;
    }
    private long helper(int rem, char prev){
        if(rem==0)
            return 1;
        String key = ""+rem+prev;
        long sum = 0; 
        if(map.containsKey(key))
            return map.get(key);
        
        switch(prev){
            case 'a':
                sum = (helper(rem-1,'e'))%mod;
                break;
             
            case 'e':
                sum = (helper(rem-1,'a') + helper(rem-1,'i'))%mod;
                break;
            
            case 'i':
                sum = (helper(rem-1,'a') + helper(rem-1,'e') + helper(rem-1,'o') + helper(rem-1,'u'))%mod;
                break;
            
            case 'o':
                sum = (helper(rem-1,'i') + helper(rem-1,'u'))%mod;
                break;
               
            case 'u':
                sum = (helper(rem-1,'a'))%mod;
                break;
        }
        map.put(key,sum);
        
        return sum;
            
    }
}
