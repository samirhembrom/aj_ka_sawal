//172. Factorial Trailing Zeroes
class Solution {
    public int trailingZeroes(int n) {
        int freq = 0;
        while ( n>=5 ){
            freq = (n / 5)  + freq;
            n /= 5;
        }
        return freq;
    }
}
/*
Time Complexity: O(logn)
Space Complexity: O(1)
*/