package LeetCode;

import java.util.*;

public class WordsReverse {

    public static String reverseWords(String s) {

        String[] words = s.trim().split("\\s+");

        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {

            result += words[i];

            if (i != 0) {
                result += " ";
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();

        String result = reverseWords(s);

        System.out.println("Reversed words: " + result);

        sc.close();
    }
}