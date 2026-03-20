/*
 * A permutation of integers 1, 2, ..., n is called beautiful if
 * there are no adjacent elements whose difference is 1.
 * Given n, construct a beautiful permutation if such a permutation exists.
 *
 * Input:
 * The only input line contains an integer n.
 *
 * Output:
 * Print a beautiful permutation of integers 1, 2, ..., n.
 * If there are several solutions, you may print any of them.
 * If there are no solutions, print "NO SOLUTION".
 */



//CODE:



import java.util.Scanner;
 
public class Permutations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextInt();
            if (n == 2 || n == 3) {
            System.out.println("NO SOLUTION");
            return ;
        }
        String[] res = new String[(int)n];
        int index = 0;
 
        for (int i = 2; i <= n; i += 2) {
            res[index++] = String.valueOf(i);
        }
        for (int i = 1; i <= n; i += 2) {
            res[index++] = String.valueOf(i);
        }
        System.out.println(String.join(" ", res));
        s.close();
    }
}
