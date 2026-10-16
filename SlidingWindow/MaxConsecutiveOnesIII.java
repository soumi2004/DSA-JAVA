
package SlidingWindow;

public class MaxConsecutiveOnesIII {

    /*
     * Problem: LeetCode 1004
     * Logic:
     * 1. Expand window using right pointer.
     * 2. Count zeros inside the window.
     * 3. If zeros > k, move left pointer.
     * 4. Update maximum window length.
     */

    public static int longestOnes(int[] nums, int k) {
        int left = 0;
        int zeros = 0;
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] == 0) {
                zeros++;
            }

            while (zeros > k) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }

            int len = right - left + 1;
            maxLen = Math.max(maxLen, len);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;

        System.out.println(longestOnes(nums, k));
    }
}

