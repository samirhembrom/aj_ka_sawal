//2269. Find the K-Beauty of a Number
class Solution {
    public int divisorSubstrings(int num, int k) {
        int count = 0;
        int n = num;
        int mod = (int)Math.pow(10,k);
        while ( n >= (mod / 10) )
        {
            if ((n % mod != 0) && num % (n%mod) == 0 ) count++;
            n /= 10;
        }
        return count;
    }
}
/*
Time Complexity:  O(log n) Since we divide the number with mod
Space Complexity: O(1) No extra space
*/