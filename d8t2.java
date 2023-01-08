//Find the element that appears once
class Sol
{
    public static int search(int A[], int N)
    {
        // your code here
        int res = 0;
        for (int i = 0; i < N; ++i )
        {
            res ^= A[i];
        }
        return res;
    }
}

/*
Time Complexity:  O(n)
Space Complexity: O(1)
*/