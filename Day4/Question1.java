// Problem: Given an array of n integers, reverse the array in-place using two-pointer approach.

// Input:
// - First line: integer n
// - Second line: n space-separated integers

// Output:
// - Print the reversed array, space-separated

// Example:
// Input:
// 5
// 1 2 3 4 5

// Output:
// 5 4 3 2 1

// Explanation: Swap pairs from both ends: (1,5), (2,4), middle 3 stays
import java.util.*;
public class Question1 {
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int temp=0;
    int left=0,right=arr.length-1;
    while(left<=right){
        temp=arr[right];
        arr[right]=arr[left];
        arr[left]=temp;
        left++;
        right--;
    }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
}