//Write a program to create inverted hollow triangle star pattern of size n

class d4t1 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j < i; ++j)
                System.out.print(" ");
            for (int j = 1; j <= (n * 2 - (2 * i - 1)); ++j) {
                if (i == 1 || j == 1 || j == (n * 2 - (2 * i - 1)))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
/*
Time complexity:  O(n^2) For row and column it becomes quadratic 
Space complexity: O(1) No extra space required thus constant memory
*/