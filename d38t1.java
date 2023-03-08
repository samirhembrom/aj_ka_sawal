//2535. Difference Between Element Sum and Digit Sum of an Array
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        for ( int i = 0; i < nums.length; ++i ){
            sum1 += nums[i];
            if ( nums[i] > 9 )
            {
                int temp = nums[i];
                while ( temp != 0 ){
                    sum2 += temp % 10;
                    temp /= 10;
                }
            }
            else sum2 += nums[i];
        }
        return Math.abs( sum1 - sum2 );
    }
}
/*
Time Complexity:  O(n*k) where k is the number of digits. 
Space Complexity: O(1) No extra space required.
*/