//1342. Number of Steps to Reduce a Number to Zero
class Solution {
    public int numberOfSteps(int num) {
        /*
        We perform AND operation with 1 in order to find if
        it is odd or even number. If the number is odd the
        AND operation will produce 1 at the else 0 if the 
        number is odd. 
        Perform xor operation of any number with 1 to reduce
        the number by 1.
        If it the number is odd use XOR operation or perform
        right shift in order to divide the number by 2. Right 
        shift is basically just dividing the number by 2.
        */ 
        int c = 0;
        while ( num != 0 ){
            num = (num & 1) == 1 ? num ^ 1 : num >> 1;
            c++;
        }
        return c;
    }
}
/*
Time Complexity:  O(n) Linear Time 
Space Complexity: O(1) No extra space required
*/