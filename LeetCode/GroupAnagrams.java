package LeetCode;

import java.util.*;

public class GroupAnagrams {

    // ⭐ LeetCode-style method
    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {

            // Convert String to char array
            char[] chars = word.toCharArray();

            // Sort characters
            Arrays.sort(chars);

            // Sorted word becomes the key
            String key = new String(chars);

            // Create group if key doesn't exist
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // Add original word to its group
            map.get(key).add(word);
        }

        // Return all groups
        return new ArrayList<>(map.values());
    }


    // ⭐ VS Code testing part
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();

        String[] strs = new String[n];

        System.out.println("Enter " + n + " words:");

        for (int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }

        // Call the LeetCode-style method
        List<List<String>> result = groupAnagrams(strs);

        System.out.println("Grouped Anagrams: " + result);

        sc.close();
    }
}