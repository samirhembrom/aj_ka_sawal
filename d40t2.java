//438. Find All Anagrams in a String
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>  n = new ArrayList<>();
        int[] phash = new int[26];
        int[] hash = new int[26];
        if( s.length() < p.length()) return n;
        for ( int i = 0; i < p.length(); ++i ){
            phash[p.charAt(i)-'a']++;
            hash[s.charAt(i)-'a']++;
        }
        int i;
        for ( i = p.length(); i < s.length(); ++i ){
            int f = 1;
            for ( int j = 0; j < 26; ++j ){
                if( phash[j] != hash[j] ){
                    f = 0;
                    break;
                }
            }
            if ( f == 1 ) n.add(i-p.length());
            hash[s.charAt(i-p.length())-'a']--;
            hash[s.charAt(i)-'a']++;
            
        }
        int f = 1;
        for ( int j = 0; j < 26; ++j ){
                if( phash[j] != hash[j] ){
                    f = 0;
                    break;
                }
            }
        if ( f == 1 ) n.add(i-p.length());
        return n;
    }
}
/*
Time Complexity: O(n*p)) Linear pass and compare 
Space Complexity: O(26) No extra space required
*/