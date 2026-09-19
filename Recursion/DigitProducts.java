package Recursion;

import java.util.Scanner;

public class DigitProducts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int ans = prod(n);
        System.out.print(ans);

        sc.close();

    }

    static int prod(int n){
           if(n%10 == n){
            return n;
           }
           return (n%10) * prod(n/10);
    }
}
