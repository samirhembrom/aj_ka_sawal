326. Power of Three
class Solution {
    public boolean isPowerOfThree(int n) {
        long temp = 1;
        while ( n > 1 && temp < n ){
            temp += temp << 1;
        }
        return temp == n;
    }
}
/*
Time Complexity: O(log3n)
Space Complexity: O(1)
*/