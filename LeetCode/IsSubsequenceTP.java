package LeetCode;

import java.util.Scanner;

public class IsSubsequenceTP {
    
      public static boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string s: ");
        String s = sc.nextLine();

        System.out.print("Enter String t: ");
        String t = sc.nextLine();

        System.out.println(isSubsequence(s,t));

        sc.close();

    }

}
