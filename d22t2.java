//217. Contains Duplicate
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for ( int i = 0; i < nums.length; ++i )
            set.add(nums[i]);
        if ( set.size() != nums.length ) return true;
        return false;
    }
}
/*
Time Complexity:  O(n) Linear time to traverse through the array
Space Complexitu: O(n) Space to store the distinct values
*/