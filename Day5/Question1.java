// Problem: A system receives two separate logs of user arrival times from two different servers. Each log is already sorted in ascending order. Your task is to create a single chronological log that preserves the correct order of arrivals.

// Input:
// - First line: integer p (number of entries in server log 1)
// - Second line: p sorted integers representing arrival times from server 1
// - Third line: integer q (number of entries in server log 2)
// - Fourth line: q sorted integers representing arrival times from server 2)

// Output:
// - Print a single line containing all arrival times in chronological order, separated by spaces

// Example:
// Input:
// 5
// 10 20 30 50 70
// 4
// 15 25 40 60

// Output:
// 10 15 20 25 30 40 50 60 70

// Explanation: Compare the next unprocessed arrival time from both logs and append the earlier one to the final log until all entries are processed
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int arr[]=new int[p];
        for(int i=0;i<p;i++){
            arr[i]=sc.nextInt();
        }
        int q=sc.nextInt();
        int brr[]=new int[q];
        for(int i=0;i<p;i++){
            brr[i]=sc.nextInt();
        }

        int result[]=new int[p+q];
        int i=0,j=0,k=0;
        while(i<p && j<q){
            if(arr[i]<brr[j]){
                result[k++]=arr[i++];
            }
            else {
                result[k++]=brr[j++];  
            }
        }
        if(i<p){
            while(i<(p)){
                result[k++]=arr[i++];
            }
        }
        else if(j<q){
            while(j<q){
                result[k++]=brr[j++];
            }
        }
        for(int s=0;s<(p+q);s++){
            System.out.print(result[s]+" ");
        }
    }
}
