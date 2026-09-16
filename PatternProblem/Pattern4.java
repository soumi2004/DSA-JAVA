package PatternProblem;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // row--
        for(int row = 1; row <= n; row++){
            // column--
            for(int col = 1; col <= row; col++){
                System.out.print(col);
            }
            System.out.println();
        }

        sc.close();
    }
}
