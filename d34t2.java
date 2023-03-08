//350. Intersection of Two Arrays II
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for ( int val : nums1 )
        {
            if ( map.containsKey(val) )
                map.put(val,map.get(val)+1);
            else
                map.put(val,1);
        }
        for ( int val : nums2 )
        {
            if ( map.containsKey(val) )
            {
                if( map.get(val) > 0 )
                {
                    list.add(val);
                    map.put(val,map.get(val)-1);
                }
            }
        }
        int i = 0;
        int[] arr = new int[list.size()];
        for ( int val : list )
        {
            arr[i++] = val;
        }
        return arr;

    }
}
/*
Time Complexity:  O(n+m) Linear time to traverse both array
Space Complexity: O(k) Common elements
*/