package SlidingWindow;

import java.util.Scanner;

public class MaximumAverageSubarrayI {

    public static double findMaxAverage(int[] nums, int k) {
        int windowSum = 0;

        // Calculate the first window sum
        for (int i = 0; i < k; i++) {
            windowSum = windowSum + nums[i];
        }

        int maxSum = windowSum;

        // Slide the window
        for (int i = k; i < nums.length; i++) {
            windowSum = windowSum - nums[i - k] + nums[i];

            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
        }

        return (double) maxSum / k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        if (k < 1 || k > n) {
            System.out.println("Invalid k value.");
        } else {
            double result = findMaxAverage(nums, k);
            System.out.println("Maximum average: " + result);
        }

        sc.close();
    }
}

