//First negative integer in every window of size k
class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        LinkedList<Integer> di = new LinkedList<>();
        ArrayList<Long> arr = new ArrayList<>();
        //int count = 0;
        int i;
        for ( i = 0; i < K; ++i )
            if (A[i] < 0 ) di.add(i);
            
        for ( ; i < N; ++i )
        {
            if ( !di.isEmpty() ) arr.add((long)A[di.peek()]);
            else arr.add((long)0);
            while ( (!di.isEmpty()) && (di.peek() < (i-K+1)) ) di.remove();
            if ( A[i] < 0 ) di.add(i);
        }
        if ( !di.isEmpty() ) arr.add((long)A[di.peek()]);
        else arr.add((long)0);
        long[] ans = new long[arr.size()];
        i = 0;
        for ( long val : arr)
        {
            //System.out.print(val+" ");
            ans[i++] = val;
        }
        return ans;
    }
}
/*
Time Complexity:  O(n) Linear Pass
Space Complexity: O(k) To process the negative elements
*/