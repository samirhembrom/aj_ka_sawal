//303. Range Sum Query - Immutable
class NumArray {
    int[] n;
    public NumArray(int[] nums) {
        n = new int[nums.length];
        n[0] = nums[0];
        for ( int i = 1; i < nums.length; ++i )
            n[i] = nums[i] + n[i-1];
    }
    
    public int sumRange(int left, int right) {
        if ( left == 0 ) return n[right];
        else return n[right] - n[left-1];
    }
}
/*
Time Complexity:  O(1) We pre compute the sum
Space Complexity: O(n) For storing prefix sum
*/