package LeetCode;

import java.util.Scanner;

public class PalindromicSubstrings {

    public static int countSubstrings(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            // Odd-length palindromes
            count += expandAroundCenter(s, i, i);

            // Even-length palindromes
            count += expandAroundCenter(s, i, i + 1);
        }

        return count;
    }

    static int expandAroundCenter(String s, int left, int right) {

        int count = 0;

        while (left >= 0 &&
               right < s.length() &&
               s.charAt(left) == s.charAt(right)) {

            count++;

            left--;
            right++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int result = countSubstrings(s);

        System.out.println("Number of palindromic substrings: " + result);

        sc.close();
    }
}
