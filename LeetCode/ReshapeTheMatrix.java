package LeetCode;

import java.util.*;

public class ReshapeTheMatrix {

    /*
        LeetCode 566 - Reshape the Matrix

        --------------------------------

        INDEX MAPPING:

        newRow = index / newColumns

        newCol = index % newColumns

        --------------------------------
          
        CONSTRAINTS:

    m = number of rows in original matrix
    n = number of columns in original matrix

    r = number of rows in new matrix
    c = number of columns in new matrix


    Important:

    Original elements:
    m × n

    New elements:
    r × c

    Reshape is possible ONLY when:

    m × n == r × c
    */

    public static int[][] matrixReshape(int[][] mat, int r, int c) {

        // Original number of rows
        int rows = mat.length;

        // Original number of columns
        int cols = mat[0].length;

        // Check if reshaping is possible
        // Both matrices must have the same number of elements
        if (rows * cols != r * c) {
            return mat;
        }

        // Create new matrix with requested size
        int[][] result = new int[r][c];

        // Go through every element using one index
        for (int index = 0; index < rows * cols; index++) {

            // Find original row
            int oldRow = index / cols;

            // Find original column
            int oldCol = index % cols;

            // Find new row
            int newRow = index / c;

            // Find new column
            int newCol = index % c;

            // Put old value into new position
            result[newRow][newCol] = mat[oldRow][oldCol];
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // New size 
        int r = 3;
        int c = 2;

        // Reshape the matrix
        int[][] answer = matrixReshape(mat, r, c);

        for (int i = 0; i < answer.length; i++) {
            System.out.println(Arrays.toString(answer[i]));
        }
    }
}