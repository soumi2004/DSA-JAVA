package LeetCode;

import java.util.Scanner;

/*
     * LEETCODE #242 - VALID ANAGRAM
     *
     * Pattern:
     * Character Frequency
     *
     * Two strings are anagrams if they contain:
     * - Same characters
     * - Same frequency
     *
     * Order does NOT matter.
     *
     *
     */

public class ValidAnagram {
     public static boolean isAnagram(String s, String t) {

        // Different lengths cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // 26 positions for a-z
        int[] count = new int[26];

        // Add characters from s
        // Subtract characters from t
        for (int i = 0; i < s.length(); i++) {

            count[s.charAt(i) - 'a']++;

            count[t.charAt(i) - 'a']--;
        }

        // Check whether everything cancelled to zero
        for (int num : count) {

            if (num != 0) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        boolean result = isAnagram(s, t);

        System.out.println("Are they anagrams? " + result);

        sc.close();
    }
}
