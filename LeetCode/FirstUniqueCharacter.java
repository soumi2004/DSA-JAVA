package LeetCode;

import java.util.*;
public class FirstUniqueCharacter {
    
    public static int firstUniqChar(String s) {

        // Array for a-z
        int[] count = new int[26];

        // STEP 1: Count characters
        for (int i = 0; i < s.length(); i++) {

            count[s.charAt(i) - 'a']++;
        }

        // STEP 2: Find first character with count 1
        for (int i = 0; i < s.length(); i++) {

            if (count[s.charAt(i) - 'a'] == 1) {

                return i;
            }
        }

        // No unique character
        return -1;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int result = firstUniqChar(s);

        System.out.println("First unique character index: " + result);

        sc.close();
    }
}
