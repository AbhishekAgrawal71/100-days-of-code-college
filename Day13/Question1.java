// Problem: You are given a rectangular matrix of integers. Starting from the outer boundary, traverse the matrix in a clockwise manner and continue moving inward layer by layer until all elements are visited.

// Input:
// - First line: two integers r and c representing the number of rows and columns
// - Next r lines: c integers each representing the matrix elements

// Output:
// - Print all visited elements in the order of traversal, separated by spaces

// Example:
// Input:
// 3 3
// 1 2 3
// 4 5 6
// 7 8 9

// Output:
// 1 2 3 6 9 8 7 4 5

// Explanation:
// The traversal begins along the top row, proceeds down the rightmost column, then moves across the bottom row in reverse, and finally goes up the leftmost column. The same pattern repeats for the inner submatrix.

// Test Cases:

// Test Case 1:
// Input:
// 2 3
// 1 2 3
// 4 5 6
// Output:
// 1 2 3 6 5 4

// Test Case 2:
// Input:
// 3 1
// 7
// 8
// 9
// Output:
// 7 8 9
import java.util.*;

public class Question1 {
    public static void main(String args[]) {
        Scanner scc = new Scanner(System.in);

        int m = scc.nextInt();
        int n = scc.nextInt();

        int mat[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scc.nextInt();
            }
        }

        int sr = 0;
        int sc = 0;
        int er = mat.length - 1;
        int ec = mat[0].length - 1;

        while (sr <= er && sc <= ec) {

            // Top row
            for (int i = sc; i <= ec; i++) {
                System.out.print(mat[sr][i] + " ");
            }
            sr++;

            // Right column
            for (int i = sr; i <= er; i++) {
                System.out.print(mat[i][ec] + " ");
            }
            ec--;

            // Bottom row
            if (sr <= er) {
                for (int i = ec; i >= sc; i--) {
                    System.out.print(mat[er][i] + " ");
                }
                er--;
            }

            // Left column
            if (sc <= ec) {
                for (int i = er; i >= sr; i--) {
                    System.out.print(mat[i][sc] + " ");
                }
                sc++;
            }
        }
    }
}