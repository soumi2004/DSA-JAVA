package LeetCode;

public class FirstOccurrence {
        public static int strStr(String haystack, String needle) {

        // Empty needle
        if (needle.length() == 0) {
            return 0;
        }

        // Try every possible starting position
        for (int i = 0;
             i <= haystack.length() - needle.length();
             i++) {

            boolean match = true;

            // Compare needle with haystack
            for (int j = 0; j < needle.length(); j++) {

                if (haystack.charAt(i + j) != needle.charAt(j)) {

                    match = false;
                    break;
                }
            }

            // Entire needle matched
            if (match) {
                return i;
            }
        }

        // Needle not found
        return -1;
    }


    public static void main(String[] args) {

        String haystack = "sadbutsad";
        String needle = "sad";

        int result = strStr(haystack, needle);

        System.out.println("Answer: [" + result + "]");
    }
}