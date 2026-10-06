package LeetCode;

import java.util.Scanner;

public class PalindromeSubstring {

    public static String longestPalindrome(String s) {

        if (s.length() < 2) {
            return s;
        }

        int start = 0;
        int maxLength = 1;

        for (int i = 0; i < s.length(); i++) {

            // Odd-length palindrome
            int oddLength = expandAroundCenter(s, i, i);

            // Even-length palindrome
            int evenLength = expandAroundCenter(s, i, i + 1);

            int currentLength = Math.max(oddLength, evenLength);

            if (currentLength > maxLength) {

                maxLength = currentLength;

                start = i - (currentLength - 1) / 2;
            }
        }

        return s.substring(start, start + maxLength);
    }

    static int expandAroundCenter(String s, int left, int right) {

        while (left >= 0 &&
               right < s.length() &&
               s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        return right - left - 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String result = longestPalindrome(s);

        System.out.println("Longest palindromic substring: " + result);

        sc.close();
    }
}



