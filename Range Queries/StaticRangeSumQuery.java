/*
 * Given an array of n integers, your task is to process q queries
 * of the form: what is the sum of values in range [a, b]?
 *
 * Input:
 * The first input line has two integers n and q: the number of
 * values and queries.
 * The second line has n integers x1, x2, ..., xn: the array values.
 * Finally, there are q lines describing the queries. Each line has
 * two integers a and b: what is the sum of values in range [a, b]?
 *
 * Output:
 * Print the result of each query.
 */




//CODE:



import java.io.*;
import java.util.*;
public class StaticRangeSumQuery {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
 
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        long[] prefix = new long[n+1];
 
        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=n; i++) {
            prefix[i] = prefix[i-1] + Long.parseLong(st.nextToken());
        }
 
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<q; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(prefix[b] - prefix[a-1]).append("\n");
        }
 
        System.out.print(sb.toString());
    }
}
