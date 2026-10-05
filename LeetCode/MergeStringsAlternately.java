package LeetCode;

import java.util.Scanner;

public class MergeStringsAlternately {

    public static String mergeAlternately(String word1, String word2) {

        StringBuilder sb = new StringBuilder();

        int i = 0;
        int j = 0;

        // Take characters alternately
        while (i < word1.length() && j < word2.length()) {

            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));

            i++;
            j++;
        }

        // Add remaining characters from word1
        while (i < word1.length()) {
           sb.append(word1.charAt(i));
            i++;
        }

        // Add remaining characters from word2
        while (j < word2.length()) {
            sb.append(word2.charAt(j));
            j++;
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String word1 = sc.nextLine();

        System.out.print("Enter second word: ");
        String word2 = sc.nextLine();

        String result = mergeAlternately(word1, word2);

        System.out.println("Merged string: " + result);

        sc.close();
    }
}