
//Replace all 0's with 5
class GfG {
    int convertfive(int num) {
        // Your code here
        int rev = 0;
        for( int temp = num; temp != 0; temp /= 10 )
        {
            int rem = temp % 10;
            if( rem == 0 )
            {
                rev = (rev * 10) + 5;
            }
            else
            {
                rev = (rev * 10) + rem;
            }
        }
        int res = 0;
        for( int temp = rev; temp != 0; temp /= 10 )
        {
            int rem = temp % 10;
            res = (res * 10) + rem;
        }
        return res;
    }
}

/*
Time Complexity:  O(n) where n is the number of digits
Space Complexity: O(1) no extra space required
*/