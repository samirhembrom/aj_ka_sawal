//278. First Bad Version
public class Solution extends VersionControl {
    public int firstBadVersion(int n){
        int low = 1;
        int high = n;
        while ( low < high )
        {
            int mid = low + (high - low) / 2;
            if ( isBadVersion(mid)) high = mid;
            else low = mid + 1;
        }
        return low;
    }
}

/*
Time Complexity:  O(log n) Using binary search
Space Complexity: O(1)	No extra space required
*/