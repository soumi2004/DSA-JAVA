package Recursion;

import java.util.Scanner;

public class RecursionNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        if(n <= 0){
            System.out.println("Invalid input...");
        }
         else
            {
            System.out.print("Form " + n + " to 1 : ");
            fun(n);
        }
        

        sc.close();
        
    }
    static  void  fun(int n){


        if(n==0){
            return ;
        }



        System.out.println(n);
        fun(n-1);
    }

}
