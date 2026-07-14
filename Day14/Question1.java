// Problem: Write a program to check whether a given square matrix is an Identity Matrix. An identity matrix is a square matrix in which all diagonal elements are 1 and all non-diagonal elements are 0.

// Input:
// - First line: integer n representing number of rows and columns
// - Next n lines: n integers each representing the matrix elements

// Output:
// - Print "Identity Matrix" if the matrix satisfies the condition
// - Otherwise, print "Not an Identity Matrix"

// Example:
// Input:
// 3
// 1 0 0
// 0 1 0
// 0 0 1

// Output:
// Identity Matrix
import java.util.*;

public class Question1 {
    public static void main(String args[]) {
        Scanner scc = new Scanner(System.in);

        int m = scc.nextInt();
        int mat[][] = new int[m][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = scc.nextInt();
            }
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                if(i==j){
                    if(mat[i][i]!=1){
                        System.out.println("not an identity matrix");
                        count=1;
                        break;
                    }
                }
                if(i!=j){
                    if(mat[i][j]!=0){
                        count=1;
                        System.out.println("not an identity matrix");
                        break;
                    }
                }
            }
        }
        if(count==0){
            System.out.println("Identity matrix ");
        }
    }
}