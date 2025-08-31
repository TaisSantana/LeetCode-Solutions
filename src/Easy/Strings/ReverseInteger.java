package Easy.Strings;

/*
Problem 7 - Reverse Integer
https://leetcode.com/problems/reverse-integer/

Description:
Given a 32-bit signed integer, reverse digits of an integer.
If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], return 0.

Solution:
- Convert the integer to a string.
- Handle negative numbers separately.
- Reverse the characters of the string.
- Convert the reversed string back to integer.
- Use try-catch to handle integer overflow; return 0 if the reversed integer is out of bounds.

Time Complexity: O(n) – n is the number of digits in the integer.
Space Complexity: O(n) – for the character array.

Example:
Input: x = 123
Output: 321

*/
public class ReverseInteger {
        public int reverse(int x) {

            String str = Integer.toString(x);

            boolean isNegative = x < 0;
            if (isNegative) {
                str = str.substring(1);
            }

            char[] charArray = str.toCharArray();

            int lastElementPosition = charArray.length - 1;

            for (int i=0; i < charArray.length/2; i++){
                char temp = charArray[lastElementPosition - i];
                charArray[lastElementPosition - i] = charArray[i];
                charArray[i] = temp;
            }

            String reversedStr = new String(charArray);

            if (isNegative) {
                reversedStr = "-" + reversedStr;
            }

            try {
                return Integer.parseInt(reversedStr);
            } catch (NumberFormatException e) {
                // Se o número revertido for muito grande para um int, retorna 0
                return 0;
            }
        }

    public static void main(String[] args) {
        ReverseInteger sol = new ReverseInteger();

        int[] testCases = {123, -123, 120, 1534236469, -2147483648};

        for (int x : testCases) {
            int reversed = sol.reverse(x);
            System.out.println("Input: " + x + " -> Reversed: " + reversed);
        }
    }

}
