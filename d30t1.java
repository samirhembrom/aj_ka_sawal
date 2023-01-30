//1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        int count = 0;
        for ( int i = 0; i < k; ++i )
        {    
            sum += arr[i];
        }
        if ( sum / k >= threshold ) count++;
        int curSum = sum;
        for ( int i = k; i < arr.length; ++i )
        {
            sum += arr[i] - arr[i-k];
            if ( sum / k >= threshold ) count++;
        }
        return count;
    }
}
/*
Time Complexity:  O(n) Linear Time
Space Complexity: O(1)
*/