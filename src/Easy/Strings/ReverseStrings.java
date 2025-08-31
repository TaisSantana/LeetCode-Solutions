package Easy.Strings;

/*
Problem 344 - Reverse String

https://leetcode.com/problems/reverse-string

Description:
Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.

Solution:
- This method reverses the string by using a single-pointer loop to perform an in-place swap of characters.
- The loop iterates from the beginning of the array (i = 0) up to the middle (i < s.length / 2).
- In each iteration, the character at the current index i is swapped with the character at the corresponding mirrored position from the end of the array, calculated as s.length - 1 - i.
- A temporary variable is used to store one of the characters during the swap to prevent data loss.
- Time complexity: O(n)
- Space complexity: O(1)

*/
public class ReverseStrings {

    public void reverseString(char[] s) {

        int lastElementPosition = s.length - 1;

        for (int i=0; i < s.length/2; i++){
            char temp = s[lastElementPosition - i];
            s[lastElementPosition - i] = s[i];
            s[i] = temp;

        }

    }

    public static void main(String[] args) {
        ReverseStrings solution = new ReverseStrings();
        char[] s = {'h','e','l','l','o'};
        System.out.println(s);
        solution.reverseString(s);
        System.out.println(s);
    }

}
