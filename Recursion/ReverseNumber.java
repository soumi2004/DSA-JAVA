package Recursion;

import java.util.Scanner;

public class ReverseNumber {

    static int reverse(int n, int ans){
        if(n == 0){
            return ans;
        }

        int digit = n%10;

        ans = ans*10 + digit;

        return  reverse(n/10, ans);
    }

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int ans = reverse(n,0);
        System.out.println("Reverse " + ans);

        sc.close();

    }


}
