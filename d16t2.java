//744. Find Smallest Letter Greater Than Target
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = letters.length-1;
        int ans = 0;
        while (low <= high)
        {
            int mid = low + (high-low) / 2;
            if (letters[mid] > target)
            {
                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return letters[ans];
    }
}
/*
Time Complexity:  O(log n) Using binary search
Space Complexity: O(1) No extra space required
*/