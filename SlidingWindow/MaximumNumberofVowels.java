package SlidingWindow;

import java.util.Scanner;

public class MaximumNumberofVowels {

    public static int maxVowels(String s, int k) {
        int count = 0;

        // Count vowels in the first window
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }

        int maxVowels = count;

        // Slide the window
        for (int i = k; i < s.length(); i++) {

            // Remove the character leaving the window
            if (isVowel(s.charAt(i - k))) {
                count--;
            }

            // Add the character entering the window
            if (isVowel(s.charAt(i))) {
                count++;
            }

            if (count > maxVowels) {
                maxVowels = count;
            }

            if (maxVowels == k) {
                return k;
            }
        }

        return maxVowels;
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        if (k < 1 || k > s.length()) {
            System.out.println("Invalid k value.");
        } else {
            int result = maxVowels(s, k);
            System.out.println("Maximum number of vowels: " + result);
        }

        sc.close();
    }
}
