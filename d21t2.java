//338. Counting Bits
class Solution {
    public int[] countBits(int n) {
        int ans[] = new int[n+1];
        ans[0] = 0;
        for ( int i = 1; i <= n; ++i )
        {
            if ( i % 2 != 0 ) ans[i] = 1 + ans[i / 2];
            else ans[i] =  ans[i / 2];
            
        }
        return ans;
    }
}
/*
Time Complexity:  O(n) We were using x/2 = y formula for even we has same set bit
			     whereas we had +1 bit for odd number as odd number has LSB 
			     as set where right shift happens. 
Space Complexity: O(n+1) We store the result of previous numbers
*/