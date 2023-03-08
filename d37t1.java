//1922. Count Good Numbers
class Solution {
    public int countGoodNumbers(long n) {
        long res = n % 2 == 0 ? 1 : 5;
        long x = 20;
        int mod = 1000000007;
        for ( long i = n / 2; i > 0; i /= 2 )
        {
            if ( i % 2 != 0 ) res = (res * x) % mod ;
            x = (x * x) % mod;
        }
        return (int)res;
    }
}
/*
Time Complexity:  O(logn) We divide the number by 2 each time.
Space Complexity: O(1) No extra space required.
*/