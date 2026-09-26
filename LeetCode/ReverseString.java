package LeetCode;

public class ReverseString {
     public static void reverseString(char[] s) {

        // Two pointers:
        // left starts from begining
        // right starts from end

        int left = 0;
        int right = s.length - 1;

    // repeat untill the pointers meet

        while(left < right){

            // swap characters

            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // move pointers inward

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
         reverseString(s);

         System.out.println(s);
    }
}
