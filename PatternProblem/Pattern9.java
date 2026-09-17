package PatternProblem;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // row--
        for(int i = 1; i <= n; i++){
            // column--
            for(int j =1; j <= i; j++){
                if((i+j) % 2 == 0){
                    System.out.print(1);
                } else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
