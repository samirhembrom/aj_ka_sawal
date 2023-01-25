//1. Two Sum
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int complement = target - nums[0];
        int i;
        for ( i = 0 ; i < nums.length; ++i )
        {
            complement = target - nums[i];
            if( map.containsKey(complement) )
                break;
            map.put(nums[i],i);
        }
        return new int[]{i,map.get(complement)};
    }
}
/*
Time Complexity:  O(n) Linear time One time traverse
Space Complexity: O(n) Linear Space required to store values
*/