//Move all zeroes to end of array
class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        int ind = 0;
        for ( int i = 0; i < n ; ++i )
        {
            if( arr[i] != 0 )
            {
                int temp = arr[i];
                arr[i] = arr[ind];
                arr[ind] = temp;
                ind++;
            }
        }
    }
}
/*
Time Complexity:  O(n)
Space Complexity: O(1)
*/