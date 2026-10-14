package LeetCode;


import java.util.Scanner;

public class MaximizeSumOfSquares {

    public static String maxSumOfSquares(int num, int sum) {
        if (sum > num * 9) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < num; i++) {
            int digit = Math.min(9, sum);

            result.append(digit);
            sum = sum - digit;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of digits: ");
        int num = sc.nextInt();

        System.out.print("Enter digit sum: ");
        int sum = sc.nextInt();

        if (num < 1 || sum < 0) {
            System.out.println("Invalid input.");
        } else {
            String result = maxSumOfSquares(num, sum);
            System.out.println("Result: " + result);
        }

        sc.close();
    }
}
