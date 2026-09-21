package Recursion;

import java.util.Scanner;

public class PalindromeNumber{

     static int rev(int n, int ans){
        if(n == 0){
            return ans;
        }

        int digit = n%10;

         ans = ans*10 + digit;

        return  rev(n/10, ans);
    }


    static  boolean palin(int n){
        return n == rev(n,0);
    }

    public static void main(String[] args) {

       
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (palin(n)) {
            System.out.println("Palindrome true..");
        } else {
            System.out.println("Not Palindrome");
        }

       
        sc.close();
    }
}