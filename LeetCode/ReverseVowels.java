package LeetCode;

import java.util.Scanner;

public class ReverseVowels {

    // Check whether a character is a vowel
    static boolean isVowel(char ch) {

        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' ||
               ch == 'O' || ch == 'U';
    }

    static String reverseVowels(String s) {

        // Convert String into character array
        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        // Two pointer approach
        while (left < right) {

            // Left is not a vowel
            if (!isVowel(arr[left])) {
                left++;
            }

            // Right is not a vowel
            else if (!isVowel(arr[right])) {
                right--;
            }

            // Both are vowels
            else {

                // Swap
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        // Convert char[] back to String
        return new String(arr);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String result = reverseVowels(s);

        System.out.println("After reversing vowels: " + result);

        sc.close();
    }
}
