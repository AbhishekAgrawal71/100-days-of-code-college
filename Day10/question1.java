// Problem: Read a string and check if it is a palindrome using two-pointer comparison.

// Input:
// - Single line: string s

// Output:
// - Print YES if palindrome, otherwise NO

// Example:
// Input:
// level

// Output:
// YES

// Explanation: String reads same forwards and backwards
import java.util.*;
public class question1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        int left=0;
        int right=str.length()-1;
        int count=0;
        while(left<=right){
            if(arr[left]!=arr[right]){
                count++;
                System.out.println("no");
                break;
            }
            left++;
            right--;
        }
        if(count==0){
            System.out.println("yes");
        }
    }
}
