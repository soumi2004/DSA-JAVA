package LeetCode;

import java.util.Scanner;

public class CharacterReplacement {

    public static int characterReplacement(String s, int k) {

        int[] count = new int[26];

        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        // Expand window using right
        for (int right = 0; right < s.length(); right++) {

            // Convert character A-Z to index 0-25
            int index = s.charAt(right) - 'A';
            count[index]++;

            // Update most frequent character
            maxFreq = Math.max(maxFreq, count[index]);

           
            while ((right - left + 1) - maxFreq > k) {

                int leftIndex = s.charAt(left) - 'A';

                count[leftIndex]--;

                left++;
            }

            // Current window length
            int currentLength = right - left + 1;

            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string (uppercase): ");
        String s = sc.nextLine();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int result = characterReplacement(s, k);

        System.out.println("Longest length: " + result);

        sc.close();
    }
}