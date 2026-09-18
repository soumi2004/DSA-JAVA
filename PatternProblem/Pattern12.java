package PatternProblem;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // rows--
        for(int i = 1; i <= n; i++){
            
            // spaces--
            for(int spaces = 1; spaces <= i-1; spaces++){
                System.out.print(" ");
            }

            // stars--
            for(int stars = 1; stars <= 2*(n-i)+1; stars++){
                System.out.print("*");
            }

            System.out.println();

        }

        sc.close();

    }
}
