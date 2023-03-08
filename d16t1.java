//374. Guess Number Higher or Lower
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1;
        int high = n; 
        while (low <= high)
        {
            int mid = low + (high-low) / 2;
            if ( guess(mid) == 0 ) return mid;
            else if( guess(mid) > 0 ) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }
}
/*
Time Complexity:  O(log n) Using binary search
Space Complexity: O(1) No extra space required
*/