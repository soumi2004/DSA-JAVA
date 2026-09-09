package LeetCode;

import java.util.*;

public class PascalTriangle {

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {

                // First and last element
                if (j == 0 || j == i) {
                    row.add(1);
                }

                // Middle element
                else {
                    int value = triangle.get(i - 1).get(j - 1)
                              + triangle.get(i - 1).get(j);

                    row.add(value);
                }
            }

            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {

        int numRows = 5;

        List<List<Integer>> result = generate(numRows);

        System.out.println(result);
    }
}
