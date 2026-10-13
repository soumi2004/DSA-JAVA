package LeetCode;


import java.util.Scanner;

public class FindPivotIndex {

    public static int pivotIndex(int[] nums) {
        int totalSum = 0;

        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }

        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int result = pivotIndex(nums);

        System.out.println("Pivot index: " + result);

        sc.close();
    }
}

