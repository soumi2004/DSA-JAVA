package LeetCode;
import java.util.*;


public class PascalTriangleII {

    public static List<Integer> getRow(int rowIndex) {

        // We only store ONE row
        List<Integer> row = new ArrayList<>();

        // First value is always 1
        row.add(1);

        // Build the required row
        for (int i = 1; i <= rowIndex; i++) {

            // Every row ends with 1
            row.add(1);

            // Calculate middle values from RIGHT to LEFT
            for (int j = i - 1; j > 0; j--) {

             // Current value = current value + left value
                //
                // Example:
                // [1, 2, 1, 1]
                //
                // j = 2 → 1 + 2 = 3
                // j = 1 → 2 + 1 = 3
                //
                // Result → [1, 3, 3, 1]

                row.set(j, row.get(j) + row.get(j - 1)); // row.get(j) - current value , row.get(j-1) - previous value/left value
            }
        }

        return row;
    }

    public static void main(String[] args) {

        // Row we want
        int rowIndex = 3;

        // Call getRow()
        List<Integer> answer = getRow(rowIndex);

        // Print answer
        System.out.println(answer);
    }
}