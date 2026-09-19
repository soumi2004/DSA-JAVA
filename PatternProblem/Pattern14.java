package PatternProblem;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        // rows--
        for(int i = 1; i <= n; i++){
            // columns--
            for(int j = 1; j <= n; j++){

                // condition to print hollow square--
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();

    }
}
