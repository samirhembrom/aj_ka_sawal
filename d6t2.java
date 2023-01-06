// Union of Two Sorted Arrays

class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        //ArrayList<Integer> res = new  ArrayList<>();
        TreeSet<Integer> list = new TreeSet<>();
        int i = 0;
        int j = 0;
        while ( i < n && j < m )
        {
            if ( arr1[i] < arr2[j] )
                list.add(arr1[i++]);
            else if ( arr1[i] > arr2[j] )
                list.add(arr2[j++]);
            else
            {
                list.add(arr1[i++]);
                j++;
            }
        }
        while ( i < n )
            list.add(arr1[i++]);
        while ( j < m )
            list.add(arr2[j++]);
        return new ArrayList<>(list);
    }
}

/*
Time Complexity:  O(m+n) where n and m are length of the array
Space Complexity: O(m+n) take n and m elements in worst case scenario 
*/