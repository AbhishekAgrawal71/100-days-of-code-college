// Problem: Given an array of integers, find two elements whose sum is closest to zero.

// Input:
// - First line: integer n
// - Second line: n space-separated integers

// Output:
// - Print the pair of elements whose sum is closest to zero

// Example:
// Input:
// 5
// 1 60 -10 70 -80

// Output:
// -10 1

// Explanation: Among all possible pairs, the sum of -10 and 1 is -9, which is the closest to zero compared to other pairs.

import java.util.*;

public class Question1 {

    public static int mod(int a) {
        if (a < 0)
            return -a;
        return a;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int arr[] = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int e1 = 0, e2 = 0;

        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {

                if (mod(arr[i] + arr[j]) < min) {
                    min = mod(arr[i] + arr[j]);
                    e1 = arr[i];
                    e2 = arr[j];
                }

            }
        }

        System.out.println(e1 + " " + e2);
    }
}