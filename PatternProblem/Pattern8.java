package PatternProblem;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // row--
        for(int i = 1; i <= n; i++){
            // column--
            for(int j = 1; j <= i; j++){
                System.out.print((char)('A'  +  j-1));
            }
            System.out.println();
        }

        sc.close();

    }
}
