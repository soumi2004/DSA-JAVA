package Recursion;

import java.util.Scanner;

public class OnetoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        if(n <= 0){
            System.out.println("Invalid input..");
        }
        else {
            System.out.print("From " + n + " to 1 : ");
            funRev(n);
        }

        sc.close();

        
    }

     // functions are getting call and store in stack memory
     static  void  fun(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        fun(n-1);
    }

    // fun reverse when stack is getting empty th enumberse are printing from 1 to n
     static  void  funRev(int n){

        if(n==0){
            return ;
        }
        funRev(n-1);
        System.out.println(n);
    }
}
