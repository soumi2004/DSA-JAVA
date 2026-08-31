package LeetCode;

import java.util.*;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Put all numbers into HashSet
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]); // add all the numbers into HashSet - its quickly check wheather a number exsits
        }

        int longest = 0;

        // Find sequence starts
        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];

            if (!set.contains(num - 1)) { // if the previous number does not exist this is the start if exist skip

                int current = num;
                int count = 1;

                while (set.contains(current + 1)) { // if the next number exsit
                    current++;
                    count++;
                }

                longest = Math.max(longest, count); // longest = best sequence found , count = current sequence length
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        int[] nums = {100, 4, 200, 1, 3, 2};

        System.out.println(longestConsecutive(nums));
    }
}