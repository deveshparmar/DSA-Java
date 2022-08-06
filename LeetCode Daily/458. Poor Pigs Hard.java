class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int rate = minutesToTest/minutesToDie;
        
        return ((int) Math.ceil(Math.log(buckets)/Math.log((rate)+1)));
    }
}
