//395. Longest Substring with At Least K Repeating Characters
class Solution {
    public int longestSubstring(String s, int k) {
        int[] arr = new int[26];
        for ( int i = 0; i < s.length(); ++i )
            arr[s.charAt(i)-'a']++;
        int start = 0;
        boolean valid = true;
        int maxLen = Integer.MIN_VALUE;
        for ( int i = 0; i < s.length(); ++i ){
            if( arr[s.charAt(i)-'a'] > 0 && arr[s.charAt(i)-'a'] < k ){
                String sub = s.substring(start,i);
                maxLen = Math.max(maxLen,longestSubstring(sub,k));
                start = i + 1;
                valid = false;
            }
        }
        if ( valid ) return s.length();
        return Math.max(maxLen,longestSubstring(s.substring(start),k));
    }
}
/*
Time Complexity:  O(n^2) Need to generate substring and check them again
Space Complexity: O(n) To store the string
*/