//1876. Substrings of Size Three with Distinct Characters
class Solution {
    public int countGoodSubstrings(String s) {
        HashSet<Character> set = new HashSet<>();
        int res = 0;
        for ( int i = 0; i < s.length() - 2; ++i )
        {
            String sub = s.substring(i,i+3);
            if ( sub.charAt(0) != sub.charAt(1) && sub.charAt(0) != sub.charAt(2) && 
            sub.charAt(1) != sub.charAt(2)) res++;
        }
        return res;
    }
}/*
Time Complexity:  O(n) Linear Time
Space Complexity: O(1) Constant Space
*/