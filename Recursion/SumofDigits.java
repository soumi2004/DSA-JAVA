package Recursion;

import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int ans = sum(n);
        System.out.print(ans);

        sc.close();

    }

    static int sum(int n){
           if(n == 0){
            return 0;
           }
           return (n%10) + sum(n/10);
    }
}
