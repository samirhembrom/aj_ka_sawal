//Max Sum Subarray of size K
class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        long maxSum = 0;
        for ( int i = 0; i < K; ++i )
            maxSum += Arr.get(i);
        if ( K == N ) return maxSum;
        long curSum = maxSum;
        for ( int i = K; i < N; ++i )
        {
            curSum += Arr.get(i) - Arr.get(i-K) ;
            maxSum = Math.max(curSum, maxSum);
        }
        return maxSum;
    }
}
/*
Time Complexity:  O(n) Linear time.
Space Complexity: O(1) No extra space required.
*/