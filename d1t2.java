public class d1t2 {
    public long[] minAnd2ndMin(long a[], long n) {
        long min1 = Long.MAX_VALUE;
        long min2 = Long.MAX_VALUE;
        long arr[] = new long[2];

        for (int i = 0; i < n; ++i) {
            if (a[i] < min1) {
                min2 = min1;
                min1 = a[i];
            } else if (a[i] < min2 && a[i] > min1)
                min2 = a[i];
        }

        if (min2 == Long.MAX_VALUE) {
            arr[0] = (long) -1;
            arr[1] = (long) -1;
        } else {
            arr[0] = min1;
            arr[1] = min2;
        }

        return arr;
    }
}
/*
Time Complexity     : O(n) As we need to access all the n elements of the array
Space Complexity    : O(2) We used an array to store two elements thus 2 constants
                      space is required.
 */
