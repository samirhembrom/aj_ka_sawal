//2550. Count Collisions of Monkeys on a Polygon
class Solution {
    public int monkeyMove(int n) {
        long base = 2, res = 1, mod = (long)1e9 + 7;
        while ( n != 0 ){
            if ( n % 2 == 1 ) res = (res * base) % mod;
            base = (base * base) % mod;
            n >>= 1;
        }
        return (int)((res - 2 + mod) % mod);
    }
}
/*
Time Complexity:  O(logn) Using binary exponentation.
Space Complexity: O(1) No extra space required.
*/