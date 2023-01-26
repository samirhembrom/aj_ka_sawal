//2379. Minimum Recolors to Get K Consecutive Black Blocks
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min= Integer.MAX_VALUE;
        int curr = 0;
        for ( int i = 0 ; i < blocks.length(); ++i )
        {
            if ( blocks.charAt(i) == 'W') curr += 1;
            if ( i-k >= 0 && blocks.charAt(i-k) == 'W' ) curr -= 1;
            if ( i-k+1 >= 0 ) min = Math.min(min,curr);
        } 
        return min;
    }
}
/*
Time Complexity:  O(n) Linear Time
Space Complexity: O(1) No extra space required
*/