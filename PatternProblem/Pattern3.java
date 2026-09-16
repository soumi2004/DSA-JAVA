package PatternProblem;

import java.util.Scanner;

public class Pattern3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        
        // row--
        for (int i = 1; i <= n; i++) {
           
            // column--
            for (int j = 1; j <= n - i + 1; j++) {

                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}
