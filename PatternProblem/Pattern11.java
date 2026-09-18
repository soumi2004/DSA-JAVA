package PatternProblem;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // rows--
        for(int i = 1; i <= n; i++){

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
