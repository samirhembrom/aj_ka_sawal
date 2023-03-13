//Maximum AND Value
class Solution{
    
   // Function for finding maximum AND value.
    public static int getCount(int pat, int arr[], int n){
        int count = 0;
        for ( int i = 0; i < n; ++i )
            if ((pat&arr[i]) == pat ) count++;
        return count;
    }
    public static int maxAND (int arr[], int N) {
        int res = 0, count = 0;
        for ( int i = 16; i >= 0; --i ){
            count = getCount((res|(1<<i)),arr,N);
            if ( count >= 2 ){
                res |= (1<<i);
            }
        }
        return res;
    }
    
}
/*
Time Complexity:  O(n*logm) For each bits we search 
Space Complexity: O(1) No extra space required
*/