package LeetCode;

import java.util.Scanner;

public class GreatestCommonDivisorOfStrings {

    public static String gcdOfStrings(String str1, String str2) {

        // Check if both strings have the same repeating pattern
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        //  Find GCD of their lengths
        int gcdLength = gcd(str1.length(), str2.length());

        // Return the common repeating part
        return str1.substring(0, gcdLength);
    }

   
    public static int gcd(int a, int b) {

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        String result = gcdOfStrings(str1, str2);

        System.out.println("GCD of strings: " + result);

        sc.close();
    }
}