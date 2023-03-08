//643. Maximum Average Subarray I
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int best = 0;
        for ( int i = 0; i < k; ++i )
            best += nums[i];
        int curr = best;
        for ( int i = k; i < nums.length; ++i )
        {
            curr += -nums[i-k] + nums[i];
            best = Math.max(curr,best);
        }
        return (double)best/k;
    }
}
/*
Time Complexity:  O(n) Linear time using window sliding method.
Space Complexity: O(1) No extra space required.
*/