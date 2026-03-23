/*
 * You are given coordinates (y, x) in an infinite number spiral.
 * The spiral starts from (1,1) with number 1 and expands outward.
 *
 * Your task is to determine the number located at position (y, x).
 *
 * Input:
 * The first line contains an integer t (number of test cases).
 * Each of the next t lines contains two integers y and x.
 *
 * Output:
 * For each test case, print the number at position (y, x).
 */



// CODE:

 
class NumberSpiral {
    static long Logic(long row, long col) {
        if (row <= col) {
            if (col % 2 == 1) return col * col - row + 1;
            else return (col - 1) * (col - 1) + row;
        } else {
            if (row % 2 == 0) return row * row - col + 1;
            else return (row - 1) * (row - 1) + col;
        }
    }
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
 
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String[] parts = br.readLine().split(" ");
            long row = Long.parseLong(parts[0]);
            long col = Long.parseLong(parts[1]);
            sb.append(Logic(row, col)).append("\n");
        }
        System.out.print(sb);
    }
}
