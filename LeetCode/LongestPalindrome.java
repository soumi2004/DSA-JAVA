package LeetCode;

import java.util.Scanner;

public class LongestPalindrome {

    static int longestPalindrome(String s) {

        // Frequency array
        int[] count = new int[128];

        // Count every character
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }

        int length = 0;
        boolean hasOdd = false;

        // Check every character's frequency
        for (int i = 0; i < count.length; i++) {

            // Take only the paired part
            length += (count[i] / 2) * 2;

            // Check if frequency is odd
            if (count[i] % 2 == 1) {
                hasOdd = true;
            }
        }

        // One odd character can be placed in the center
        if (hasOdd) {
            length++;
        }

        return length;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int result = longestPalindrome(s);

        System.out.println("Longest palindrome length: " + result);

        sc.close();
    }
}