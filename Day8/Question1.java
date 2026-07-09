// Problem: Given integers a and b, compute a^b using recursion without using pow() function.

// Input:
// - Two space-separated integers a and b

// Output:
// - Print a raised to power b

// Example:
// Input:
// 2 5

// Output:
// 32

// Explanation: 2^5 = 2 * 2 * 2 * 2 * 2 = 32
package Day8;
import java.util.*;

public class Question1 {
    public static long  power(int a,int b){
        if(b==1){
            return a;
        }
        else if(b==0){
            return 1;
        }
        return a*power(a,b-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("The value of "+a+"^"+b+" is : "+power(a,b));
    }
}
