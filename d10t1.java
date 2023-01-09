//Wave Array
class Solution {
    public static void convertToWave(int n, int[] a) {
        for( int i = 0; i < n-1; ++i )
        {
            if( i % 2 == 0 )
            {
                if( a[i] < a[i+1] )
                {
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
            else
            {
                if( a[i] > a[i+1] )
                {
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
        }
    }
}

/*
Time Complexity:  O(n)
Space Complexity: O(1)
*/