//1748. Sum of Unique Elements
class Solution {
    public int sumOfUnique(int[] nums) {
        int[] freq = new int[101];
        int count = 0;
        for ( int i : nums)
            freq[i]++;
        for ( int i = 1; i < 101; ++i )
            count += freq[i] == 1 ? i : 0;
        return count;
    }
}
/*
Time Complexity:  O(n) Linear time to pass throw the list
Space Complexity: O(1) Constant Space to store the frequency of the 
			     numbers
*/