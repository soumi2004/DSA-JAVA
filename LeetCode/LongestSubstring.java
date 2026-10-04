package LeetCode;

/*
 Set stores characters currently inside the window
 right → expand
 left  → shrink
 HashSet → remember characters
 Left pointer shrink the window
 Right pointer expands the window
 */

import java.util.HashSet;
import java.util.Scanner;

public class LongestSubstring {

    static int lengthOfLongestSubstring(String s) {

        
        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        
        for (int right = 0; right < s.length(); right++) {

            // If duplicate exists, shrink window
            while (set.contains(s.charAt(right))) {

                set.remove(s.charAt(left));
                left++;
            }

            // Add current character
            set.add(s.charAt(right));

            // Calculate current window length
            int currentLength = right - left + 1;

            // Update maximum
            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int result = lengthOfLongestSubstring(s);

        System.out.println("Longest substring length: " + result);

        sc.close();
    }
}