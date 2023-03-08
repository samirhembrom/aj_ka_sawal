//342. Power of Four
class Solution {
    public boolean isPowerOfFour(int n) {
        return n > 0 && (n & (n-1)) == 0 && (n-1)%3 == 0;
    }
}
/*
Time Complexity:  O(1) Constant time using bit manupulation 
Space Complexity: O(1) No space required
*/