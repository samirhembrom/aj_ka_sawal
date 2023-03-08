//560. Subarray Sum Equals K
class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0, n = nums.length, c = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for ( int i = 0; i < n; ++i ) {
            sum += nums[i];
            if ( sum == k ) c++;
            if ( map.containsKey(sum-k) ) c += map.get(sum-k);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return c;
  }
}
/*
Time Complexity:  O(n) Linear Time
Space Complexity: O(n) To store the cumulative sum
*/