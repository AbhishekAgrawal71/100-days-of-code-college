

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        // System.out.println(Arrays.toString(arr));
        int left=0;
        int right=str.length()-1;
        char ch = 'c';
        while(left<=right){
            ch=arr[left];
            arr[left]=arr[right];
            arr[right]=ch;
            left++;
            right--;
        }
        System.out.println(arr);
    }
}