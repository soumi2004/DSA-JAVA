package LeetCode;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        String first = strs[0];

        for (int i = 0; i < first.length(); i++) {

            for (int j = 1; j < strs.length; j++) {

                if (i >= strs[j].length() ||
                    strs[j].charAt(i) != first.charAt(i)) {

                    return first.substring(0, i);
                }
            }
        }

        return first;
    }

    public static void main(String[] args) {

       String[] strs = {"flower", "flow", "flight"};

        String result = longestCommonPrefix(strs);

        System.out.println("Answer: [" + result + "]");
    }
}