package Recursion;

import java.util.Scanner;

public class CountSteps {

    public static int numberOfSteps(int num){
           return helper(num, 0);
    }

    private static int helper(int num, int steps){
        if(num == 0){
            return  steps;
        }

        if(num%2 == 0){
            return helper(num/2, steps+1);
        }
        return helper(num-1, steps+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("The number of steps is = " + numberOfSteps(n));

        sc.close();
    }
}
