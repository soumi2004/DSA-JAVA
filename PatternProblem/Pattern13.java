package PatternProblem;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n  = sc.nextInt();

           
            // upper pramid
        for(int i = 1; i <= n; i++){
         
            // spaces--
            for(int space = 1; space <= n-i; space++){
                    System.out.print(" ");
            }

            // stars--
            for(int stars = 1; stars <= 2*i-1; stars++){
                System.out.print("*");
            }
            System.out.println();

        }

        // lower pyramid
        for(int i = n-1; i >= 1; i--){

            // spaces--
            for(int space = 1; space <= n-i; space++){
                System.out.print(" ");
            }

            // stars--
            for(int star = 1; star <= 2*i-1; star++){
                System.out.print("*");
            }
            System.out.println();


       }
     sc.close();
     }
}
