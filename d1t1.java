public class d1t1 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < n; ++i) {
            for (int j = n; j >= i; --j)
                System.out.print(" ");
            for (int j = 0; j <= i; ++j)
                System.out.print("* ");
            System.out.println();
        }
    }
}
/*
Time Complexity     : O(n^2) First for each row the loop runs n time and
                      then for each column we needed to print space and
                      also for printing *.
Space Complexity    : O(1) We just required n to store the value for n
 */
