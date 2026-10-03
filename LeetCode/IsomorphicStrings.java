package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class IsomorphicStrings {

    static boolean isIsomorphic(String s, String t) {

        // Two arrays for mapping in both directions
        int[] sMap = new int[256];
        int[] tMap = new int[256];

        // -1 means no character is mapped yet
        Arrays.fill(sMap, -1);
        Arrays.fill(tMap, -1);

        // Check every character
        for (int i = 0; i < s.length(); i++) {

            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // Check s -> t mapping
            if (sMap[sChar] != -1 && sMap[sChar] != tChar) {
                return false;
            }

            // Check t -> s mapping
            if (tMap[tChar] != -1 && tMap[tChar] != sChar) {
                return false;
            }

            // Store mapping
            sMap[sChar] = tChar;
            tMap[tChar] = sChar;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        boolean result = isIsomorphic(s, t);

        System.out.println("Isomorphic: " + result);

        sc.close();
    }
}