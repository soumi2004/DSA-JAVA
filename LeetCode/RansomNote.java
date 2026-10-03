package LeetCode;

import java.util.Scanner;

public class RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine) {

        // Create frequency array for 26 lowercase letters
        int[] count = new int[26];

        // Count characters in magazine
        for (int i = 0; i < magazine.length(); i++) {
            count[magazine.charAt(i) - 'a']++;
        }

        // Use characters for ransomNote
        for (int i = 0; i < ransomNote.length(); i++) {

            int index = ransomNote.charAt(i) - 'a';

            // Character is not available
            if (count[index] == 0) {
                return false;
            }

            // Use one character
            count[index]--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ransom note: ");
        String ransomNote = sc.nextLine();

        System.out.print("Enter magazine: ");
        String magazine = sc.nextLine();

        boolean result = canConstruct(ransomNote, magazine);

        System.out.println("Can construct: " + result);

        sc.close();
    }
}
