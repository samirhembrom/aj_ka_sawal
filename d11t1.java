//1089. Duplicate Zeros
class Solution {
    public void duplicateZeros(int[] arr) {
        int dup = 0;
        int len = arr.length - 1 ;
        for ( int first = 0; first <= len-dup; ++first )
        {
            if (arr[first] == 0)
            {
                if ( first == len - dup )
                {
                    arr[len] = 0;
                    len--;
                    break;
                }
                dup++;
            }
        }
        int last = len - dup;
        for( int i = last; i >= 0; --i )
        {
            if( arr[i] == 0 )
            {
                arr[i+dup] = 0;
                dup--;
                arr[i+dup] = 0;
            }
            else
            {
                arr[i+dup] = arr[i];
            }
        }
    }
}

/*
Time Complexity:  O(n)	Takes two passes one for counting duplicates and
		  other for copying the elements.
Space Complexity: O(1)	No need for extra memory, in place operation
*/