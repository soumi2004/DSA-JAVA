package Recursion.PatternProblems;

import java.util.Scanner;

public class Triangle {

    static  void triangle(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r) {
            System.out.print("*");
            triangle(r, c+1);
        } else {
            System.out.println();
            triangle(r-1, 0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        System.out.print("Enter the value of rows: ");
        int n = sc.nextInt();

        triangle(n, 0);

        sc.close();
    }
    
}
