// Problem: Given an array of integers, count the frequency of each distinct element and print the result.

// Input:
// - First line: integer n (size of array)
// - Second line: n integers

// Output:
// - Print each element followed by its frequency in the format element:count

// Example:
// Input:
// 5
// 1 2 2 3 1

// Output:
// 1:2 2:2 3:1
import java.util.*;
public class Question1 {
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int fre[]=new int[n];
    for(int i=0;i<n;i++){
        fre[arr[i]]++;
    }
    for(int i=0;i<n;i++){
        if(fre[i]>0){
            System.out.print(" "+i+":"+fre[i]+" ");
        }
    }
}
}