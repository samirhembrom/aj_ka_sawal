//2428. Maximum Sum of an Hourglass
class Solution {
    public int maxSum(int[][] grid) {
        int max = Integer.MIN_VALUE;
        for ( int i = 1; i+1 < grid.length; ++i )
        {
            for ( int j = 1; j+1 < grid[0].length; ++j )
            {
                int currMax = grid[i-1][j-1] + grid[i-1][j] + grid[i-1][j+1] + grid[i][j]
                                + grid[i+1][j-1] + grid[i+1][j] + grid[i+1][j+1];
                if ( currMax > max ) max = currMax;
            }
        }
        return max;
    }
}
/*
Time Complexity:  O(n*m) 
Space Complexity: O(1)
*/