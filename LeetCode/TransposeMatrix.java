/*
    LeetCode 867 - Transpose Matrix

    Main idea:
    Transpose = ROW becomes COLUMN
                COLUMN becomes ROW

    i = row
    j = column

    Original:
    1  2  3
    4  5  6

    Transpose:
    1  4
    2  5
    3  6

    Important formula:

    result[j][i] = matrix[i][j];

    Just SWAP i and j.

    Original size:
    rows × columns

    Transpose size:
    columns × rows
*/

package LeetCode;

import java.util.*;

public class TransposeMatrix {

    public static int[][] transpose(int[][] matrix) {

        // Number of rows in original matrix
        int rows = matrix.length;

        // Number of columns in original matrix
        int cols = matrix[0].length;

        // After transpose:
        // rows become columns
        // columns become rows
        int[][] result = new int[cols][rows];

        // Go through every row
        for (int i = 0; i < rows; i++) {

            // Go through every column
            for (int j = 0; j < cols; j++) {

                // Swap row and column
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    public static void main(String[] args) {

        // Original matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Call transpose method
        int[][] answer = transpose(matrix);

        // Print the transposed matrix
        for (int i = 0; i < answer.length; i++) {
            System.out.println(Arrays.toString(answer[i]));
        }
    }
}
