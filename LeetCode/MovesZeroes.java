package LeetCode;

public class MovesZeroes {

    public static void moveZeroes(int[] nums) {

        int j = 0;

        // Put all non-zero elements at the front
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        // Put zeroes at the end
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};

        moveZeroes(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}