//Find the Highest number
class Solution
{
    public int findPeakElement(List<Integer> a)
    {
        int high = a.size() - 1;
        int low = 0;
        while ( low < high )
        {
            int mid = low + (high-low) / 2;
            if ( a.get(mid) > a.get(mid+1) && a.get(mid) > a.get(mid-1) )
                return a.get(mid);
            else if ( a.get(mid) < a.get(mid+1) && a.get(mid) > a.get(mid-1) )
                low = mid + 1;
            else
                high = mid - 1;
        }
        return a.get(low);
        
    }
}
/*
Time Complexity:   O(log n) Using binary search
Space Comeplexity: O(1)  No extra space required
*/