//1539. Kth Missing Positive Number
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low = 0;
        int high = arr.length;
        while ( low < high ){
            int mid = low + (high-low)/2;
            if ( arr[mid] - (mid+1) >= k ) high = mid;
            else low = mid + 1;
        }
        return low+k;
    }
}
/*
Time Complexity:  O(log n) Using binary search
Space Complexity: O(1) No extra space required
*/