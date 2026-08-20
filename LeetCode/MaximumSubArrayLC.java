package LeetCode;

public class MaximumSubArrayLC {
    

    public static int maxSubArray(int[] nums) {

        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            currentSum = Math.max(nums[i], currentSum + nums[i]); // nums[i] - start a fresh new subArray  (currentSum + nums[i]) - Continue my previous subarray  if (nums[i] > (currentSum + nums[i])) then start fresh subarray with nums[i]

            maxSum = Math.max(maxSum, currentSum); // new maximum or continue compare between maxSum and currentSum this decide the bigger sum
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println(maxSubArray(nums));
    }

}
