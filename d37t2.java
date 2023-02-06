//219. Contains Duplicate II
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for ( int i = 0; i < nums.length; ++i )
        {
            if( map.containsKey(nums[i]))
            {
                System.out.println(map);
                if( i - map.get(nums[i]) <= k ) return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }
}
/*
Time Complexity:  O(n) We traverse through each element
Space Complexity: O(n) We need to store the values in map
*/