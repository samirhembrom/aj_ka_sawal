//1389. Create Target Array in the Given Order
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int target[] = new int[n];
        for ( int i = 0; i < n; ++i )
        {
            int ind = index[i];
            for (int j = i; j > ind; --j) target[j] = target[j-1];
            target[ind] = nums[i];
        }
        return target;
    }
}
/*
Time Complexity:  O(n^2)
Space Complexity: O(n)
*/