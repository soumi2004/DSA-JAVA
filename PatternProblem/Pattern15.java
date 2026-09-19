package PatternProblem;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        // upper half--
        //row--
        for(int i=1; i<=n; i++){
            //left stars--
            for(int star=1; star<=i; star++ ){
                System.out.print("*");
            }

            // spaces--
            for(int space=1; space<=2*(n-i); space++){
                System.out.print(" ");
            }

             //right stars--
            for(int star=1; star<=i; star++ ){
                System.out.print("*");
            }
            System.out.println();
        }

        // lower half--
        //row--
        for(int i=n-1; i>=1; i--){
            //left stars--
            for(int star=1; star<=i; star++){
                System.out.print("*");
            }

            // spaces--
            for(int space=1; space<=2*(n-i); space++){
                System.out.print(" ");
            }

             //right stars--
            for(int star=1; star<=i; star++){
                System.out.print("*");
            }
             System.out.println();
        }

        sc.close();
    }
}
