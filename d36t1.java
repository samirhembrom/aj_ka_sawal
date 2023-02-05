//Search insert position of K in a sorted array
class Solution
{
    static int searchInsertK(int arr[], int N, int k)
    {
        int low = 0;
        int high = N - 1;
        while ( low <= high )
        {
            int mid = low + (high-low) / 2;
            if ( arr[mid] == k ) return mid;
            else if ( arr[mid] > k ) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }
}
/*
Time Complexity:  O(logn) using binary search
Space Complexity: O(1) No extra space required
*/