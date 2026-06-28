// Problem: Write a C program to insert an element x at a given 1-based position pos in an array of n integers. Shift existing elements to the right to make space.

// Input:
// - First line: integer n
// - Second line: n space-separated integers (the array)
// - Third line: integer pos (1-based position)
// - Fourth line: integer x (element to insert)

// Output:
// - Print the updated array (n+1 integers) in a single line, space-separated

// Example:
// Input:
// 5
// 1 2 4 5 6
// 3
// 3

// Output:
// 1 2 3 4 5 6

// Explanation: Insert 3 at position 3, elements [4,5,6] shift right

import java.util.*;
public class Question1_byme {
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int p=sc.nextInt();
    int x=sc.nextInt();

    int updated_array[] =new int[n+1];

    for(int i=0;i<=n;i++){
        if(i<p-1){
            updated_array[i]=arr[i];   
        }
        else if((p-1)==(i)){
            updated_array[i]=p;
        }
        else{
            updated_array[i]=arr[i-1];
        }
    }
    for(int i=0;i<n+1;i++){
        System.out.print(updated_array[i]+" ");
    }

}
}