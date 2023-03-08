//Largest subarray with 0 sum
//{ Driver Code Starts
class GfG
{
    int maxLen(int arr[], int n)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxLen = 0;
        int sum = 0;
        for ( int i = 0; i < n; ++i )
        {
            sum += arr[i];
            if ( sum == 0 )                 maxLen = i + 1;
            if ( !map.containsKey(sum) )    map.put(sum,i);
            else                            maxLen = Math.max(i-map.get(sum),maxLen);
        }
        return maxLen;
        
    }
}
/*
Time Complexity:  O(n) Linear Time.
Space Complexity: O(n) To store the hash values.
*/