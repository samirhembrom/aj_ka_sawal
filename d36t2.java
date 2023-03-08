//K-th element of two sorted Arrays
class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        for ( int i = m - 1; i >= 0; --i )
        {
            int last = arr1[n-1];
            int j;
            for ( j = n - 2 ; j >= 0 && arr1[j] > arr2[i]; --j )
                arr1[j+1] = arr1[j];
            if ( last > arr2[i] )
            {
                arr1[j+1] = arr2[i];
                arr2[i] = last;
            }
        }
        
        int i,c;
        for ( i = 0,c = 0; i < n; ++i,c++ )
            if( k == c+1) return arr1[i];
        for( i = 0; i < m; ++i,++c )
            if ( k == c+1 ) break;
        return arr2[i];
        
        
    }
}
/*
Time Complexity:  O(logn)+O(logm)
Space Complexity: O(1) No extra space required
*/