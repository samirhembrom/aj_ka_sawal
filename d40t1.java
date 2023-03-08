//Count number of free cell
class Solution {
    long[] countZero(int N, int K, int[][] arr){
        // code here
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        long[] res = new long[K];
        for ( int i = 0; i < K; ++i){
            int r = arr[i][0];
            int c = arr[i][1];
            if ( !row.contains(r) ) row.add(r);
            if ( !col.contains(c) ) col.add(c);
            int count = (N * N) - ( (row.size() * N) + (col.size() * N) - (row.size()*col.size()) );
            res[i] = (long)count;
        }
        return res;
    }
}
/*
Time Complexity:  O(k) Linear pass over the queries 
Space Complexity: O(n+n) Need to store the column and row values; 
*/