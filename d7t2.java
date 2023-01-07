//Missing number

class Compute {
    
    public static int missingNumber(int A[], int N)
    {
         // Your code goes here
         int sum = 0;
         for( int i = 0; i < N; ++i )
            sum += A[i];
        return  ((N * (N+1)) / 2) - sum ;
    }
}

/*
Time complexity:  O(n) we access all elements of the array
Space complexity: O(1) No extra space required
*/