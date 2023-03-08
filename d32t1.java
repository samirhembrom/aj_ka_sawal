//287. Find the Duplicate Number
class Solution {
    public int findDuplicate(int[] nums) {
        int tur = nums[0];
        int har = nums[0];
        do 
        {
            tur = nums[tur];
            har = nums[nums[har]];
        }while ( tur != har );
        tur = nums[0];
        while ( tur != har )
        {
            tur = nums[tur];
            har = nums[har];
        }
        return har;
    }
}
/*
Time Complexity:  O(n) Linear Time 
Space Complexity: O(1) No extra space required
*/