/*
 * You are given a DNA sequence: a string consisting of characters
 * A, C, G, and T. Your task is to find the longest repetition in
 * the sequence. This is a maximum-length substring containing only
 * one type of character.
 *
 * Input:
 * The only input line contains a string of n characters.
 *
 * Output:
 * Print one integer: the length of the longest repetition.
 */


//CODE:


import java.util.Scanner;
 
public class Repetitions {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String sequence = s.nextLine();
        s.close();
 
        if (sequence.length() == 0) {
            System.out.println(0);
            return;
        }
 
        int max = 1;
        int current = 1;
 
        for (int i = 1; i < sequence.length(); i++) {
            if (sequence.charAt(i) == sequence.charAt(i - 1)) {
                current++;
            } else {
                if (current > max) {
                    max = current;
                }
                current = 1;
            }
        }
 
        if (current > max) {
            max = current;
        }
 
        System.out.println(max);
    }
}
