/*
 * You are given all numbers between 1, 2, ..., n except one.
 * Your task is to find the missing number.
 *
 * Input:
 * The first input line contains an integer n.
 * The second line contains n-1 numbers. Each number is distinct
 * and between 1 and n (inclusive).
 *
 * Output:
 * Print the missing number.
 */


//CODE:



import java.util.Scanner;
 
public class MissingNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        long real = (long) n * (n+1)/2;
        long sum = 0;
 
        for (int i = 0; i < n-1 ; i++) {
            sum = sum + s.nextInt();
        }
 
        long miss = real - sum;
        System.out.println(miss);
    }
}
