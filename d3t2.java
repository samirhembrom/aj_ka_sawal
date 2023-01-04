<<<<<<< HEAD
//75. Sort Colors

class Solution {
    public void sortColors(int[] nums) {
        int start = 0, mid = 0, temp;
        int end = nums.length - 1;
        while ( mid <= end )
        {
            if ( nums[mid] == 0 )
            {
                temp = nums[start];
                nums[start] = nums[mid];
                nums[mid] = temp;
                start++;
                mid++;
            }
            else if ( nums[mid] == 2 )
            {
                temp = nums[end];
                nums[end] = nums[mid];
                nums[mid] = temp;
                end--;
            }
            else
                mid++;
        }
    }
}
/*
Time Complexity : O(n) since it may be the case that all the colors are sorted in order 
		       then it would iterate over the whole list
Space Complexity: O(1) We did not need any extra space to store the array elements we 
		       did the operation in the array itself.
=======
//75. Sort Colors

class Solution {
    public void sortColors(int[] nums) {
        int start = 0, mid = 0, temp;
        int end = nums.length - 1;
        while ( mid <= end )
        {
            if ( nums[mid] == 0 )
            {
                temp = nums[start];
                nums[start] = nums[mid];
                nums[mid] = temp;
                start++;
                mid++;
            }
            else if ( nums[mid] == 2 )
            {
                temp = nums[end];
                nums[end] = nums[mid];
                nums[mid] = temp;
                end--;
            }
            else
                mid++;
        }
    }
}
/*
Time Complexity : O(n) since it may be the case that all the colors are sorted in order 
		       then it would iterate over the whole list
Space Complexity: O(1) We did not need any extra space to store the array elements we 
		       did the operation in the array itself.
>>>>>>> 33fd9571ba77adde9123378e377209ab767eb4f2
*/