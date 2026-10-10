package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class StringCompression {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char[] chars = input.toCharArray();

        int length = compress(chars);

        System.out.println("Compressed array: "
                + Arrays.toString(Arrays.copyOf(chars, length)));

        System.out.println("Compressed string: "
                + new String(chars, 0, length));

        System.out.println("Compressed length: " + length);

        sc.close();
    }

    static int compress(char[] chars) {

        int index = 0;
        int i = 0;

        while (i < chars.length) {

            char current = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == current) {
                count++;
                i++;
            }

            chars[index] = current;
            index++;

            if (count > 1) {
                String number = String.valueOf(count);

                for (int j = 0; j < number.length(); j++) {
                    chars[index] = number.charAt(j);
                    index++;
                }
            }
        }

        return index;
    }
}
