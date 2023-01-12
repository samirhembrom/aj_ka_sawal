//First element to occur k times
class Solution
{
    public int firstElementKTime(int[] arr, int n, int k) { 
        HashMap<Integer,Integer> map = new HashMap<>();
        int res = 0;
        if ( k == 1 )
            return arr[0];
        for( int i = 0; i < n; ++i )
        {
            if( map.containsKey(arr[i]) )
            {
                int count = map.get(arr[i]);
                count++;
                if( count >= k )
                    return arr[i];
                map.replace(arr[i],count);
            }
            else
                map.put(arr[i],1);
        }
        return -1;
    }
}

/*
Time Complexity:  O(n) Iterating over the all array elements 
Space Complexity: O(n) To store the count
*/