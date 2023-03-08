//69. Sqrt(x)
class Solution {
    public int mySqrt(int x) {
        int low = 1;
        int high = x;
        while (low <= high)
        {
            int mid = low + (high-low) / 2;
            if ( x / mid == mid ) return mid;
            else if ( mid > x / mid ) high = mid - 1;
            else low = mid + 1;
        }
        return high;
    }
}
/*
Time Complexity:  O(log n) Using binary search
Space Complexity: O(1) No extra space required
*/