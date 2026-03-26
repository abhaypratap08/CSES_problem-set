/*
Your task is to count for k=1,2,\ldots,n the number of ways two knights can be placed on a k \times k chessboard so that they do not attack each other.
Input
The only input line contains an integer n.
Output
Print n integers: the results.
*/


//CODE:




import java.io.*;
 
class TwoKnights {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
 
        for (long k = 1; k <= n; k++) {
            long cells = k * k;
            long total = cells * (cells - 1) / 2;
            long attacking = 0;
            if (k >= 3) attacking = 4 * (k - 1) * (k - 2);
            long ans = total - attacking;
            sb.append(ans).append('\n');
        }
 
        System.out.print(sb.toString());
    }
}
