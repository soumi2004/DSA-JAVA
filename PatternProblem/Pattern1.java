package PatternProblem;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.print("Take the value of n: ");
          int n = sc.nextInt();
          // row--
          for(int i = 1; i <= n; i++){
            // column--
            for(int j = 0; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
          }
        sc.close();
    }
}
