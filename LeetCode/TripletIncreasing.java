package LeetCode;

import java.util.*;

public class TripletIncreasing {

    public static boolean increasingTriplet(int[] nums) {

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] <= first) {
                first = nums[i];
            }
            else if (nums[i] <= second) {
                second = nums[i];
            }
            else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        boolean result = increasingTriplet(nums);

        System.out.println("Increasing triplet exists: " + result);

        sc.close();
    }
}
