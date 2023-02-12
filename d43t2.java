//153. Find Minimum in Rotated Sorted Array
class Solution {
    public int findMin(int[] nums) {
        if( nums.length == 1) return nums[0];
        if( nums.length == 2 ){
            if ( nums[0] < nums[1]) return nums[0];
            else return nums[1];
        }
        int low = 0; 
        int high = nums.length - 1;
        while ( low < high ){
            int mid = low + (high - low) / 2;
            if ( nums[mid] > nums[low] )
            {
                if (nums[low] < nums[high]  ) return nums[low];
                low = mid;
            }
            else high = mid;
        }
        return nums[low+1];
    }
}
/*
Time Complexity:  O(logn) Using binary search
Space Complexity: O(1) No extra space required
*/